public class App {
    public static void main(String[] args) throws Exception {
        
        Temperatura t1 = new Temperatura(20);
        Humedad h1 = new Humedad(20);
        Presion p1 = new Presion(20);

        t1.start();
        h1.start();
        p1.start();

        
    }
}
