package POO.Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Crear áreas de conocimiento
        AreaConocimiento area1 = new AreaConocimiento("A1");
        AreaConocimiento area2 = new AreaConocimiento("A2");

        // Crear departamentos
        Departamento departamento1 = new Departamento("D1", area1);
        Departamento departamento2 = new Departamento("D2", area2);

        // Añadir departamentos a las áreas de conocimiento
        area1.addDepartamento(departamento1);
        area2.addDepartamento(departamento2);

        // Crear facultades
        Facultad facultad1 = new Facultad("F1");
        Facultad facultad2 = new Facultad("F2");

        // Crear cátedras
        Catedra catedra1 = new Catedra("C1", departamento1, facultad1);
        Catedra catedra2 = new Catedra("C2", departamento2, facultad2);

        // Añadir cátedras a los departamentos
        departamento1.addCatedra(catedra1);
        departamento2.addCatedra(catedra2);

        // Añadir cátedras a las facultades
        facultad1.addCatedras(catedra1);
        facultad2.addCatedras(catedra2);

        // Crear profesores
        Profesor profesor1 = new Profesor("P1", departamento1);
        Profesor profesor2 = new Profesor("P2", departamento2);

        // Añadir profesores a los departamentos
        departamento1.addProfesor(profesor1);
        departamento2.addProfesor(profesor2);

        // Crear relaciones de profesor-cátedra
        ProfesorCatedra profesorCatedra1 = new ProfesorCatedra(catedra1, profesor1, "2023-10-01");
        ProfesorCatedra profesorCatedra2 = new ProfesorCatedra(catedra2, profesor2, "2023-10-02");

        // Añadir relaciones de profesor-cátedra a las cátedras y profesores
        catedra1.addprofesorCatedras(profesorCatedra1);
        catedra2.addprofesorCatedras(profesorCatedra2);

        profesor1.addprofesorCatedras(profesorCatedra1);
        profesor2.addprofesorCatedras(profesorCatedra2);

        // Imprimir información para verificar
        System.out.println("Área de Conocimiento 1: " + area1);
        System.out.println("Área de Conocimiento 2: " + area2);

        System.out.println("Departamento 1: " + departamento1);
        System.out.println("Departamento 2: " + departamento2);

        System.out.println("Facultad 1: " + facultad1);
        System.out.println("Facultad 2: " + facultad2);

        System.out.println("Cátedra 1: " + catedra1);
        System.out.println("Cátedra 2: " + catedra2);

        System.out.println("Profesor 1: " + profesor1);
        System.out.println("Profesor 2: " + profesor2);

        System.out.println("ProfesorCatedra 1: " + profesorCatedra1);
        System.out.println("ProfesorCatedra 2: " + profesorCatedra2);
    }
}