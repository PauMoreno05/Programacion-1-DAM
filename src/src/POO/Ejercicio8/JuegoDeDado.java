package POO.Ejercicio8;

public class JuegoDeDado {
    public static void main(String[] args) {
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        Dado dado3 = new Dado();
        tirarDados(dado1, dado2, dado3 );
    }

    public static void tirarDados(Dado dado1, Dado dado2, Dado dado3){
        int contador = 0;
        while (true){
            contador++;
            dado1.roll();
            dado2.roll();
            dado3.roll();
            System.out.println(dado1.getDado()+"-"+dado2.getDado()+"-"+dado3.getDado());
            if (dado1.getDado() == dado2.getDado() && dado2.getDado() == dado3.getDado()){
                System.out.printf("Total de intentos: " + contador);
                break;
                
            }

        }
    }

}
