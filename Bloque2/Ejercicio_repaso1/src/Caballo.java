
public class Caballo extends Thread {

    String nombre = "";
    int distancia = 0;
    

    public Caballo(String nombre, int distancia) {
        this.distancia = distancia;
        this.nombre = nombre;
    }

    public void run() {

        try {

            int posicion = 0;

            while (distancia < 100) {

                System.out.println("El caballo " + nombre + " está en el metro " + distancia);

                posicion = (int) ((Math.random() * 10) + 1);

                sleep(1000);

                distancia += posicion;

            }

            System.out.println("El caballo " + nombre + " ha terminado la carrera.");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
