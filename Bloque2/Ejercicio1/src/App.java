public class App {
    public static void main(String[] args) throws Exception {

        //start() -> Inicia el proceso (llama al run())
        //join() -> Esperar hasta que el hilo termine (suele ir en el main)
        //sleep() -> 
        
        Hilo hilo1 = new Hilo(1);
        Hilo hilo2 = new Hilo(2);
        Hilo hilo3 = new Hilo(3);
        Hilo hilo4 = new Hilo(4);

        try {
            hilo1.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
    }
}
