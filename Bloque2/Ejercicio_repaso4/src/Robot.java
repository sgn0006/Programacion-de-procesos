
public class Robot extends Thread {

    private String nombre;
    private int energia;

    public Robot(String nombre, int energia) {

        this.nombre = nombre;
        this.energia = energia;
    }

    public void run() {

        try {

            int perdida;
            int tiempo;

            for (int i = 0; i < 9; i++) {
                System.out.println("A " + nombre + " le queda " + energia + " de unidades de energia");

                perdida = (int) ((Math.random() * 10) + 5);
                energia -= perdida;

                tiempo = (int) ((Math.random() * 2) + 1);

                sleep(tiempo);

                if (energia == 8) {
                    i = 8;
                    System.out.println("");
                    System.out.println(nombre + " se ha decargado");
                    System.out.println("");
                }
            }

            System.out.println("");
            System.out.println(nombre + " ha sobrevivido la pelea");
            System.out.println("");
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
