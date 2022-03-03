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
public class Mate implements Textura{
    
    private String textura;
    
    public Mate(){
        this.setTextura();
    }

    @Override
    public void setTextura() {
        this.textura = "Mate";
    }

    @Override
    public String getTextura() {
        return this.textura;
    }
    
}
