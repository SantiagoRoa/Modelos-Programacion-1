package Clases;

import Carros.AcuraMDX;
import Carros.AcuraNSX;
import Carros.AcuraTLX;

public class FabricaAcura extends FabricaCarro {

    @Override
    public AcuraTLX crearSedan(String color) {
        return new AcuraTLX(color);
    }

    @Override
    public AcuraNSX crearCoupe(String color) {
        return new AcuraNSX(color);
    }

    @Override
    public AcuraMDX crearCamioneta(String color) {
        return new AcuraMDX(color);
    }
}
