/* Ejercicio 2 - Operaciones simultaneas

Crea 4 clases, una se encargará de recibir dos números por parámetro y sumarlos, otra de recibir dos números y restarlos,
otra de multiplicarlos y otra de dividirlos.

En tu 'main', pidele al usuario dos números y crea 4 hilos correspondientes a cada una de las clases anteriores, pasándole
los números del usuario, de forma que las 4 cuentas puedan realizarse <<simultaneamente>>.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt( System.console().readLine("Dame un número"));
        int n2 = Integer.parseInt( System.console().readLine("Dame un número"));

        Sumar s = new Sumar();
        Restar r = new Restar();
        Multiplicar m = new Multiplicar();
        Dividir d = new Dividir();

        s.start();
        r.start();
        m.start();
        d.start();
    }
}
