/**
 * 31/08/2019 07:32:27 PM
 * Autor: Santiago Roa
 */
package Fabricas;

import Equipamiento.Acero;
import Equipamiento.Arma;
import Equipamiento.Armadura;
import Equipamiento.EspadaBastarda;
import Personajes.Guerrero;
import Personajes.Heroe;

public class FabricaGuerrero implements AbstractFactory {

    @Override
    public Arma crearArma() {
        return new EspadaBastarda("Espada Bastarda de Caballero", 450, 0);
    }

    @Override
    public Armadura crearArmadura() {
        return new Acero("Amadura de Placas de Acero", 120, 0);
    }

    @Override
    public Heroe crearHeroe() {
        return new Guerrero("Gazef Stronoff \"El Capitán de la Guardia Imperial\"", 1500, 0);
    }

}
