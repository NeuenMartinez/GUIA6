/*
 * @author NeuenMartinez
 */
package extras;

import java.util.Scanner;

public class ej12Ex {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i == 3) {
                        String numCadena = String.valueOf(i);
                        numCadena = "E";
                        System.out.println(numCadena + " - " + j + " - " + k);
                    } else if (j == 3) {
                        String numCadena = String.valueOf(j);
                        numCadena = "E";
                        System.out.println(i + " - " + numCadena + " - " + k);
                    } else if (k == 3) {
                        String numCadena = String.valueOf(k);
                        numCadena = "E";
                        System.out.println(i + " - " + j + " - " + numCadena);   
                    } else {
                        System.out.println(i + " - " + j + " - " + k);
                    }
                        

                }
            }
        }

    }
}
