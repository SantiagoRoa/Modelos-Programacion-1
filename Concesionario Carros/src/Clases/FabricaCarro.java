package Clases;

import Carros.Sedan;
import Carros.Camioneta;
import Carros.Coupe;


public abstract class FabricaCarro{
    public abstract Sedan crearSedan(String color);
    public abstract Coupe crearCoupe(String color);
    public abstract Camioneta crearCamioneta(String color);
}
