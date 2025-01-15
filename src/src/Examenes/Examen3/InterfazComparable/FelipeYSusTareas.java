package Examenes.Examen3.InterfazComparable;

import java.util.ArrayList;
import java.util.Scanner;

public class FelipeYSusTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prioridad;
        int duracion;
        ArrayList<procesos> proceso = new ArrayList<>();


        System.out.println("cuantas tareas tiene felipe pendiente");
        int tarea = scanner.nextInt();

        while (tarea > 0) {
            for (int i = 0; i < tarea; i++) {
                System.out.println("Introduce prioridad de la tarea");
                prioridad = scanner.nextInt();

                System.out.println("Ahora introduce su duracion");
                duracion = scanner.nextInt();

                proceso.add(new procesos(prioridad, duracion));
            }
            System.out.println("Introduce mas tareas");
            tarea = scanner.nextInt();
            if (tarea == 0) break;

        }

        proceso.sort((pro1, pro2) -> Integer.compare(pro2.getPrioridad(), pro1.getPrioridad()));

        for (procesos i : proceso) {
            System.out.println(i.getPrioridad() + " " + i.getDuracion());
        }

    }
}
