package POO.maquinaExpendedora;

import java.util.Scanner;

public class MainMaquina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaquinaExpendedora maquina = new MaquinaExpendedora(1.20);
        System.out.println("Bienvenido a la máquina expendedora");
        System.out.println("El precio del ticket es de " + maquina.getPrecioTicket() + "€");

        while (true) {
            System.out.println("Opciones:");
            System.out.println("1. Insertar dinero");
            System.out.println("2. Sacar ticket");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción:");

            int opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.print("Ingrese la cantidad");
                double importe = scanner.nextDouble();
                maquina.insertarDinero(importe);
            } else if (opcion == 2) {
                System.out.println(maquina.expenderTicket());
            } else if (opcion == 3) {
                System.out.println("Gracias por usar la máquina");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
