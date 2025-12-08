
// 1. Crea una clase Animal con el metodo makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban
//  ese metodo con sonidos diferentes. Llama al metodo desde una lista de Animal.
public class Animal {
    protected String name;
    protected String clase;
    //constructor
    public Animal(String name, String clase){
        this.name = name;
        this.clase = clase;
    }

    //metodo
    public void makeSound(){
        IO.println(" Sonido indefinido ");
    }
public static class Dog extends Animal{
        public Dog(String name, String clase){
            super(name, clase);
        }
    @Override
    public void makeSound() {
        IO.println("El " +this.clase+", "+this.name +" hace: Woof, Woof!");
    }
}
public static class Cat extends Animal{
        public Cat (String name, String clase){
            super(name, clase);

        }

        @Override
    public void makeSound() {
            IO.println("El " +this.clase+", "+this.name +" hace: meoow");
    }
}
public static class Cow extends Animal{

    public Cow(String name, String clase) {
        super(name, clase);
    }

    @Override
    public void makeSound() {
        IO.println("El " +this.clase+", "+this.name +" hace: Mooooo");
    }
}
}
