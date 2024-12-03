public static double calcularBruto(int horas, double precioHora) {
    double bruto;
    if (horas <= 35) {
        return horas * precioHora;
    } else {
        // Las primeras 35 se pagan normal
        bruto = 35 * precioHora;
        // Las siguientes se pagan a 1,5 veces el precio normal
        bruto += (horas - 35) * precioHora * 1.5;
    }
    return bruto;
}
public static double calcularImpuestos(double bruto) {
    double impuestos;
    if (bruto <= 500) {
        impuestos = 0.0;
    } else if (bruto <= 900) {
        // Cobra entre 500 y 900, de los primeros 500 no paga nada
        impuestos = (bruto - 500) * 0.25f;
    } else {
        // Si cobra más de 900
        impuestos = (400 * 0.25) + (bruto - 500 - 400) * 0.45;
    }
    return impuestos;
}
public static void main(String argv[]) {
    int horas = Utilidades.leerEntero("Introduce las horas trabajadas:");
    double precio = Utilidades.leerDoble("Introduce el precio por hora:");

    double bruto = calcularBruto(horas, precio);

    double impuestos = calcularImpuestos(bruto);

    System.out.println("Pago bruto: " + bruto);
    System.out.println("Salario neto: " + (bruto - impuestos));
    System.out.println("Impuestos: " + impuestos);

}
