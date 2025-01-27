//Diseña un algoritmo que calcule el salario neto de un trabajador en función del número de horas de trabajo y los impuestos según las siguientes reglas

import java.util.Scanner;

public class Ejemplo19 {
    public static void main(String[] args) {
        double horas;
        double precioHora;
        double bruto;
        double neto;
        double impuestos;

        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce nuemro de horas trabajadas: ");
        horas = inputValue.nextDouble();
        System.out.println("Introduce el precio de horas por euro: ");
        precioHora = inputValue.nextDouble();
        inputValue.close();

        if (horas <= 35) {
            bruto = horas * precioHora;
        } else{
            bruto = precioHora * 35 + ((horas - 35) * precioHora * 1.5);
        }

        if (bruto > 500 && bruto <= 900) {
            impuestos = ((bruto - 500) * 0.25);
            neto = bruto - impuestos;
            System.out.println("Tu salario neto es de:" + neto);
            System.out.println("Tus impuestos son del:" + impuestos);
            System.out.println("Tus pago en bruto es del:" + bruto);
        }

        if (bruto >= 900) {
            impuestos = 100 + ((bruto - 900) * 0.45);
            neto = bruto - impuestos;
            System.out.println("Tu salario neto es de:" + neto);
            System.out.println("Tus impuestos son del:" + impuestos);
            System.out.println("Tus pago en bruto es del:" + bruto);

        }
    }

}
