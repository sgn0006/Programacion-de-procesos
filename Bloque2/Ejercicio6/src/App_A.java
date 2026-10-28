public class App_A {
    public static void main(String[] args) throws Exception {

        long numeros[] = new long[200_000_000];

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (long) (Math.random() * 100);
            System.out.println(" Este es el número "+ i + "......................" + numeros[i]);
        }
        
        long t1 = System.currentTimeMillis();
        System.out.println("Generar los datos ha tardado: " + (t1 - t0) + " ms");
        
        long suma = 0;
        long t2 = System.currentTimeMillis();
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
            System.out.println(" Esta es la suma "+ i + "......................" + suma);
        }
        System.out.println("El resultado es: " + suma);
        System.out.println("El sumar los datos ha tardado: " + (t2 - t1) + " ms");

    }
}
