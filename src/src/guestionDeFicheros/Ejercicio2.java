package guestionDeFicheros;

import java.io.File;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File directorioActual = File.listRoots()[0];
        int sal = 1;
        int res  = 0;
        int res2 = 0;

        while (sal != 0){
            System.out.println("Directorio actual: " + directorioActual.getAbsolutePath());
            File[] archivos = directorioActual.listFiles();

            DateFormat formatter;
            formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.getDefault());

            if (archivos != null){
                for (int i = 0; i < archivos.length; i++){
                    if (archivos[i].isDirectory()){
                        System.out.print((i + 1) + " - " + archivos[i]);
                    } else{
                        System.out.print("\t");
                    }
                    if (archivos[i].canRead()){
                        System.out.print("r");
                    }else {
                        System.out.print("-");
                    }
                    if (archivos[i].canWrite()){
                        System.out.print("w");
                    }else {
                        System.out.print("-");
                    }
                    if (archivos[i].canExecute()){
                        System.out.print("x");
                    }else {
                        System.out.print("-");
                    }
                    System.out.println("\t" +  archivos[i].length() + "\t" + formatter.format(archivos[i].lastModified()) + "\t" + archivos[i].getName());
                }
            }
            System.out.println("");
            System.out.println("=====================");
            System.out.println("Opciones del programa");
            System.out.println("=====================");
            System.out.println("-1. Salir del programa");
            System.out.println("-2. Cambiar permisos del directorio que te encuentras introude");
            System.out.println("-3. Contar todos los archivos que hay en el directorio con la misma extension");
            System.out.println("-4. Buscar Archivos a partir del directorio actual");
            System.out.println("-5. Crea un directorio a partir del direcrtorio actual");
            System.out.println("-6. Eliminar un direcrtorio");
            System.out.println("<< Para acceder al directorio padre presio |0| y  para finalizar el programa intoruzca |-1|");
            System.out.println("Introduce la opcion deseada: ");
            res = scanner.nextInt();
            if (res == 0){
                directorioActual = directorioActual.getParentFile();
            }else if (res > 0 && res <= archivos.length && archivos[res - 0].isDirectory()) {
                directorioActual = archivos[res - 1];
            }else if (res == -2) {
                System.out.println("Que permiso deseas darle al directorio actual");
                System.out.println("1. De escritura");
                System.out.println("3. De lectura");
                System.out.println("2. De ejecucion");
                res2 = scanner.nextInt();
                if (res == -1){
                    System.out.println("Saliendo del programa...");
                    sal = 0;
                }else if (res2 == 1) {
                    directorioActual.setWritable(true, false);
                } else if (res2 == 2) {
                    directorioActual.setReadable(true, false);
                } else if (res2 == 3) {
                    directorioActual.setExecutable(true, false);
                }
            }else if(res == -3) {
                int cont = 0;
                System.out.println("Que extension deseas contar");
                String extension = scanner.next();
                for (int i = 0; i < archivos.length; i++) {
                    if (archivos[i].getName().endsWith(extension)) {
                        cont++;
                    }
                }

                System.out.println(cont + "archivos tienen la extension" + extension);
            }else if (res == -4) {
                System.out.println("Como se llama el archivo que buscas ");
                String nomArch = scanner.next();
                for (int i = 0; i < archivos.length; i++) {
                    if (archivos[i].getName().equals(nomArch) && archivos[i].exists()) {
                        System.out.println("Archivo encontrado en: " + archivos[i].getAbsolutePath());
                    }
                }
            }else if(res == -5) {
                System.out.println("Que nombre quieres ponerle al directorio");
                String direc = scanner.next();
                File nuevoDir = new File(directorioActual, direc);

                if (nuevoDir.mkdir()) {
                    System.out.println("Directorio creado con exito en " + directorioActual.getAbsolutePath());
                } else {
                    System.out.println("Error al crear el directorio");
                }
            }else if (res == -6){
                System.out.println("Que directorio quieres eliminar?");
                String resElim = scanner.next();
                File elimDir = new File(directorioActual, resElim);
                if (elimDir.exists() && elimDir.isDirectory()){
                    if (elimDir.delete()){
                        System.out.println("Directorio eliminsado con exito");
                    }else {
                        System.out.println("No se puedo eliminar el directorio");
                    }
                }

            } else {
                System.out.println("Opcion no valida");
                break;
            }

        }
        scanner.close();
    }
}
