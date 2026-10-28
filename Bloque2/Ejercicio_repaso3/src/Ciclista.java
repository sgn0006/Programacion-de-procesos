
public class Ciclista extends Thread {

    private String nombre;
    private int distancia;

    public Ciclista(String nombre, int distancia) {

        this.nombre = nombre;
        this.distancia = distancia;
    }

    public void run() {

        int recorrido = 0;

        try {

            for (int i = 0; i < 11; i++) {
                System.out.println("El ciclista " + nombre + " va por el kilometro " + distancia);
                recorrido = (int) ((Math.random() * 10) / 2);
                if (recorrido <= 0) {
                    recorrido = 1;
                }
                distancia += recorrido;

                int tiempo = 0;

                if (recorrido > 1 && recorrido < 2) {
                    tiempo = 500;
                } else if (recorrido > 2 && recorrido < 3) {
                    tiempo = 750;
                } else if (recorrido > 3 && recorrido < 4) {
                    tiempo = 1000;
                } else if (recorrido > 4 && recorrido < 5) {
                    tiempo = 1250;
                } else {
                    tiempo = 1500;
                }
                sleep(tiempo);
            }

            System.out.println("La carrera ha terminado");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
