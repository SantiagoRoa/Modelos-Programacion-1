/**
 * 28/04/2019 09:37:35 PM
 * Autor: Santiago Roa
 */
package Clases;

public class Japones extends Numero {

    public Japones(int numero) {
        super(numero);
    }
    @Override
    public String traducir() {
        String numeros[] = new String[10];
        numeros[0] = "Ichi";
        numeros[1] = "Ni";
        numeros[2] = "San";
        numeros[3] = "Shi";
        numeros[4] = "Go";
        numeros[5] = "Roku";
        numeros[6] = "Nana";
        numeros[7] = "Hachi";
        numeros[8] = "Kyuu";
        numeros[9] = "Juu";
        String ans = numeros[this.numero - 1];
        return ans;

    }

}
