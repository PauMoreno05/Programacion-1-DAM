package Estructura_De_Datos.Array;

public class Ejercicio1_Duplicados {
    public static void main(String[] args) {
        int [] numArray = new int[10];
        Utilidades.rellenaArray(numArray, 1,10);
        int [] repetidos = new int[10];
        for(int i = 0; i < numArray.length;i++){
            for(int j = 0; j <numArray.length; j++){
                if (i != j){
                    if (numArray[i] == numArray[j]){
                        repetidos[i] = numArray[i];
                        numArray[j] = 0;
                    }
                }
            }
        }
        for (int num : numArray){
            System.out.print(num + " ");
        }

        for (int i = 0; i< repetidos.length; i++){
            if (repetidos[i] > 0){
                System.out.println(repetidos[i]);
            }
        }
//comentario
    }
}

