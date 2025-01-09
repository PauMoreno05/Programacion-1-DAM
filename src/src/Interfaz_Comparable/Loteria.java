package Interfaz_Comparable;
import java.util.*;

class Localidad implements Comparable<Localidad> {
    int inversion;
    int premio;

    public Localidad(int inversion, int premio) {
        this.inversion = inversion;
        this.premio = premio;
    }

    @Override
    public int compareTo(Localidad o) {
        return Integer.compare(this.inversion, o.inversion);
    }
}

public class Loteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break; // Fin de los casos de prueba

            List<Localidad> localidades = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int inversion = scanner.nextInt();
                int premio = scanner.nextInt();
                localidades.add(new Localidad(inversion, premio));
            }

            // Ordenamos las localidades por la inversión
            Collections.sort(localidades);

            // Verificamos si el reparto es justo
            boolean justo = true;
            for (int i = 1; i < localidades.size(); i++) {
                if (localidades.get(i).premio < localidades.get(i - 1).premio) {
                    justo = false;
                    break;
                }
            }

            // Resultado
            if (justo) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
