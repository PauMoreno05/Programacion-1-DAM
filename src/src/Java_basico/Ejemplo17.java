//Realiza un programa que pida al usuario un mes e imprima el número de días que tiene

import java.util.Scanner;

public class Ejemplo17 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Inroduce el numero del mes");
        int mes = inputValue.nextInt();
        int dias;
        inputValue.close();

        switch (mes) {
            case 1: //enero
            case 3: //marzo
            case 5: //mayo
            case 7: //julio
            case 8: //agosto
            case 10: //octubre
            case 12: //diciembre
                dias = 31;
        break;
            case 4: //abril
            case 6: //junio
            case 9: //septiembre
            case 11: //noviembre
                dias = 30;
        break;
            case 2: //febrero
                dias = 28;
        break;
            default:
                System.out.println("Mal");
        return;
        }

        System.out.println("El mes tiene: " +dias+ " dias" );
    }
}
