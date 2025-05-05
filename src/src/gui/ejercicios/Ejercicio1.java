package gui.ejercicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio1{
    public static void main(String[] args) {
        JFrame prueba = new JFrame("Principal");
        JFrame prueba2 = new JFrame("Secundaria");
        prueba.setSize(300, 200);
        prueba.setResizable(true);
        prueba.setLocationRelativeTo(null);
        prueba.setVisible(true);
        prueba.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        prueba.setLocationRelativeTo(null);

        prueba2.setSize(300, 200);
        prueba2.setResizable(true);
        prueba2.setLocationRelativeTo(null);
        prueba2.setLocationRelativeTo(null);


        JButton boton = new JButton("Abrir ventana secundaria");
        boton.setVisible(true);
        prueba.add(boton);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prueba2.setVisible(true);

            }

        });
        JTextField texto = new JTextField("Esta es la ventana secundaria");
        prueba2.add(texto);
    }

}
