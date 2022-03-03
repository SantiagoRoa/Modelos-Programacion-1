/**
 * 28/04/2019 09:37:55 PM
 * Autor: Santiago Roa
 */
package Clases;

public class Frances extends Numero {

    public Frances(int numero) {
        super(numero);
    }

    @Override
    public String traducir() {
        String numeros[] = new String[10];
        numeros[0] = "Un";
        numeros[1] = "Deux";
        numeros[2] = "Trois";
        numeros[3] = "Quatre";
        numeros[4] = "Cinq";
        numeros[5] = "Six";
        numeros[6] = "Sept";
        numeros[7] = "Huit";
        numeros[8] = "Neuf";
        numeros[9] = "Dix";
        String ans = numeros[this.numero - 1];
        return ans;

    }
}
