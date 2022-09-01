/*
 * @author NeuenMartinez
 */
package extras;

import java.util.Scanner;

public class ej11Ex {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresar un numero");
        int num = leer.nextInt();
        int aux = 1;
        if (num < 9){
        } else {
        do {
            num = num / 10;
            aux++;
        } while (num > 9);
    }
        System.out.println("el numero tiene: " + aux + " cifras.");
}
}
