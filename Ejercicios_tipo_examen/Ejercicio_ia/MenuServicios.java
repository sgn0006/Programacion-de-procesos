
import java.io.File;
import java.util.Scanner;

/*
Enunciado: 

Gestor de Servicios e Impresión del Sistema (GSIS)Desarrolla una aplicación en Java formada por dos clases: 
MonitorServicios.java y MenuServicios.java.1. 

Clase MonitorServicios.javaEsta clase se ejecutará como un subproceso secundario de Java:   
Ejecuta en la consola de comandos de Windows el comando net start (que muestra la lista de servicios en ejecución).  

Analiza la salida y guarda en un archivo llamado servicios_activos.txt 
únicamente las líneas que contengan palabras clave de servicios comunes como: Windows, Service o Server.   

Escribe cada registro en el archivo garantizando el uso correcto del salto de línea \n 
y contabilizando las coincidencias mediante un número entero primitivo (int contador = 0;).   

Al finalizar, imprime por pantalla el total de servicios filtrados y guardados.

Clase MenuServicios.javaOfrece el siguiente menú interactivo por consola:   
=== CONTROL DE SERVICIOS Y ENTORNO ===
1.- Iniciar área de trabajo (Edge en 'stackoverflow.com' + Bloc de notas 'servicios.txt')
2.- Auditoría de Servicios (Subproceso Java)
3.- Abrir carpeta de Documentos (Explorador de archivos)
4.- Cancelar procesos de texto (taskkill sobre notepad.exe)
5.- Salir
Elige una opción: 

Comportamiento del menú:

Opción 1: Abre Microsoft Edge en [https://stackoverflow.com](https://stackoverflow.com) 
y lanza el Bloc de notas abriendo servicios.txt en la carpeta Descargas del usuario.   
(OK)
Opción 2: Ejecuta la clase MonitorServicios en un proceso secundario mediante ProcessBuilder("java", "-cp", cp, "MonitorServicios"). 
Muestra todo lo que imprime la clase secundaria en tiempo real añadiendo el prefijo [SERVICIOS]:  y espera a que finalice con waitFor().   
()
Opción 3: Abre el Explorador de archivos (explorer) en la carpeta Documentos del usuario 
(System.getProperty("user.home") + File.separator + "Documents").
(OK)
Opción 4: Cierra de forma forzada el Bloc de notas con taskkill /F /IM notepad.exe. 
Captura y muestra por pantalla la respuesta del sistema.   
()
Opción 5: Muestra un mensaje de despedida, espera 1.5 segundos con Thread.sleep(1500) y finaliza el programa.
(OK)
 */
public class MenuServicios {

    public static void main(String[] args) {

        try {

            boolean terminar = false;
            do {
                System.out.println("================================================");
                System.out.println("         CONTROL DE SERVICIOS Y ENTORNO");
                System.out.println("================================================");
                System.out.println("1.- Iniciar área de trabajo");
                System.out.println("2.- Auditoría de Servicios");
                System.out.println("3.- Abrir carpeta de Documentos");
                System.out.println("4.- Cancelar procesos de texto");
                System.out.println("5.- Salir");
                System.out.println("================================================");
                
                // Capturar
                Scanner sc = new Scanner(System.in);
                int opcion = Integer.parseInt(sc.nextLine());

                //Buscador
                String edge = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe";
                String web = "https://www.youtube.com/watch?v=k8GLBI-6RNo";

                //servicios.txt == buscar
                String notas = "C:\\Users\\USUARIO\\Downloads\\servicios.txt";

                //Explorador de archivos
                String explorer = (System.getProperty("user.home") + File.separator + "Documents");

                switch (opcion) {
                    case 1:
                        ProcessBuilder opc1 = new ProcessBuilder(edge, web);
                        opc1.start();

                        ProcessBuilder algo = new ProcessBuilder("notepad", notas);
                        algo.start();

                        break;

                    case 2:

                        break;

                    case 3:
                        ProcessBuilder opc3 = new ProcessBuilder("explorer", explorer);
                        opc3.start();
                        break;

                    case 4:
                        ProcessBuilder opc4 = new ProcessBuilder("cmd", "/c", "taskkill", "/F", "/IM", "notepath.exe");
                        opc4.start();
                        break;

                    case 5:
                        System.out.println("Hasta la vista");
                        Thread.sleep(1500);
                        terminar = true;
                        break;

                    default:
                        System.out.println("Esa no es una opción valida");
                        break;
                }

            } while (terminar == false);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
