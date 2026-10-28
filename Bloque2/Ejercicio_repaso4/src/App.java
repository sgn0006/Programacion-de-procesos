/*
Crea una clase llamada Robot que simule una competición entre cuatro robots.
Requisitos
Debe tener los atributos nombre y energia.
El constructor recibirá el nombre del robot y establecerá su energía inicial en 100.
Cada robot realizará ocho rondas.
En cada ronda:
   - Perderá una cantidad aleatoria de energía entre 5 y 15 puntos.
   - Mostrará su nombre y la energía restante.
   - Esperará entre 1 y 2 segundos.
Si su energía llega a cero o menos, dejará de competir.
Al terminar, mostrará si ha completado las ocho rondas o se ha quedado sin energía.
*/
public class App {
    public static void main(String[] args) throws Exception {
        
        Robot r1 = new Robot("Pepe Tornillos", 100);
        Robot r2 = new Robot("Francisco Tuerca", 100);
        Robot r3 = new Robot("Juan Resortes", 100);
        Robot r4 = new Robot("Cables Martinez", 100);

        r1.start();
        r2.start();
        r3.start();
        r4.start();
    }
}
