/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package color;

/**
 *
 * @author jgale
 */
public class Liso implements Textura{
    
    private String textura;
    
    public Liso(){
        this.setTextura();
    }

    @Override
    public void setTextura() {
        this.textura = "Liso";
    }

    @Override
    public String getTextura() {
        return this.textura;
    }
    
}
