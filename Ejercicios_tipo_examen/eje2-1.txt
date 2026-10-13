
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println("Se está generando la ficha...");
            //Preparando el proceso para lanzarse
            String java = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
            String cp = System.getProperty("java.class.path");
            ProcessBuilder pb = new ProcessBuilder(java, "-cp", cp, "FichaEquipo");

            //Proceso listo para lanzarse
            Process clase = pb.start();
            
            //Lee el proceso
            BufferedReader reader = new BufferedReader(new InputStreamReader(clase.getInputStream()));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
                clase.waitFor();
                System.out.println("La ficha está lista");
            }
        } catch (Exception e) {
        }
    }
}
