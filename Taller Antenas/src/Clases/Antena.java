/**
 * 28/04/2019 07:26:49 PM
 * Autor: Santiago Roa
 */
package Clases;

public class Antena {

    protected double potencia;
    protected double SWR;
    protected int patronAntena;

    public Antena(double potencia, double SWR, int patronAntena) {

        this.potencia = potencia;
        this.SWR = SWR;
        this.patronAntena = patronAntena;
    }

}
