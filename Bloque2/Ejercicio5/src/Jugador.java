public class Jugador extends Thread {

    private int tiempo;
    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void run() {

        try {

            for (int i = 0; i < 10; i++) {

                System.out.println("El jugador: " + nombre + " está en la posición: " + i);

                tiempo = (int) (1000 + (Math.random() * 2000));
                sleep(tiempo);
            }

            System.out.println("");
            System.out.println("El jugador: " + nombre + " ha terminado la carrera");
            System.out.println("");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
