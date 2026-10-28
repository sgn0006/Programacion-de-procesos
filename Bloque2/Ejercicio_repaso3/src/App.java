import java.util.Scanner;

/*
Ejercicio 3. Carrera de ciclistas
Crea un programa que simule una carrera entre cinco ciclistas.
Debe cumplir los siguientes requisitos:
Los ciclistas deben tener:
   - nombre.
   - distancia.
La carrera durará 10 turnos.
En cada turno, cada ciclita avanza una distancia aleatoria entre 1 y 5 kilómetros.
Cada turno se mostrara el nombre y la distancia total recorrida.
Esperaremos entre 500 y 1500 milisegundos antes de comenzar el siguiente turno.
Al terminar los 10 turnos, se mostrara un mensaje indicando que ha terminado la carrera.
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String nombre; 

        System.out.println("¿Cual es su ciclista?");
        nombre = sc.nextLine();
        Ciclista c1 = new Ciclista(nombre, 0);

        System.out.println("¿Cual es su ciclista?");
        nombre = sc.nextLine();
        Ciclista c2 = new Ciclista(nombre, 0);

        System.out.println("¿Cual es su ciclista?");
        nombre = sc.nextLine();
        Ciclista c3 = new Ciclista(nombre, 0);

        System.out.println("¿Cual es su ciclista?");
        nombre = sc.nextLine();
        Ciclista c4 = new Ciclista(nombre, 0);

        System.out.println("¿Cual es su ciclista?");
        nombre = sc.nextLine();
        Ciclista c5 = new Ciclista(nombre, 0);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();

    }
}
