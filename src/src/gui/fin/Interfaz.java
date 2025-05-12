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
        GridLayout panel0 = new GridLayout(3, 1);

        mainMenu.setSize(800, 300);
        mainMenu.setResizable(true);
        mainMenu.setVisible(true);
        mainMenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainMenu.setLayout(new GridLayout(3, 4, 25, 25));

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
                GridLayout panel1 = new GridLayout(5, 1);
                JButton salir = new JButton("Salir");

                venLibMain.setSize(800, 300);
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
                salir.setForeground(Color.white);

                listarLib.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        venLibMain.setVisible(false);

                        JFrame listarVentana = new JFrame("Lista de Libros");
                        listarVentana.setSize(800, 400);
                        listarVentana.setLocationRelativeTo(venLibMain);

                        String[] columnas = {"ISBN", "Título", "Autor", "Editorial", "Año de Publicación", "Stock"};

                        // Datos de prueba
                        String[][] data = {
                                {"123456789", "Libro Prueba", "Autor Prueba", "Editorial Prueba", "2025", "10"},
                                {"987654321", "Otro Libro", "Otro Autor", "Otra Editorial", "2023", "5"}
                        };

                        JTable tabla = new JTable(data, columnas);
                        JScrollPane scrollPane = new JScrollPane(tabla);

                        listarVentana.add(scrollPane);
                        listarVentana.setVisible(true);

                        listarVentana.addWindowListener(new java.awt.event.WindowAdapter() {
                            @Override
                            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                                listarVentana.setVisible(false);
                                venLibMain.setVisible(true);
                            }
                        });
                    }
                });

                //Añadir libro
                agregarLib.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
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

                        agregarLibro.setSize(800, 300);
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
                        agregarLibro.add(enviar);
                        agregarLibro.add(salir);
                        salir.setBackground(new Color(110, 31, 14));
                        salir.setForeground(Color.white);
                        enviar.setBackground(new Color(37, 82, 19));
                        enviar.setForeground(Color.white);

                        enviar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String resISBN = isbn.getText();
                                String resTitulo = titulo.getText();
                                String resAutor = autor.getText();
                                String resEditorial = editorial.getText();
                                int resAno = Integer.parseInt(anoPub.getText());
                                int resStock = Integer.parseInt(stock.getText());
                                Libros.agregarLibro(resISBN, resTitulo, resAutor, resEditorial, resAno, resStock);
                            }
                        });

                        salir.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                agregarLibro.setVisible(false);
                                venLibMain.setVisible(true);

                            }
                        });
                    }
                });

                //Eliminar libros
                eliminarLib.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        venLibMain.setVisible(false);

                        JFrame eliminarLibro = new JFrame("Eliminar Libro");
                        GridLayout panel12 = new GridLayout(3, 1);
                        JTextField isbn = new JTextField("Introduce el ISBN del libro que deseas eliminar",50);
                        JButton salir = new JButton("Salir");
                        JButton eliminar = new JButton("Eliminar");

                        eliminarLibro.setSize(800, 300);
                        eliminarLibro.setResizable(true);
                        eliminarLibro.setLocationRelativeTo(venLibMain);
                        eliminarLibro.setLayout(panel12);
                        eliminarLibro.add(isbn);
                        eliminarLibro.add(eliminar);
                        eliminarLibro.add(salir);
                        salir.setBackground(new Color(110, 31, 14));
                        salir.setForeground(Color.white);
                        eliminar.setBackground(new Color(37, 82, 19));
                        eliminar.setForeground(Color.white);
                        eliminarLibro.setVisible(true);

                        eliminar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String resISBN = isbn.getText();
                                Libros.eliminarLibro(resISBN);
                            }
                        });

                        salir.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                eliminarLibro.setVisible(false);
                                venLibMain.setVisible(true);

                            }
                        });
                    }
                });

                //Actualizar Libro
                cambiarLib.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        venLibMain.setVisible(false);

                        JFrame cambiarLibro = new JFrame("Eliminar Libro");
                        GridLayout panel12 = new GridLayout(4, 1);
                        JTextField isbn = new JTextField("Introduce el ISBN del libro que deseas cambiar el titulo",50);
                        JTextField titulo = new JTextField("Escribe el nuevo titulo de la pelicula",50);
                        JButton salir = new JButton("Salir");
                        JButton actualizar = new JButton("Actualizar");

                        cambiarLibro.setSize(800, 300);
                        cambiarLibro.setResizable(true);
                        cambiarLibro.setLocationRelativeTo(venLibMain);
                        cambiarLibro.setLayout(panel12);
                        cambiarLibro.add(isbn);
                        cambiarLibro.add(titulo);
                        cambiarLibro.add(actualizar);
                        cambiarLibro.add(salir);
                        salir.setBackground(new Color(110, 31, 14));
                        salir.setForeground(Color.white);
                        actualizar.setBackground(new Color(37, 82, 19));
                        actualizar.setForeground(Color.white);
                        cambiarLibro.setVisible(true);

                        actualizar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String resISBN = isbn.getText();
                                String resTitulo = titulo.getText();
                                Libros.actualizarLibro(resISBN, resTitulo);
                            }
                        });

                        salir.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                cambiarLibro.setVisible(false);
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

                venCliMain.setSize(800, 300);
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
                salir.setForeground(Color.white);

                listarLib.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        venLibMain.setVisible(false);

                        JFrame listarVentana = new JFrame("Lista de Libros");
                        listarVentana.setSize(800, 400);
                        listarVentana.setLocationRelativeTo(venLibMain);

                        String[] columnas = {"ISBN", "Título", "Autor", "Editorial", "Año de Publicación", "Stock"};

                        // Datos de prueba
                        String[][] data = {
                                {"123456789", "Libro Prueba", "Autor Prueba", "Editorial Prueba", "2025", "10"},
                                {"987654321", "Otro Libro", "Otro Autor", "Otra Editorial", "2023", "5"}
                        };

                        JTable tabla = new JTable(data, columnas);
                        JScrollPane scrollPane = new JScrollPane(tabla);

                        listarVentana.add(scrollPane);
                        listarVentana.setVisible(true);

                        listarVentana.addWindowListener(new java.awt.event.WindowAdapter() {
                            @Override
                            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                                listarVentana.setVisible(false);
                                venLibMain.setVisible(true);
                            }
                        });
                    }
                });

                //Añadir libro
                agregarCli.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        venCliMain.setVisible(false);

                        JFrame agregarCliente = new JFrame("Agregar Cliente a la base de datos");
                        GridLayout panel13 = new GridLayout(8, 1);
                        JTextField dni = new JTextField("Introduce el DNI",50);
                        JTextField nombre = new JTextField("Introduce el Nombre del Cliente",50);
                        JTextField apellidos = new JTextField("Introduce los apellidos del CLiente",50);
                        JTextField cp = new JTextField("Introduce el Codigo Postal",50);
                        JTextField edad = new JTextField("Introduce la edad del Cliente",40);
                        JTextField compras = new JTextField("Introduce el numerod de compras realizdas",20);
                        JButton salir = new JButton("Salir");
                        JButton enviar = new JButton("Enviar");

                        agregarCliente.setSize(800, 300);
                        agregarCliente.setResizable(true);
                        agregarCliente.setLocationRelativeTo(venCliMain);
                        agregarCliente.setVisible(true);
                        agregarCliente.setLayout(panel13);
                        agregarCliente.add(dni);
                        agregarCliente.add(nombre);
                        agregarCliente.add(apellidos);
                        agregarCliente.add(cp);
                        agregarCliente.add(edad);
                        agregarCliente.add(compras);
                        agregarCliente.add(enviar);
                        agregarCliente.add(salir);
                        salir.setBackground(new Color(110, 31, 14));
                        salir.setForeground(Color.white);
                        enviar.setBackground(new Color(37, 82, 19));
                        enviar.setForeground(Color.white);

                        enviar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String resDNI = dni.getText();
                                String resNombre = nombre.getText();
                                String resApellidos = apellidos.getText();
                                int resCP = Integer.parseInt(cp.getText());
                                int resEdad = Integer.parseInt(edad.getText());
                                int resCompras = Integer.parseInt(compras.getText());
                                Clientes.agregarCliente(resDNI, resNombre, resApellidos, resCP, resEdad, resCompras);
                            }
                        });

                        salir.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                agregarCliente.setVisible(false);
                                venLibMain.setVisible(true);

                            }
                        });
                    }
                });

                //Eliminar libros
                eliminarLib.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        venLibMain.setVisible(false);

                        JFrame eliminarLibro = new JFrame("Eliminar Libro");
                        GridLayout panel12 = new GridLayout(3, 1);
                        JTextField isbn = new JTextField("Introduce el ISBN del libro que deseas eliminar",50);
                        JButton salir = new JButton("Salir");
                        JButton eliminar = new JButton("Eliminar");

                        eliminarLibro.setSize(800, 300);
                        eliminarLibro.setResizable(true);
                        eliminarLibro.setLocationRelativeTo(venLibMain);
                        eliminarLibro.setLayout(panel12);
                        eliminarLibro.add(isbn);
                        eliminarLibro.add(eliminar);
                        eliminarLibro.add(salir);
                        salir.setBackground(new Color(110, 31, 14));
                        salir.setForeground(Color.white);
                        eliminar.setBackground(new Color(37, 82, 19));
                        eliminar.setForeground(Color.white);
                        eliminarLibro.setVisible(true);

                        eliminar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String resISBN = isbn.getText();
                                Libros.eliminarLibro(resISBN);
                            }
                        });

                        salir.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                eliminarLibro.setVisible(false);
                                venLibMain.setVisible(true);

                            }
                        });
                    }
                });

                //Actualizar Libro
                cambiarLib.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        venLibMain.setVisible(false);

                        JFrame cambiarLibro = new JFrame("Eliminar Libro");
                        GridLayout panel12 = new GridLayout(4, 1);
                        JTextField isbn = new JTextField("Introduce el ISBN del libro que deseas cambiar el titulo",50);
                        JTextField titulo = new JTextField("Escribe el nuevo titulo de la pelicula",50);
                        JButton salir = new JButton("Salir");
                        JButton actualizar = new JButton("Actualizar");

                        cambiarLibro.setSize(800, 300);
                        cambiarLibro.setResizable(true);
                        cambiarLibro.setLocationRelativeTo(venLibMain);
                        cambiarLibro.setLayout(panel12);
                        cambiarLibro.add(isbn);
                        cambiarLibro.add(titulo);
                        cambiarLibro.add(actualizar);
                        cambiarLibro.add(salir);
                        salir.setBackground(new Color(110, 31, 14));
                        salir.setForeground(Color.white);
                        actualizar.setBackground(new Color(37, 82, 19));
                        actualizar.setForeground(Color.white);
                        cambiarLibro.setVisible(true);

                        actualizar.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String resISBN = isbn.getText();
                                String resTitulo = titulo.getText();
                                Libros.actualizarLibro(resISBN, resTitulo);
                            }
                        });

                        salir.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                cambiarLibro.setVisible(false);
                                venLibMain.setVisible(true);

                            }
                        });
                    }
                });

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

                venComMain.setSize(800, 300);
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
                salir.setForeground(Color.white);

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
