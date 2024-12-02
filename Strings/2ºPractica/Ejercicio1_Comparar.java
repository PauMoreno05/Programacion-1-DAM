import java.util.Scanner;

public class Ejercicio1_Comparar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena1 = "";
        String cadena2 = "";
        System.out.println("Introduce una frase");
        cadena1 = scanner.nextLine();
        System.out.println("Introduce otra frase");
        cadena2 = scanner.nextLine();
        int comparar = cadena1.compareTo(cadena2);

        if (comparar > 0) {
            System.out.println("La primera frase es mayor que la segunda");
        }else if(comparar < 0){
            System.out.println("La segunda frase es mayor que la primera");
        }else{
            System.out.println("Las dos frses son iguales");
        }
    }
}
