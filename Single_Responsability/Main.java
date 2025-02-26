package Single_Responsability;
public class Main {
    public static void main(String[] args) {
        Reporte reporte = new Reporte("Los gatos", "Juan Pérez", "Los gatos son animales domésticos que se caracterizan por su agilidad, fuerza y flexibilidad.");
        ReporteArchivo reporteArchivo = new ReporteArchivo();
        reporteArchivo.guardar(reporte, "reporte2.txt");
    }
}