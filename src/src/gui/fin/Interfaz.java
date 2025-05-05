package gui.fin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz {
    public static void main(String[] args) {

        JFrame mainMenu = new JFrame("Menu de Gestion de la Base de Datos (Libreria.db)");
        JButton gesLib = new JButton("Gestion de Libros");
        JButton gesCli = new JButton("Gestion de Clientes");
        JButton gesCom = new JButton("Gestion de Compras");
        GridLayout panel0 = new GridLayout(1, 3);

        mainMenu.setSize(300, 300);
        mainMenu.setResizable(true);
        mainMenu.setVisible(true);
        mainMenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainMenu.setLayout(panel0);
        mainMenu.add(gesLib);
        mainMenu.add(gesCli);
        mainMenu.add(gesCom);

        gesLib.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame venLibMain = new JFrame("Gestor de Libros");
                JButton listarLib = new JButton("Listar Libros");
                JButton agregarLib = new JButton("Añadir un nuevo Libro");
                JButton cambiarLib = new JButton("Cambiar tutulo por ISBN");
                JButton eliminarLib = new JButton("Eliminar Libro por su ISBN");
                GridLayout panel1 = new GridLayout(1, 5);
                JButton salir = new JButton("Salir");


                venLibMain.setSize(300, 300);
                venLibMain.setResizable(true);
                venLibMain.setLocationRelativeTo(mainMenu);
                venLibMain.setVisible(true);
                venLibMain.setLayout(panel1);
                venLibMain.add(listarLib);
                venLibMain.add(agregarLib);
                venLibMain.add(cambiarLib);
                venLibMain.add(eliminarLib);
                venLibMain.add(salir);
                salir.setBackground(new Color(110, 31, 14));

            }

        });
    }
}
