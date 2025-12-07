package Practicas_Rodrigo.Ejercicios_Herencia;
// 3. Crea una clase Animal con el metodo makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese metodo.

public class Animal {
    protected String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void makeSound(){
        IO.println("Undefined Sound");
    }

public static class Dog extends Animal {

        @Override
    public void makeSound() {
        IO.println("El animal "+ getName()+ " hace Woof");
    }
}
public static class Cat extends Animal{
    @Override
    public void makeSound() {
        IO.println("El animal " + getName()+ " hace Meow");
    }
}

}
