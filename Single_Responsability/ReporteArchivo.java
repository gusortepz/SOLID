package Single_Responsability;
import java.io.FileWriter;
import java.io.IOException;

public class ReporteArchivo {
    public void guardar(Reporte reporte, String nombreArchivo) {
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            writer.write(reporte.generarContenido());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}