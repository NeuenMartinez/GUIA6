/*
 * @author NeuenMartinez
 */
package extras;

import java.util.Scanner;

public class ej12Ex {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    String NumCadena;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    NumCadena= String.valueOf(i);
                    if (NumCadena.equals("3")) {
                      NumCadena="E";  
                    }
                    System.out.print(NumCadena + " - ");
                    NumCadena= String.valueOf(j);
                    if (NumCadena.equals("3")) {
                      NumCadena="E";  
                    }
                    System.out.print(NumCadena + " - ");
                    
                    NumCadena= String.valueOf(k);
                    if (NumCadena.equals("3")) {
                      NumCadena="E";  
                    }
                    System.out.println(NumCadena);
                    
                }
                
            }
            
        }
        


    }

}
