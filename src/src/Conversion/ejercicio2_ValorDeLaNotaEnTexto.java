public static String ejercicio2_ValorDeLaNotaEnTexto(int nota) {
    String notaEnLetra = "";
    if ((nota < 0) || (nota > 10)) {
        return "Nota inválida";
    } else if (nota < 3) {
        return "Muy deficiente";
    } else if (nota < 5) {
        return "Insuficiente";
    } else if (nota < 6) {
        return "Suficiente";
    } else if (nota < 7) {
        return "Bien";
    } else if (nota < 9) {
        return "Notable";
    } else {
        return "Sobresaliente";
    }
}

public static void main(String argv[]) {
//    int nota = Utilidades.leerEntero("Introduce el valor de la nota entera:");
//    System.out.println(ejercicio2_ValorDeLaNotaEnTexto(nota));
}

