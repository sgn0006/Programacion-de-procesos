
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        try {
            // do while
            boolean salir = true;

            // switch
            int opciones;

            // opción 1
            String navegador = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe";
            String url = "https://davante.es";

            // opción 2
            String notas = "notepad.exe";
            String apuntes = "apuntes.txt";

            // opción 3
            String archivos = "explorer";
            String descargas = System.getProperty("user.home") + "\\Downloads";

            // opción 4
            String comando = "taskkill";

            do {
                Scanner sc = new Scanner(System.in);

                System.out.println("==========================================");
                System.out.println("=============PANEL DE ESTUDIO=============");
                System.out.println("1.- Abrir el campus virtual");
                System.out.println("2.- Tomar apuntes");
                System.out.println("3.- Ver mis apuntes");
                System.out.println("4.- Terminar de tomar apuntes");
                System.out.println("5.- Salir");
                System.out.println("==========================================");

                opciones = Integer.parseInt(sc.nextLine());

                switch (opciones) {
                    case 1:
                        ProcessBuilder opc1 = new ProcessBuilder(navegador, url);
                        opc1.start();
                        break;
                    case 2:
                        ProcessBuilder opc2 = new ProcessBuilder(notas, apuntes);
                        opc2.start();
                        break;
                    case 3:
                        ProcessBuilder opc3 = new ProcessBuilder(archivos, descargas);
                        opc3.start();
                        break;
                    case 4:
                        ProcessBuilder opc4 = new ProcessBuilder("/cmd", "/c", comando, "/F", "/IM" + notas);
                        opc4.start();
                        break;
                    case 5:
                        salir = true;
                        break;

                    default:
                        System.out.println("Esa opción no existe");
                        throw new AssertionError();
                }

                sc.close();

            } while (salir = false);

        } catch (Exception e) {

        }
    }
}
