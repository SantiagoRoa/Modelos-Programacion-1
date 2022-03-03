/**
 * 28/04/2019 09:37:49 PM
 * Autor: Santiago Roa
 */
package Clases;

public class Ingles extends Numero {

    public Ingles(int numero) {
        super(numero);
    }
    @Override
    public String traducir() {
        String numeros[] = new String[10];
        numeros[0] = "One";
        numeros[1] = "Two";
        numeros[2] = "Three";
        numeros[3] = "Four";
        numeros[4] = "Five";
        numeros[5] = "Six";
        numeros[6] = "Seven";
        numeros[7] = "Eight";
        numeros[8] = "Night";
        numeros[9] = "Ten";
        String ans = numeros[numero - 1];
        return ans;
    }

}
