
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileWriter;
// import java.io.InputStreamReader;
// import java.util.Scanner;
//
// Crear un proceso para un programa (el programa y, detrás, lo que haya que darle):
// ProcessBuilder pb = new ProcessBuilder("programa", "argumento");
//
// Crear un proceso para un comando del CMD o de PowerShell:
// ProcessBuilder pb = new ProcessBuilder("cmd", "/c", comando);
// ProcessBuilder pb = new ProcessBuilder("powershell.exe", "/c", comando);
//
// Crear un proceso para otra clase de Java:
// String java = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
// String cp = System.getProperty("java.class.path");
// ProcessBuilder pb = new ProcessBuilder(java, "-cp", cp, "NombreDeLaClase");
//
// Crear un lector para lo que escribe un proceso:
// BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
//
// Crear un fichero de texto para escribir (false = se sobrescribe; true = se añade al final):
// FileWriter writer = new FileWriter("fichero.txt", false)
public class FichaEquipo {

    public static void main(String[] args) {

        try {

            String archivo = "Ejercicio2\\equipo.txt";

            // Creo y ejecuto el comando
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "systeminfo");
            Process comando = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(comando.getInputStream()));

            // Escribo en equipo.txt
            FileWriter writer = new FileWriter(archivo, false);

            // Contador lineas guardadas
            int guardadas = 0;

            String linea;

            while ((linea = reader.readLine()) != null) {
                if (linea.contains("Nombre de host") || linea.contains("Nombre del sistema operativo")
                        || linea.contains("Modelo del sistema")) {
                    writer.write(linea + "/n");
                    guardadas++;
                }
            }
            System.out.println("Se han guardado " + guardadas + " lineas.");

            // cerrar todo para que se guarde en el fichero
            writer.close();
            reader.close();
            comando.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
