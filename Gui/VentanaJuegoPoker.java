package gui;

import facade.FachadaJuegoPoker;
import juego.*;
import juego.Jugador;
import strategy.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class VentanaJuegoPoker extends JFrame {
    private MesaPoker mesa;
    private FachadaJuegoPoker fachada;
    private EstadisticasJuego estadisticas;
    private JTextArea areaEstado;

    public VentanaJuegoPoker() {
        super("Juego de Póker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());

        fachada = new FachadaJuegoPoker();
        mesa = new MesaPoker(5);
        estadisticas = new EstadisticasJuego();

        JPanel panelSuperior = crearPanelJugadores();
        JPanel panelCentro = crearPanelControles();
        JPanel panelInferior = crearPanelEstado();

        add(panelSuperior, BorderLayout.NORTH);
        add(panelCentro, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JPanel crearPanelJugadores() {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Mesa de Póker"));
        panel.setLayout(new GridLayout(1, 5));

        for (int i = 1; i <= 5; i++) {
            JButton asientoBtn = new JButton("Asiento " + i);
            int asientoIndex = i - 1;
            asientoBtn.addActionListener((ActionEvent e) -> {
                if (!mesa.getAsientos().get(asientoIndex).estaOcupado()) {
                    String nombre = JOptionPane.showInputDialog(this, "Nombre del jugador:");
                    if (nombre != null && !nombre.isEmpty()) {
                        Jugador jugador = new JugadorBasico(nombre);
                        mesa.getAsientos().get(asientoIndex).asignarJugador(jugador);
                        fachada.iniciarPartida(nombre);
                        actualizarEstado(nombre + " se ha sentado.");
                        asientoBtn.setText(nombre);
                        asientoBtn.setEnabled(false);
                    }
                }
            });
            panel.add(asientoBtn);
        }

        return panel;
    }

    private JPanel crearPanelControles() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3));

        JButton btnApostar = new JButton("Apostar");
        JButton btnIgualar = new JButton("Igualar");
        JButton btnRetirarse = new JButton("Retirarse");

        btnApostar.addActionListener(e -> realizarAccion("apostar"));
        btnIgualar.addActionListener(e -> realizarAccion("igualar"));
        btnRetirarse.addActionListener(e -> realizarAccion("retirarse"));

        panel.add(btnApostar);
        panel.add(btnIgualar);
        panel.add(btnRetirarse);

        return panel;
    }

    private JPanel crearPanelEstado() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        areaEstado = new JTextArea(6, 40);
        areaEstado.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaEstado);
        panel.add(scroll, BorderLayout.CENTER);

        return panel;
    }

    private void realizarAccion(String accion) {
        String jugador = JOptionPane.showInputDialog(this, "Nombre del jugador:");
        if (jugador == null || jugador.isEmpty()) return;

        switch (accion) {
            case "apostar" -> {
                String sCantidad = JOptionPane.showInputDialog(this, "Cantidad a apostar:");
                if (sCantidad != null) {
                    int cantidad = Integer.parseInt(sCantidad);
                    boolean exito = fachada.apostar(jugador, cantidad);
                    if (exito) {
                        estadisticas.registrarFichas(jugador, cantidad);
                        actualizarEstado(jugador + " apostó " + cantidad + " fichas.");
                    } else {
                        actualizarEstado(jugador + " no tiene fichas suficientes.");
                    }
                }
            }
            case "igualar" -> {
                int cantidad = fachada.consultarApuesta(jugador);
                fachada.igualar(jugador, cantidad);
                actualizarEstado(jugador + " igualó la apuesta de " + cantidad + " fichas.");
            }
            case "retirarse" -> {
                fachada.retirarse(jugador);
                actualizarEstado(jugador + " se retiró.");
            }
        }

        estadisticas.registrarRonda(jugador);
    }

    private void actualizarEstado(String mensaje) {
        areaEstado.append(mensaje + "\n");
    }
}
