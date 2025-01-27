package Estructura_De_Datos.Conversion;

public class ejercicio7_Salario {
    public static double Bruto(int horas, double precioHora) {
        double bruto;
        if (horas <= 35) {
            return horas * precioHora;
        } else {
            bruto = 35 * precioHora;
            bruto += (horas - 35) * precioHora * 1.5;
        }
        return bruto;
    }
    public static double Impuestos(double bruto) {
        double impuestos;
        if (bruto <= 500) {
            impuestos = 0.0;
        } else if (bruto <= 900) {
            impuestos = (bruto -500) * 0.25f;
        } else {
            impuestos = (400*0.25) + (bruto-500-400) * 0.45;
        }
        return impuestos;
    }
    public static void main(String argv[]) {
        int horas = Utilidades.leerEntero("Introduce las horas trabajadas:");
        double precio = Utilidades.leerDoble("Introduce el precio por hora:");
        double bruto = Bruto(horas, precio);
        double impuestos = Impuestos(bruto);
        System.out.println("Pago bruto: " + bruto);
        System.out.println("Salario neto: " + (bruto - impuestos));
        System.out.println("Impuestos: " + impuestos);
    }
}



