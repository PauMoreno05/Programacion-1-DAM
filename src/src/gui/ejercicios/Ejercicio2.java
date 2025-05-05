package gui.ejercicios;

import javax.swing.*;

public class Ejercicio2{
    public static void main(String[] args) {
        JFrame ventana1 = new JFrame("Principal");;
        JScrollPane scroll = new JScrollPane();
        JTextArea texto = new JTextArea();


        ventana1.setSize(300, 300);
        ventana1.setResizable(true);
        ventana1.setLocationRelativeTo(ventana1);
        ventana1.setVisible(true);
        ventana1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana1.add(scroll);
        ventana1.add(texto);

        while (true) {
            String introduccion = JOptionPane.showInputDialog(ventana1, "introduce Texto", "Entrada de texto");
            if (introduccion.equals("FIN")){
                break;
            }else {
                texto.append(introduccion + "\n");
            }

        }
    }

}
