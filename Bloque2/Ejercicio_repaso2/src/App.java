/*
Ejercicio 6: Simulador de Descarga de Archivos Concurrentes
Objetivo: Simular múltiples tareas ejecutándose en paralelo con barras de progreso o porcentajes, 
muy similar al ejercicio del caballo que tenías.

Enunciado:

Crea una clase hilo (por ejemplo, Descarga que extienda de Thread) que reciba en su constructor el nombre del archivo 
(ej. "video.mp4", "documento.pdf").

Dentro del método run(), haz un bucle que vaya desde el 0% hasta el 100% de descarga (puedes avanzar de 10 en 10 o de 20 en 20).

En cada iteración, haz que el hilo se pause brevemente con Thread.sleep(...) para simular el tiempo de descarga de la red.

Muestra por pantalla el nombre del archivo y el porcentaje descargado en cada paso. Cuando llegue al 100%, 
muestra un mensaje de que la descarga ha finalizado.

En tu clase App, lanza al menos 3 descargas simultáneas y comprueba cómo la consola mezcla los porcentajes de forma concurrente.
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        Completar c1 = new Completar(0, "VSCode");
        Completar c2 = new Completar(0, "GitHub");
        Completar c3 = new Completar(0, "WhatsApp");
        Completar c4 = new Completar(0, "Google");
        Completar c5 = new Completar(0, "Discord");

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
    }
}
