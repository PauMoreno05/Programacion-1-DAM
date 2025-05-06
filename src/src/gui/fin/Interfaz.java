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
                //Ventana de Libros
                mainMenu.setVisible(false);

                JFrame venLibMain = new JFrame("Gestor de Libros");
                JButton listarLib = new JButton("Listar Libros");
                JButton agregarLib = new JButton("Añadir un nuevo Libro");
                JButton cambiarLib = new JButton("Cambiar titulo por ISBN");
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

                listarLib.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        venLibMain.setVisible(false);
                        mainMenu.setVisible(true);
                    }
                });

                agregarLib.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //Añadir libro
                        venLibMain.setVisible(false);

                        JFrame agregarLibro = new JFrame("Agregar libro a la base de datos");
                        GridLayout panel12 = new GridLayout(8, 1);
                        JTextField isbn = new JTextField("Introduce el ISBN",50);
                        JTextField titulo = new JTextField("Introduce el titulo del Libro",50);
                        JTextField autor = new JTextField("Introduce el nombre del Autor",50);
                        JTextField editorial = new JTextField("Introduce la Editorial",50);
                        JTextField anoPub = new JTextField("Introduce el año de publicacion",40);
                        JTextField stock = new JTextField("Introduce el numero de Stock",20);
                        JButton salir = new JButton("Salir");
                        JButton enviar = new JButton("Enviar");

                        agregarLibro.setSize(300, 300);
                        agregarLibro.setResizable(true);
                        agregarLibro.setLocationRelativeTo(venLibMain);
                        agregarLibro.setVisible(true);
                        agregarLibro.setLayout(panel12);
                        agregarLibro.add(isbn);
                        agregarLibro.add(titulo);
                        agregarLibro.add(autor);
                        agregarLibro.add(editorial);
                        agregarLibro.add(anoPub);
                        agregarLibro.add(stock);
                        agregarLibro.add(salir);
                        salir.setBackground(new Color(110, 31, 14));

                        salir.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                agregarLibro.setVisible(false);
                                venLibMain.setVisible(true);
                            }
                        });
                    }
                });

                salir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        venLibMain.setVisible(false);
                        mainMenu.setVisible(true);
                    }
                });
            }
        });

        gesCli.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Ventana de Clientes
                mainMenu.setVisible(false);


                JFrame venCliMain = new JFrame("Gestor de Clientes");
                JButton listarCli = new JButton("Listar Clientes");
                JButton agregarCli = new JButton("Añadir un nuevo Clientes");
                JButton cambiarCLi = new JButton("Cambiar edad por DNI");
                JButton eliminarCli = new JButton("Eliminar cliente por su DNI");
                GridLayout panel2 = new GridLayout(1, 5);
                JButton salir = new JButton("Salir");

                venCliMain.setSize(300, 300);
                venCliMain.setResizable(true);
                venCliMain.setLocationRelativeTo(mainMenu);
                venCliMain.setVisible(true);
                venCliMain.setLayout(panel2);
                venCliMain.add(listarCli);
                venCliMain.add(agregarCli);
                venCliMain.add(cambiarCLi);
                venCliMain.add(eliminarCli);
                venCliMain.add(salir);
                salir.setBackground(new Color(110, 31, 14));

                salir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        venCliMain.setVisible(false);
                        mainMenu.setVisible(true);
                    }
                });

            }

        });

        gesCom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Ventana de Compras
                mainMenu.setVisible(false);


                JFrame venComMain = new JFrame("Gestor de Compras");
                JButton listarCom = new JButton("Listar Compras");
                JButton agregarCom = new JButton("Añadir una nueva Compra");
                JButton cambiarCom = new JButton("Cambiar producto por codigo");
                JButton eliminarCom = new JButton("Eliminar una compra por su codigo");
                GridLayout panel3 = new GridLayout(1, 5);
                JButton salir = new JButton("Salir");

                venComMain.setSize(300, 300);
                venComMain.setResizable(true);
                venComMain.setLocationRelativeTo(mainMenu);
                venComMain.setVisible(true);
                venComMain.setLayout(panel3);
                venComMain.add(listarCom);
                venComMain.add(agregarCom);
                venComMain.add(cambiarCom);
                venComMain.add(eliminarCom);
                venComMain.add(salir);
                salir.setBackground(new Color(110, 31, 14));

                salir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        venComMain.setVisible(false);
                        mainMenu.setVisible(true);
                    }
                });

            }

        });
    }
}
