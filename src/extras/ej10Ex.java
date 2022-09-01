/*
 * @author NeuenMartinez
 */
package extras;

import java.util.Scanner;

public class ej10Ex {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1 = (int) (Math.random() * 10);
        int n2 = (int) (Math.random() * 10);
        String opc;
        int multiplicacion = n1 * n2;
        System.out.println("intenta adivinar el resultado de la multiplicacion de los 2 numeros aleatorios!");
        do {
            int intento = leer.nextInt();
            if (intento == multiplicacion){
                System.out.println("excelente!!! has adivinado");
                break;
            } else {
                System.out.println("lo sentimos no has adivinado :(");
                System.out.println("¿desea volver a intentarlo? s/n");
                opc = leer.next();
            }

        } while (opc.equalsIgnoreCase("s"));
        System.out.println("el resultado era " + multiplicacion);
    }

}
