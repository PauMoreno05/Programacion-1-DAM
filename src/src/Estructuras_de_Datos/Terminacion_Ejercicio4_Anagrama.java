package Estructuras_de_Datos;
import java.io.*;
import java.util.*;

public class Terminacion_Ejercicio4_Anagrama {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader("spanish-dict.txt"));
        String line;
        Map<String, ArrayList<String>> mapa1 = new HashMap<>();
        ArrayList<String> palabrasIguales;
        int valorMin = 0;
        System.out.println("Introduce el valor minimo");
        valorMin = scanner.nextInt();


        while ((line = reader.readLine())!=null) {
            palabrasIguales = new ArrayList<>();
            ArrayList<String> palabrasFin = mapa1.getOrDefault(alphabetize(line), new ArrayList<>());


            for (String i : palabrasFin){
                palabrasIguales.add(i);
            }
            palabrasIguales.add(alphabetize(line));
            mapa1.put(alphabetize(line), palabrasIguales);

            if (mapa1.get(alphabetize(line)).size() > valorMin){
                System.out.println(alphabetize(line) + "--" + mapa1.get(alphabetize(line)) + "--"+ mapa1.get(alphabetize(line)).size());
            }
        }

        System.out.println(mapa1);
        reader.close();
    }
    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

}
