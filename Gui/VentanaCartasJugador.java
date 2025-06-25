package gui;


import dominio.*;
import factory.FabricaCartasJuego;
import builder.*;

import javax.swing.*;
import java.awt.*;
import java.util.List;

// Ventana que representa visualmente una mano de cartas
public class VentanaCartasJugador extends JFrame {
    private JPanel panelCartas;

    public VentanaCartasJugador(String nombreJugador, Mano mano) {
        super("Cartas de " + nombreJugador);
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panelCartas = new JPanel();
        panelCartas.setLayout(new FlowLayout());
        add(panelCartas);

        mostrarCartas(mano.getCartas());
        setVisible(true);
    }

    // Muestra cartas en forma gráfica con texto e ícono
    private void mostrarCartas(List<Carta> cartas) {
        for (Carta carta : cartas) {
            JLabel label = new JLabel(formatoCarta(carta));
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            label.setFont(new Font("Monospaced", Font.BOLD, 16));
            label.setPreferredSize(new Dimension(80, 120));
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            panelCartas.add(label);
        }
    }

    // Devuelve una representación en texto de una carta
    private String formatoCarta(Carta carta) {
        String valor = carta.getValor().toString().substring(0, 1);
        String palo = switch (carta.getPalo()) {
            case CORAZONES -> "♥";
            case DIAMANTES -> "♦";
            case PICAS -> "♠";
            case TREBOLES -> "♣";
        };
        return "<html><div style='text-align:center;'>" + valor + "<br>" + palo + "</div></html>";
    }


    public static void main(String[] args) {
        FabricaCartasJuego fabrica = new FabricaCartasJuego();
        ConstructorMano constructor = new ConstructorManoAleatoria(fabrica);
        DirectorMano director = new DirectorMano(constructor);

        director.construirManoAleatoria();
        Mano mano = constructor.getResultado();

        new VentanaCartasJugador("Lucía", mano);
    }
} 