public class App {
    public static void main(String[] args) throws Exception {

        int[] array = new int[200000000];

        long antesArray = System.currentTimeMillis();
        long suma = 0;

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 100);
            suma += array[i];
        }

        long despuesArray = System.currentTimeMillis();
        System.out.println("tiempo total de la app: " + (antesArray + despuesArray) + "ms");
        System.out.println("total de suma: " + suma);


        
    }
}
