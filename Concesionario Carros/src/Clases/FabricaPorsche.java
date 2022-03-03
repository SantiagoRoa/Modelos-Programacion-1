package Clases;

import Carros.PorschePanamera;
import Carros.PorscheCayenna;
import Carros.Porsche911;

public class FabricaPorsche extends FabricaCarro {

    @Override
    public PorschePanamera crearSedan(String color) {
        return new PorschePanamera(color);
    }

    @Override
    public Porsche911 crearCoupe(String color) {
        return new Porsche911(color);
    }

    @Override
    public PorscheCayenna crearCamioneta(String color) {
        return new PorscheCayenna(color);
    }
}
