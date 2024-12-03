//palindromo
import java.util.Scanner;
public class Ejemplo30 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce una palabra o frase");
        String frase = inputValue.nextLine();
        String fraseSinEspacios = frase;
        fraseSinEspacios.toLowerCase().replaceAll("\\s+", ""); //to lower case sirve para converti toda la palabra en minusculas y replaceAll para quitar las coasa dentro del parentesis
        boolean esPalindromo = true;
        int largo = fraseSinEspacios.length();
        for (int i = 0; i < largo / 2; i ++){
            if (fraseSinEspacios.charAt(i) != fraseSinEspacios.charAt(largo -1 -i)){
                esPalindromo = false;
                break;
            }
        }
        if (esPalindromo == true){
            System.out.println("la frase: " +frase+ " es palindroma");
        }else {
            System.out.println("la frase: " +frase+ " no es palindroma");
        }

        inputValue.close();
    }
}


