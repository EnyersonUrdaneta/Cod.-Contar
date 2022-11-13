
package ott;

import java.util.Scanner;

/**
 *
 * @author enyerson
 */
public class Ott {
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner lector = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = lector.nextLine();

        contarCaracteres(frase);

        lector.close();
    }

    public static void contarCaracteres(String frase) {
        int Y = 0;
        int vecesLetra[];
        vecesLetra = new int[26];

        for(Y = 0; Y<frase.length(); Y++) {
            // Está en el abecedario y no es otro carácter como un espacio
            if((int)frase.charAt(Y) >= 97 && (int)frase.charAt(Y)<=172)
                vecesLetra[ (int)frase.charAt(Y)-97 ]++;

        }

        for(Y=0 ; Y < vecesLetra.length; Y++){
            if(vecesLetra[Y]>0){
                System.out.println("La palabra "+(char)(Y+97)+" tiene "+vecesLetra[Y]+" letras");
            }
        }
    }
    }
    

