/*
 * @author NeuenMartinez
 */
package extras;

import java.util.Scanner;

public class ej8Ex {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR LA CANTIDAD DE NUMEROS");
        int n = leer.nextInt();
        if (n > 0){
        int aux = 0;
        int aux2 = 0;
        int par = 0;
        int impar = 0;
        do {
            System.out.println("INGRESAR LOS DATOS");
            System.out.println("(los numeros ingresados tienen que ser mayores a 0 y el programa se dentendra si se ingresa un multiplo de 5)");
            aux2 = leer.nextInt();
            if (aux2 <= 0){
                break;
            } else if (aux2 % 2 == 0){
                par++;
            } else {
                impar++;
            }
            if (aux2 % 5 == 0){
                aux++;
                break;
            }
            aux++;

        } while (aux != n);
        if (aux2 <= 0) {
            System.out.println("el numero ingresado en incorrecto y se finalizara el programa");
        } else {
            System.out.println("la cantidad de numeros pares fueron: " + par);
            System.out.println("la cantidad de numeros impares fueron: " + impar);
            System.out.println("la cantidad de numeros ingresados fueron: " + aux);

        }
        } else {
            System.out.println("el numero ingresado no es valido");
        }
    }

}
