package Single_Responsability;
public class Reporte {
    private String titulo;
    private String autor;
    private String contenido;

    public Reporte(String titulo, String autor, String contenido) {
        this.titulo = titulo;
        this.autor = autor;
        this.contenido = contenido;
    }

    public String generarContenido() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nContenido: " + contenido;
    }
}