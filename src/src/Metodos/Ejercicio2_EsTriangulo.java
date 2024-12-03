import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio2_EsTriangulo {
    public static boolean calculo(int num1, int num2, int num3) {
        Scanner scanner = new Scanner(System.in);
        boolean triangulo;
        if ((num1 + num2) < num3 ){
            triangulo = false;
        }else if ((num1 + num3) < num2 ){
            triangulo = false;
        }else if ((num2 + num3) < num1){
            triangulo = false;
        }else{
            triangulo = true;
        }
        return triangulo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Introduce un numero");
        num1 = scanner.nextInt();
        System.out.println("Introduce otro numero");
        num2 = scanner.nextInt();
        System.out.println("Introduce otro numero");
        num3 = scanner.nextInt();
        System.out.println(calculo(num1, num2, num3));
    }
}

