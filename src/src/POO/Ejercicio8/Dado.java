package POO.Ejercicio8;

public class Dado {
    private int dado;

    public Dado(){
        roll();
    }

    public int getDado() {
        return dado;
    }

    public void roll(){
        dado = (int)(Math.random()*6)+1;
    }
}
