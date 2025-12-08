package Practicas_Rodrigo.POO;

public class Composicion {

    static void main (String[] args){
        //Composicion (" tiene un" )
        /*Hay q diferenciar entre heredar y componer.
        * Cuando compongo, estoy diciendo q una clase es un atributo de otra, la cual al instanciarla,
        * va a obligar a usar ese atributo 'especial'.
        * Ejemplo el coche no hereda (no es) un motor. si no que, el coche compone (tiene un) motor
        * A diferencia de la herencia que deciamos q un Perro (es un)(hereda de) Animal*/

        var car = new Car(); // Instancia de coche

        car.motor.on(); // El coche tiene un motor que está/tiene el metodo on (podríamos crear el off)

    }

    //Clase motor
    public static class Engine {
        //metodo encendido
        public void on(){
            System.out.println(" motor encendido ");
        }
    }

    //Clase coche
    public static class Car{

        Engine motor = new Engine(); //Inicializo un atributo con la clase Engine

    }

}
