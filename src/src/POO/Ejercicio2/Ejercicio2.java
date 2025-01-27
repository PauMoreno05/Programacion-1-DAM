package POO.Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        AireAcondicionado marca1 = new AireAcondicionado("Phillips",30, 10,15);
        AireAcondicionado marca2 = new AireAcondicionado("Toyota",40, 20,25);
        System.out.println("Aires acondicionados de la tienda: ");

        marca1.botonBajar();
        marca2.botonSubir();

        System.out.println(marca1);
        System.out.println(marca2);
    }
}
