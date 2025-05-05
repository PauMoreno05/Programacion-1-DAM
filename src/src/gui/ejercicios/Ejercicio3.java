package gui.ejercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ejercicio3{
    public static void main(String[] args) {
        JFrame mainWin = new JFrame("El Destructor");
        JButton caos = new JButton("Crea Caos");
        JButton limpiar = new JButton("Eliminar");
        JButton destruir = new JButton("Auto Destruir");
        GridLayout panel = new GridLayout(1, 2);
        ArrayList<JFrame> coockies = new ArrayList<>();

        int[] cont = {1};

        mainWin.setSize(300, 300);
        mainWin.setResizable(true);
        mainWin.setLocationRelativeTo(mainWin);
        mainWin.setVisible(true);
        mainWin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWin.setLayout(panel);
        mainWin.add(caos);
        mainWin.add(limpiar);

        caos.setBackground(new Color(218, 146, 35));
        limpiar.setBackground(new Color(41, 114, 11 ));
        destruir.setBackground(new Color(110, 31, 14));
        destruir.setForeground(Color.white);

        caos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame galletasX = new JFrame("Galleta" + cont[0]);;
                galletasX.setVisible(true);
                galletasX.setSize(300, 300);
                galletasX.setResizable(true);
                galletasX.add(destruir);
                galletasX.setLocationRelativeTo(mainWin);
                coockies.add(galletasX);
                cont[0]++;

            }

        });

        destruir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (JFrame j : coockies){
                    j.dispose();
                }
                coockies.clear();

            }

        });

        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!coockies.isEmpty()) {
                    coockies.getLast().dispose();
                    coockies.removeLast();
                }
            }

        });

    }

}

