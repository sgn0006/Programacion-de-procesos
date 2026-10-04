
import java.util.Scanner;

public class Ejercicio_inventado {

    /*Enunciado del Ejercicio: Gestor de Tareas de Automatización
Crea una clase principal en Java (por ejemplo, GestionMenu.java) dentro del paquete o carpeta principal programacion 
2. El programa debe mostrar un menú interactivo en la consola con las siguientes opciones:
Menú de Opciones:
Abrir un navegador e ir a una URL
1.1. Preguntar por una URL: El programa debe solicitar al usuario por consola que introduzca una dirección web 
(por ejemplo, [https://www.google.com](https://www.google.com)).
A continuación, ejecutará el comando correspondiente del sistema 
(por ejemplo, cmd /c start ) para abrir dicha página en el navegador predeterminado.
Ejecutar un proyecto/ejercicio de Java existente
Al seleccionar esta opción, el programa ejecutará uno de los archivos del proyecto 
(por ejemplo, compilará y ejecutará el archivo llamarFichero.java que está en la carpeta 
Ejercicio11/, o invocará Ejercicio0.java de la carpeta bloque 1).
Cerrar todo y salir
El programa cerrará el proceso actual o ejecutará una orden mediante cmd para finalizar las tareas abiertas y salir de la aplicación. */
    public static void main(String[] args) {

        try {

            System.out.println("===========================================");
            System.out.println("                    MENU");
            System.out.println("===========================================");
            System.out.println("");
            System.out.println("===========================================");
            System.out.println("Elija que quiere hacer:");
            System.out.println("1.- Abrir el navegador");
            System.out.println("2.- Abrir un projecto existente");
            System.out.println("3.- Cerrar todo y salir");
            System.out.println("===========================================");

            Scanner sc = new Scanner(System.in);
            int opciones = Integer.parseInt(sc.nextLine());
            String volver = "";
            String navega = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";


            do {
                switch (opciones) {
                    case 1:
                        System.out.println("Intruduzca la url de la página que desees visitar");
                        String url = sc.nextLine();

                        ProcessBuilder web = new ProcessBuilder(navega, url);
                        web.start();

                        System.out.println("¿Quieres volver al menú principal o salir?");
                        volver = sc.nextLine();
                        if (volver.equalsIgnoreCase("salir")) {
                            opciones = 3;
                        }
                        break;
                        
                        case 3:
                            
                            ProcessBuilder cerrarNav = new ProcessBuilder("CMD","/c","taskkill", "chrome.exe");
                            cerrarNav.start();
                            opciones = 4;

                            break;

                    default:
                        throw new AssertionError();
                }
            } while (opciones != 4);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
