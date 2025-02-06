package POO.laboratorio;

public class MainLab {
    public static void main(String[] args) {
        Lab laboratorio = new Lab("DAM","1","18:00","miercoles",20,"Laura");
        laboratorio.addAlumnos("PauForesAlcora05");
        laboratorio.addAlumnos("Mytic");
        laboratorio.addAlumnos("Vicas");
        laboratorio.addAlumnos("Xumelo");
        laboratorio.addAlumnos("Alecraft");
        laboratorio.addAlumnos("PauGamer");

        System.out.println(laboratorio);
    }
}
