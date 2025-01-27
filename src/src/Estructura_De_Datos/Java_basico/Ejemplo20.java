//Precio final
import java.util.Scanner;

public class Ejemplo20 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el precio del producto: ");
        double precio = inputValue.nextInt();
        inputValue.close();

       if (precio < 6) {
           System.out.println("No se aplica descuento");
       } else if (precio >= 6 && precio <60){
           System.out.println("Se aplica un 5% de descuento, el precio es de: "+ (precio - (precio * 5/100)));
       } else if (precio >= 60) {
           System.out.println("Se aplica un 10% de desuento, el precio es: " + (precio - (precio * 10/100)));
       }
    }
}
