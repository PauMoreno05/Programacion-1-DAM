package guestionDeFicheros;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1SinIA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File directorioActual = File.listRoots()[0];
        int res  = 0;

        while (true){
            System.out.println("Directorio actual: " + directorioActual.getAbsolutePath());
            File[] archivos = directorioActual.listFiles();

            if (archivos != null){
                for (int i = 0; i < archivos.length; i++){
                    if (archivos[i].isDirectory()){
                        System.out.println((i + 1) + " - " + archivos[i].getName() + "<Directorio>");
                    } else{
                        System.out.println((i + 1) + " - " + archivos[i].getName() + "<Archivo>" + archivos[i].length() + "bytes");

                    }
                }
            }
            System.out.println("Introduce un directorio al que acceder");
            System.out.println("<< Para acceder al directorio padre presio 0 y  para finalizar el programa intoruzca -1");
            res = scanner.nextInt();
            if (res == 0){
                directorioActual = directorioActual.getParentFile();
            }else if (res > 0 && res <= archivos.length && archivos[res - 0].isDirectory()){
                directorioActual = archivos[res -1];
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
