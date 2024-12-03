import java.util.Scanner;

public class Ejercicio2_Descendiente {
    public static void calculo(int num1 , int num2) {
        if (num1 <= num2){
            System.out.println(num1 +  " " + num2);
        }else{
            System.out.println(num2 +  " " + num1);
        }
    }

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num1 = scanner.nextInt();
        System.out.println("Introduce otro numero");
        num2 = scanner.nextInt();
        calculo(num1,num2);

    }
}
