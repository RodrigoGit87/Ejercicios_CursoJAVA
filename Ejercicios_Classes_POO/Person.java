package Practicas_Rodrigo.Ejercicios_Classes_POO;
import java.util.ArrayList;

// 9. Crea varios objetos Person y guárdalos en un ArrayList.
public class Person {
    //Atributos
    String name;
    int age;

    public Person(String name, int age){
        this.name= name;
        this.age=age;
    }
//main
    static void main (){
        var persona1 = new Person("Gandalf", 81);
        var persona2 = new Person("german", 33);
        var persona3 = new Person("rodri", 38);
        var persona4 = new Person("luis", 21);
        var persona5 = new Person("John Sins", 40);
    //Arraylist
        var usuarios = new ArrayList<String>();
        usuarios.add(persona1.toString());
        usuarios.add(persona2.toString());
        usuarios.add(persona3.toString());
        usuarios.add(persona4.toString());
        usuarios.add(persona5.toString());

        /*
        * Misma forma de añadir pero más 'pro', con ciclo for
        * for (Person person : Arrays.asList (persona1, persona2, persona3, persona4, persona5)){
        * usuarios.add(person.toString());
        * }
        * */

        IO.println("tamaño del array: "+ usuarios.size());
    }

}
