//2 Orden inverso (F)

import java.util.Scanner;

class ArrayPractica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // declares an array of integers
        int[] anArray;
        int respuesta;

        // allocates memory for 10 integers
        anArray = new int[10];

       for (int i = 0; i < 10; i++){
           System.out.println("Introduce un valor para el array");
           anArray[i] = scanner.nextInt();
        }
       for (int i = anArray.length -1; i >= 0; i--){
           System.out.print(anArray[i] + " ");
       }
       scanner.close();

       //hols
    }
}
