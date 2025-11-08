package Practicas_Rodrigo.Estructuras;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    static void main() {
        //For - contador
        for (int i = 1; i <= 5; i++) {
            IO.println("Attack: " + i);
        }
        //recorrer un Array
        String[] nombre = {"Rodri", "Sandra", "Lucia", "Virgi", "Tom"};
        for (int n = 0; n < nombre.length; n++) {
            IO.println("Nombre: " + nombre[n]);
        }
        //Recorrer con for-each
        for (String familia : nombre) {
            IO.println(familia);
        }
        //Recorrer un HashSet
        HashSet<Integer> cartas = new HashSet<>();
        cartas.add(1);
        cartas.add(2);
        cartas.add(3);
        cartas.add(4);
        cartas.add(5);
        cartas.add(6);
        cartas.add(7);
        cartas.add(8);
        cartas.add(9);
        cartas.add(10);
        cartas.add(11);
        cartas.add(12);

        for (Integer mazo : cartas) {
            IO.println("Carta del Mazo:" + mazo);
        }
    /*Para recorrer un Map (Que funciona como clave:valor) necesitamos una manera de que
        cada par clave:valor sea único.
     La manera es con Map.Entry y la funcion .entrySet() Veamos; */
        //Tenemos un hashmap
        HashMap<String, String> email = new HashMap<>();
        email.put("Doom", "doomslayer@bethesda.com");
        email.put("Gandal", "el_gris_69@lotr.com");
        email.put("Elver", "galarga@gmail.com");
        email.put("Susa", "nahoria@tinder.com");
        // el ciclo for each para un HashMap tiene que quedar;
        for (Map.Entry<String, String> correos : email.entrySet()) {
            IO.println("Correos de: "+ correos);
        }
        //Si solo queremos recorrer la clave
        for (Map.Entry<String, String> correos : email.entrySet()) {
            IO.println("Correos de: "+ correos.getKey());
        //Si solo queremos recorrer el value
            IO.println("Correos de: "+ correos.getValue());}

    // Loop While
        int index = 1;
    while (index <= 10){
        IO.println("While: "+index);
        index++;
    }
        //While - Array (usamos el array de antes)
        int i=0;
        while (i < nombre.length){
            IO.println("Nombre: " + nombre[i]);
            i++;
        }
        /*podemos hacer que mientras recorre el array si encuentra algo q queremos
        haga algo. Ejemplo: */
        i=0;
        boolean encontrar = false;
        while (!encontrar){
            if (nombre[i].equals("Tom")){
            IO.println("Hay un perro en el array !");
            encontrar= true;
            }
            i++;
        }
    //Loop Do-While (Asegura al menos una iteración)
        i=0;
        do{
            IO.println("Do while: "+ i);
            i++;
        } while (i<=6);
    }
}