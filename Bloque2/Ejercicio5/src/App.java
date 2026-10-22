import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String nombreJ = "";

        System.out.println("Dime a  tu jugador");
        nombreJ = sc.nextLine();
        Jugador j1 = new Jugador(nombreJ);
        
        System.out.println("Dime a  tu jugador");
        nombreJ = sc.nextLine();
        Jugador j2 = new Jugador(nombreJ);
        
        System.out.println("Dime a  tu jugador");
        nombreJ = sc.nextLine();
        Jugador j3 = new Jugador(nombreJ);
        
        System.out.println("Dime a  tu jugador");
        nombreJ = sc.nextLine();
        Jugador j4 = new Jugador(nombreJ);
        
        System.out.println("Dime a  tu jugador");
        nombreJ = sc.nextLine();
        Jugador j5 = new Jugador(nombreJ);
        
        
        j1.start();
        j2.start();
        j3.start();
        j4.start();
        j5.start();
    }
}
