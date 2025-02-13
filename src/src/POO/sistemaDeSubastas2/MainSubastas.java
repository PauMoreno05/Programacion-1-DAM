package POO.sistemaDeSubastas2;

import java.util.Scanner;

public class MainSubastas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la fecha de la subasta: ");
        String fecha = scanner.nextLine();
        Subasta subasta = new Subasta(fecha);

        System.out.print("¿Cuántos lotes desea agregar? ");
        int numLotes = scanner.nextInt();
        for (int i = 0; i < numLotes; i++) {
            System.out.println("Lote" + (i + 1));
            System.out.print("Ingrese el número del lote: ");
            int numLote = scanner.nextInt();
            System.out.print("Ingrese el precio de salida del lote: ");
            double precioSalida = scanner.nextDouble();
            Lotes lote = new Lotes(numLote, precioSalida);

            System.out.print("Cuántos artículos tiene el lote? ");
            int numArticulos = scanner.nextInt();
            scanner.nextLine();
            for (int j = 0; j < numArticulos; j++) {
                System.out.print("Ingrese el nombre del artículo " + (j + 1) + ": ");
                String nombreArticulo = scanner.nextLine();
                System.out.print("Ingrese el precio del artículo " + (j + 1) + ": ");
                double precioArticulo = scanner.nextDouble();
                scanner.nextLine();
                Articulos articulo = new Articulos(nombreArticulo, precioArticulo);
                lote.addArticulo(articulo);
            }
            subasta.addLote(lote);
        }

        System.out.println("Inicio de las pujas:");
        for (Lotes lote : subasta.getLotes()) {
            System.out.println("Lote " + lote.getNumero() + " - Precio de salida: " + lote.getPrecioSalida());
            System.out.print("Cuántas pujas se realizarán para este lote? ");
            int numPujas = scanner.nextInt();
            scanner.nextLine();
            for (int k = 0; k < numPujas; k++) {
                System.out.print("Ingrese el nombre del pujador: ");
                String nombrePujador = scanner.nextLine();
                System.out.print("Ingrese la puja: ");
                double monto = scanner.nextDouble();
                scanner.nextLine();
                Pujadores puja = new Pujadores(nombrePujador, monto);
                lote.realizarPuja(puja);
            }
        }

        subasta.cerrarSubasta();

        subasta.imprimirResultados();

        scanner.close();
    }
}
