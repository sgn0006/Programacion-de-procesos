public class palabra extends Thread{
    
    public palabra(String palabra1, String palabra2, String palabra3) {
        this.palabra1 = palabra1;
        this.palabra2 = palabra2;
        this.palabra3 = palabra3;
    }

    public void run(){
        int contador = 100;
        while (contador != 0) {
            contador--;
            System.out.println(palabra1);
        }
        while (contador != 0) {
            contador--;
            System.out.println(palabra2);
        }
        while (contador != 0) {
            contador--;
            System.out.println(palabra3);
        }
    }
}
