package guestionDeFicheros;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File directorioActual = File.listRoots()[0];
        int opcion = -2;

        do {
            System.out.println("Directorio actual: " + directorioActual.getAbsolutePath());

            File[] archivos = directorioActual.listFiles();

            if (directorioActual.getParentFile() != null) {
                System.out.println("0. Ir al directorio padre");
            } else {
                System.out.println("0. (No hay directorio padre)");
            }

            if (archivos != null) {
                for (int i = 0; i < archivos.length; i++) {
                    String tipo = archivos[i].isDirectory() ? "<directorio>" : archivos[i].length() + " bytes";
                    System.out.println((i + 1) + ". " + archivos[i].getName() + " - " + tipo);
                }
            } else {
                System.out.println("No se puede acceder este directorio");
            }

            System.out.print("Introduce una opcion (-1 para salir): ");
            try {
                opcion = Integer.parseInt(scanner.nextLine());

                if (opcion == -1) {
                    System.out.println("Saliendo del explorador de directorios...");
                } else if (opcion == 0) {
                    File directorioPadre = directorioActual.getParentFile();
                    if (directorioPadre != null) {
                        directorioActual = directorioPadre;
                    } else {
                        System.out.println("Ya estas en el directorio raiz.");
                    }
                } else if (archivos != null && opcion > 0 && opcion <= archivos.length) {
                    File res = archivos[opcion - 1];
                    if (res.isDirectory()) {
                        if (res.canRead()) {
                            directorioActual = res;
                        } else {
                            System.out.println("No tienes permisos.");
                        }
                    } else {
                        System.out.println("Has seleccionado un archivo, no un directorio.");
                    }
                } else {
                    System.out.println("Opción invalida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número válido.");
            }

        } while (opcion != -1);

        scanner.close();
    }
}