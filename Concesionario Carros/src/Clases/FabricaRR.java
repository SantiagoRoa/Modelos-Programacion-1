package Clases;

import Carros.RRWraith;
import Carros.RRPhantom;
import Carros.RRCullinam;

public class FabricaRR extends FabricaCarro {

    @Override
    public RRPhantom crearSedan(String color) {
        return new RRPhantom(color);
    }

    @Override
    public RRWraith crearCoupe(String color) {
        return new RRWraith(color);
    }

    @Override
    public RRCullinam crearCamioneta(String color) {
        return new RRCullinam(color);
    }
}
