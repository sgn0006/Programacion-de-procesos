public class Presion extends Thread {

    private int atmosferica;

    public Presion(int atmosferica) {

        this.atmosferica = atmosferica;
    }

    @Override
    public void run() {

        try {

            for (int i = 0; i < 3; i++) {
                Thread.sleep(7000);

                int cambio = (int) (Math.random() * 4);

                if (Math.random() < 0.5) {
                    atmosferica += cambio;
                } else {
                    atmosferica -= cambio;
                }

                if (atmosferica > 0 || atmosferica < 5) {
                    System.out.println("Lectura de presión atmosférica: " + atmosferica + " atmósferas");
                } else {

                    System.out.println("sensor de temperatura apagado por valor fuera de rango");
                }
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }
}
