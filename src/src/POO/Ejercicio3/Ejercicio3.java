package POO.Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Julian", 5632);
        Cuenta cuenta2 = new Cuenta("Leo");
        Cuenta cuenta3 = new Cuenta("Foga", 4);

        cuenta1.ingresar(-23);
        cuenta3.retirar(6);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
    }
}
