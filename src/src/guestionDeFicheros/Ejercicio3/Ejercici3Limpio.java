package guestionDeFicheros.Ejercicio3;

import java.io.File;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ejercici3Limpio {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        File directorioActual = File.listRoots()[0];
        int sal = 1;
        int res = 0;

        while (sal != 0) {
            mostrarContenidoDirectorio(directorioActual);
            mostrarMenu();

            System.out.println("Introduce la opcion deseada: ");
            res = scanner.nextInt();

            if (res == 0) {
                directorioActual = directorioActual.getParentFile();
            } else if (res > 0 && res <= directorioActual.listFiles().length && directorioActual.listFiles()[res - 1].isDirectory()) {
                directorioActual = directorioActual.listFiles()[res - 1];
            } else if (res == -1) {
                System.out.println("Saliendo del programa...");
                sal = 0;
            } else if (res == -2) {
                cambiarPermisos(directorioActual);
            } else if (res == -3) {
                contarArchivosPorExtension(directorioActual);
            } else if (res == -4) {
                buscarArchivo(directorioActual);
            } else if (res == -5) {
                crearDirectorio(directorioActual);
            } else if (res == -6) {
                eliminarDirectorio(directorioActual);
            } else {
                System.out.println("Opcion no valida");
                break;
            }
        }

        scanner.close();
    }

    private static void mostrarContenidoDirectorio(File directorio) {
        System.out.println("Directorio actual: " + directorio.getAbsolutePath());
        File[] archivos = directorio.listFiles();

        DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.getDefault());

        if (archivos != null) {
            for (int i = 0; i < archivos.length; i++) {
                if (archivos[i].isDirectory()) {
                    System.out.print((i + 1) + " - " + archivos[i]);
                } else {
                    System.out.print("\t");
                }

                System.out.print(archivos[i].canRead() ? "r" : "-");
                System.out.print(archivos[i].canWrite() ? "w" : "-");
                System.out.print(archivos[i].canExecute() ? "x" : "-");

                System.out.println("\t" + archivos[i].length() + "\t" +
                        formatter.format(archivos[i].lastModified()) + "\t" +
                        archivos[i].getName());
            }
        }
        System.out.println("");
    }

    private static void mostrarMenu() {
        System.out.println("=====================");
        System.out.println("Opciones del programa");
        System.out.println("=====================");
        System.out.println("-1. Salir del programa");
        System.out.println("-2. Cambiar permisos del directorio que te encuentras");
        System.out.println("-3. Contar todos los archivos que hay en el directorio con la misma extension");
        System.out.println("-4. Buscar Archivos a partir del directorio actual");
        System.out.println("-5. Crea un directorio a partir del directorio actual");
        System.out.println("-6. Eliminar un directorio");
        System.out.println("<< Para acceder al directorio padre presione |0| y para finalizar el programa introduzca |-1|");
    }

    private static void cambiarPermisos(File directorio) {
        System.out.println("Que permiso deseas darle al directorio actual");
        System.out.println("1. De escritura");
        System.out.println("2. De lectura");
        System.out.println("3. De ejecucion");

        int res = scanner.nextInt();

        if (res == 1) {
            directorio.setWritable(true, false);
            System.out.println("Permiso de escritura concedido");
        } else if (res == 2) {
            directorio.setReadable(true, false);
            System.out.println("Permiso de lectura concedido");
        } else if (res == 3) {
            directorio.setExecutable(true, false);
            System.out.println("Permiso de ejecucion concedido");
        } else {
            System.out.println("Opción no válida");
        }
    }

    private static void contarArchivosPorExtension(File directorio) {
        File[] archivos = directorio.listFiles();
        int cont = 0;

        System.out.println("Que extension deseas contar");
        String extension = scanner.next();

        for (int i = 0; i < archivos.length; i++) {
            if (archivos[i].getName().endsWith(extension)) {
                cont++;
            }
        }

        System.out.println(cont + " archivos tienen la extension " + extension);
    }

    private static void buscarArchivo(File directorio) {
        File[] archivos = directorio.listFiles();
        boolean encontrado = false;

        System.out.println("Como se llama el archivo que buscas ");
        String nomArch = scanner.next();

        for (int i = 0; i < archivos.length; i++) {
            if (archivos[i].getName().equals(nomArch) && archivos[i].exists()) {
                System.out.println("Archivo encontrado en: " + archivos[i].getAbsolutePath());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró el archivo " + nomArch);
        }
    }

    private static void crearDirectorio(File directorio) {
        System.out.println("Que nombre quieres ponerle al directorio");
        String direc = scanner.next();
        File nuevoDir = new File(directorio, direc);

        if (nuevoDir.mkdir()) {
            System.out.println("Directorio creado con exito en " + directorio.getAbsolutePath());
        } else {
            System.out.println("Error al crear el directorio");
        }
    }

    private static void eliminarDirectorio(File directorio) {
        System.out.println("Que directorio quieres eliminar?");
        String resElim = scanner.next();
        File elimDir = new File(directorio, resElim);

        if (elimDir.exists() && elimDir.isDirectory()) {
            if (elimDir.delete()) {
                System.out.println("Directorio eliminado con exito");
            } else {
                System.out.println("No se pudo eliminar el directorio");
            }
        } else {
            System.out.println("El directorio no existe o no es un directorio");
        }
    }
}