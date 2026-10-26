
import java.util.Scanner;


/*
Ejercicio 2: Simulador de Carrera de Caballos
Objetivo: Simular hilos en ejecucion independiente que avanzan de forma aleatoria, 
un estilo muy similar al ejercicio del juego o de los jugadores (jugador.java / hilo.java).

Enunciado:
Implementa un programa donde participen 4 hilos representando caballos en una carrera.

Cada hilo debe tener un nombre (ej. "Caballo 1", "Caballo 2", etc.) y una distancia recorrida inicial de 0 metros.

En cada iteracion de un bucle, el hilo avanzara una cantidad aleatoria de metros (por ejemplo, entre 1 y 10 metros) 
y se pausara brevemente (Thread.sleep) para simular el tiempo transcurrido.

La carrera termina cuando uno de los hilos alcanza o supera los 100 metros. 
El programa principal debe esperar a que terminen y anunciar cual ha sido el caballo ganador.

*/


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        String nombre = "";

        System.out.println("Dime el nombre de tu caballo");
        nombre = sc.nextLine();
        Caballo c1 = new Caballo(nombre, 0);
        
        System.out.println("Dime el nombre de tu caballo");
        nombre = sc.nextLine();
        Caballo c2 = new Caballo(nombre, 0);
        
        System.out.println("Dime el nombre de tu caballo");
        nombre = sc.nextLine();
        Caballo c3 = new Caballo(nombre, 0);
        
        System.out.println("Dime el nombre de tu caballo");
        nombre = sc.nextLine();
        Caballo c4 = new Caballo(nombre, 0);
        
        System.out.println("Dime el nombre de tu caballo");
        nombre = sc.nextLine();
        Caballo c5 = new Caballo(nombre, 0);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
    }
}
