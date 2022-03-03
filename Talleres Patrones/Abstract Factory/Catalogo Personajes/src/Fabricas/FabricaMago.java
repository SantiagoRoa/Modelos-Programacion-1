/**
 * 31/08/2019 07:32:39 PM
 * Autor: Santiago Roa
 */
package Fabricas;

import Equipamiento.Arma;
import Equipamiento.Armadura;
import Equipamiento.Baston;
import Equipamiento.Tela;
import Personajes.Heroe;
import Personajes.Mago;

public class FabricaMago implements AbstractFactory {

    @Override
    public Arma crearArma() {
        return (Arma) new Baston("Grán Bastón de Archimago", 0, 475);
    }

    @Override
    public Armadura crearArmadura() {
        return (Armadura) new Tela("Capucha de Sabio", 20, 150);
    }

    @Override
    public Heroe crearHeroe() {
        return new Mago("Ainz Ooal Gown \"El rey Liche\"", 450, 850);
    }

}
