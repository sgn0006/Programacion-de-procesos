
public class Completar extends Thread {

    private int porcentaje = 0;
    private String nombre = "";

    public Completar(int porcentaje, String nombre) {
        this.porcentaje = porcentaje;
        this.nombre = nombre;
    }

    public void run() {

        try {

            int suma = 0;

            while (porcentaje != 100) {

                suma = 10;
                porcentaje += suma;
                System.out.println("El programa " + nombre + " se esta instando... " + porcentaje + "%");
                sleep(1500);
            }

            System.out.println("El programa " + nombre + " se ha instalado correctamente.");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
