package guestionDeFicheros;

import java.io.File;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File directorioActual = File.listRoots()[0];
        int res  = 0;
        int res2 = 0;

        while (true){
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

            System.out.println("=====================");
            System.out.println("Opciones del programa");
            System.out.println("=====================");
            System.out.println("Cambiar permisos del directorio que te encuentras introude |-3|");
            System.out.println("<< Para acceder al directorio padre presio |0| y  para finalizar el programa intoruzca |-1|");
            res = scanner.nextInt();
            if (res == 0){
                directorioActual = directorioActual.getParentFile();
            }else if (res > 0 && res <= archivos.length && archivos[res - 0].isDirectory()) {
                directorioActual = archivos[res - 1];
            }else if (res == -3){
                System.out.println("Que permiso deseas darle al directorio actual");
                System.out.println("1. De escritura");
                System.out.println("3. De lectura");
                System.out.println("2. De ejecucion");
                res2 = scanner.nextInt();

                if (res2 == 1){
                    directorioActual.setWritable(true, false);
                } else if (res2 == 2) {
                    directorioActual.setReadable(true, false);
                }else if (res2 == 3){
                    directorioActual.setExecutable(true, false);
                }

            }else {
                System.out.println("Opcion no valida");
                break;
            }
            if (res == -1){
                System.out.println("Saliendo del programa...");
            }
        }
        scanner.close();
    }
}
