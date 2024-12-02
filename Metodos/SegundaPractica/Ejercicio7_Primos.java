public class Ejercicio7_Primos {
    public static void main(String[] args) {
        for (int i = 3; i <= 100; i++){
            if (Ejercicio6_Primo.calculo(i) == true){
                System.out.println(i);
            }
        }
    }
}

