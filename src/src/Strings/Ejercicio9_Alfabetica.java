import java.util.Scanner;

public class Ejercicio9_Alfabetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena1 = "";
        System.out.println("introduce una palabra");
        cadena1 = scanner.nextLine();
        String minusclas = cadena1.toLowerCase();
        boolean si = false;


        for (int i = 0; i < minusclas.length() -1; i++){
            if (minusclas.charAt(i) > minusclas.charAt(i +1)){
                si = false;
                System.out.println("Tru farse no es alfabetica");
                break;
            }else {
                si = true;
            }
        }

        if (si) System.out.println("Tu frase esta bien ordenada");
    }
}