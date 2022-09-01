/*
 * @author NeuenMartinez
 */
package extras;

import java.util.Scanner;

public class ej9Ex {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresar 2 numeros enteros mayores que 1:");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        if (n1 > 0 && n2 > 0) {
            int resta = n1 - n2;
            int aux = 1;
            do {
                resta -= n2;
                aux++;
            } while (resta > n2);
            System.out.println("el residuo es: " + resta);
            System.out.println("el cociente es: " + aux);
        } else {
            System.out.println("el o los numeros ingresados no son correctos");
        }
    }

}
