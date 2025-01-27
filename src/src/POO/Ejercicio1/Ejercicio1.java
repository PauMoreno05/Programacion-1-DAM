package POO.Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        tienda  Ordenadores1 = new tienda("Lenovo","ThinPad3",5,600.99);
        tienda  Ordenadores2 = new tienda("Asus","Tuff4",56,1027.45);
        tienda  Ordenadores3 = new tienda("Lenovo","ThinPad5",9,200);
        System.out.println(Ordenadores1);
        System.out.println(Ordenadores2);
        System.out.println(Ordenadores3);

        System.out.println("__________________________________________________________________________");
        System.out.println("El ordenador a mejor precioes es el Lenovo thinPad5 con: " + Ordenadores3.getPrecio());
    }
}
