/**
 * 28/04/2019 09:38:23 PM
 * Autor: Santiago Roa
 */
package Clases;

public abstract class Numero {

    int numero;

    public Numero(int numero) {
        this.numero = numero;
    }
    public abstract String traducir();
}
