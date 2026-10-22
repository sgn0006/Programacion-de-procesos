import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);

            System.out.println("Dime una palabra: ");
            String palabra1 = sc.nextLine();
            palabra palabra_a = new palabra(palabra1);
            palabra_a.start();
            palabra_a.join();

            System.out.println("Dime una palabra: ");
            String palabra2 = sc.nextLine();
            palabra palabra_b = new palabra(palabra2);
            palabra_b.start();

            System.out.println("Dime una palabra: ");
            String palabra3 = sc.nextLine();
            palabra palabra_c = new palabra(palabra3);
            palabra_c.start();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
