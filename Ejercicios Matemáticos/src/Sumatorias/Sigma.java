/**
 * 26/04/2019 08:25:54 PM
 * Autor: Santiago Roa
 */
package Sumatorias;

public class Sigma {

    int exponente;
    int limiteSup;

    Sigma suma = null;

    public Sigma(int exponente, int limiteSup) {
        this.exponente = exponente;
        this.limiteSup = limiteSup;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    public void setLimiteSup(int limiteSup) {
        this.limiteSup = limiteSup;
    }

    public int sumarKesimo() {

        int ans = 0;
        int n = this.limiteSup;

        switch (this.exponente) {
            case 1:
                this.exponente = 1;
                ans = (n * (n + 1)) / 2;
                return ans;
            case 2:
                this.exponente = 2;
                ans = (n * (n + 1) * (2 * n + 1)) / 6;
                return ans;
            case 3:
                this.exponente = 3;
                ans = ((n * (n + 1)) / 2) ^ 2;
                return ans;
            case 4:
                this.exponente = 4;
                ans = (n * (n + 1) * (2 * n + 1) * (3 * (n ^ 2) + 3 * n - 1)) / 30;
                return ans;
            default:
                return ans;
        }

    }

}
