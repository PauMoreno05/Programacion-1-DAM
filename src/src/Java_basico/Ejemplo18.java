//Diseña un algoritmo que recibe horas, minutos y segundos y muestra horas, minutos y segundos resultantes de la adición de un segundoimport java.util.Scanner;

import java.util.Scanner;
public class Ejemplo18 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Inroduce la hora");
        int hora = inputValue.nextInt();
        System.out.println("Inroduce los minutos");
        int minutos = inputValue.nextInt();
        System.out.println("Inroduce los segundos");
        int segundos = inputValue.nextInt();
        inputValue.close();

       segundos += 1;

       if (segundos == 60) {
           segundos = 0;
           minutos += 1;
       }
       if (minutos == 60) {
           minutos =0;
           hora += 1;
       }
       if (hora == 24) {
           hora = 0;
           segundos +=1;
       }
       if (hora < 24 && minutos < 60 && segundos < 60)
           System.out.println("La hora es: " + hora + ":" + minutos + ":" + segundos);

        else
            System.out.println("La hora escrita contiene valores incorrectos");
    }
}
