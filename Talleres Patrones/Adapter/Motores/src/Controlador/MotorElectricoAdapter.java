/*
 * Autor: Nelson Santiago Roa Garzón
 * 15/02/2020 10:40:52 PM
 */
package Controlador;

public class MotorElectricoAdapter extends Motor {

    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter() {
        this.motorElectrico = new MotorElectrico();
    }

    @Override
    public void Encender() {
        motorElectrico.Conectar();
    }

    @Override
    public void Operar() {
        motorElectrico.Regular();
    }

    @Override
    public void Apagar() {
        motorElectrico.Desconectar();
    }

}
