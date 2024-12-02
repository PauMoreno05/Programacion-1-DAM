// 7 Marco con cadenas (M)

import java.util.Scanner;

class ArrayPractica7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = new String [5];
        String grande = "";
        int diferencia = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce una palabra");
            palabras[i] = scanner.next();
            if (palabras[i].length() > grande.length()) {
                grande = palabras[i];
            }
        }
        for (int i = 0; i <= grande.length() + 3; i++){
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < 5; i++){
            System.out.print("* ");
            System.out.print(palabras[i]);
            if (palabras[i].length() < grande.length()){
                diferencia = grande.length() - palabras[i].length();
                for (int j = 0; j < diferencia; j++){
                    System.out.print(" ");
                }
            }
            System.out.print(" *");
            System.out.println();
        }

        for (int i = 0; i <= grande.length() + 3; i++){
            System.out.print("*");
        }
    }
}