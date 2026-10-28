public class Temperatura extends Thread {

    private int grados;

    public Temperatura(int grados) {
        this.grados = grados;
    }

    @Override
    public void run() {

        try {

            for (int i = 0; i < 3; i++) {

                Thread.sleep(5000);

                int lectura = (int) (Math.random() * 4);

                if (Math.random() < 0.5) {
                    grados += lectura;
                } else {
                    grados -= lectura;
                }

                if (grados > 0 || grados < 40) {
                    System.out.println("Lectura de temperatura: " + grados + " grados centigrados");
                } else{
                    System.out.println("sensor de temperatura apagado por valor fuera de rango");
                }

            }

        } catch (Exception e) {
            e.getMessage();
        }

    }
}
