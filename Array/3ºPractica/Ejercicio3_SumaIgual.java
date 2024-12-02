import java.util.Scanner;

public class Ejercicio3_SumaIgual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int [10];
        int valor = 0;
        Utilidades.rellenaArray(nums, 1, 10);
        for (int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Introduce un numero");
        valor = scanner.nextInt();
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j ++){
                if (nums[i] + nums[j] == valor){
                    System.out.println("El valor es la suma de: " + nums[i] + " + " + nums[j]);
                }
            }
        }

    }
}

