/**
 * 31/08/2019 07:32:14 PM
 * Autor: Santiago Roa
 */
package Fabricas;

import Equipamiento.ArcoMagico;
import Equipamiento.Arma;
import Equipamiento.Armadura;
import Equipamiento.Cuero;
import Personajes.Arquero;
import Personajes.Heroe;

public class FabricaArquero implements AbstractFactory {

    @Override
    public Arma crearArma() {
        return new ArcoMagico("Arco Mágico de Jinete", 250, 150);
    }

    @Override
    public Armadura crearArmadura() {
        return new Cuero("Armadura de Cuero Encantada", 75, 52);
    }

    @Override
    public Heroe crearHeroe() {
        return (Heroe) new Arquero("Imina Elfrieden \"La Princesa Elfa\"", 750, 320);
    }

}
