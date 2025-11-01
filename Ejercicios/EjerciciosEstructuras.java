package Practicas_Rodrigo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class EjerciciosEstructuras {
    static void main(String[] args) {
        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] players = {"Gandalf", "DoctorSexo", "Empalador69", "Rosa Melano", "Brais", "Segarro Amego"};
        IO.println(players.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        IO.println(players [3]);
        players [3] = "PashaBiceps";
        IO.println(players [3]);
        // 3. Crea un ArrayList vacío.
        var listaVacia = new ArrayList<Integer>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        listaVacia.add (10);
        listaVacia.add (20);
        listaVacia.add (30);
        listaVacia.add (40);
        listaVacia.remove(2);
        //listaVacia.remove(Integer.valueOf(20)); <-Esta opcion para borrar por valor, en vez de por índice.
        IO.println(listaVacia);

        // 5. Crea un HashSet con 2 valores diferentes.
        var pinturasSet = new HashSet<String>();
        pinturasSet.add("rojo");
        pinturasSet.add("blanco");
        IO.println(pinturasSet.size());

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        pinturasSet.add("blanco");
        pinturasSet.add("amarillo");


        // 7. Elimina uno de los elementos del HashSet.
        pinturasSet.remove("blanco");
        IO.println(pinturasSet);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        var contactos = new HashMap<>();
        contactos.put("Elon Musk", "+10 987 456 321");
        contactos.put("El zanahorio", "+10 123 987 456");
        contactos.put("Perro Sanchez", "+34 69087690 ");

        // 9. Modifica uno de los contactos y elimina otro.
        contactos.remove("Perro Sanchez");
        contactos.replace("El zanahorio", "+69 123 456 789");
        IO.println(contactos);


        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.

    }
}