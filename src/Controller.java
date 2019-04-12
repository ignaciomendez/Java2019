import javafx.application.Application;
import javafx.stage.Stage;

public class Controller {

    public static void main(String[] args) {

    //System.out.println("Hello World!");

    Car miAuto;
    miAuto = new Car();

    miAuto.setColor("rojo");
    miAuto.setPatente("EAN100");

    System.out.println("El color del auto es " + miAuto.getColor() + " y la patente es " + miAuto.getPatente() +".");

}

}