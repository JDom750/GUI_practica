package unlu.com.ar.ventana;

import javax.swing.*;

public class Ventana {
    JFrame frame;

    public Ventana(){
        iniciarVentana();
    }
    private void iniciarVentana(){
        frame = new JFrame("Titulo de la ventana");
        frame.setSize(400,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel etiqueta1 = new JLabel("Hola mundo,desde swing");
        JPanel panelPrincipal = (JPanel) frame.getContentPane();
        panelPrincipal.add(etiqueta1);
        frame.setVisible(true);

    }
}
