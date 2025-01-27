package POO.Ejercicio4;

public class libro {
    private String titulo;
    private String autor;
    private int paginas;

    public libro(String titulo, String autor, int paginas){
        this.titulo  = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }
}
