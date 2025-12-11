package Practicas_Rodrigo.POO;
/*El polimorfismo permite q distintos objetos respondan de manera diferente al mismo metodo
* ES redefinir mecanismos de los metodos*/

public class Polimorfismo {
    static void main(){
        //Polimorfismo por herencia (sobreescritura)
        var animal1 = new Animal();
        animal1.sound();

        var dog = new Dog();
        dog.sound();

        //Polimorfismo por sobrecarga (El metodo con mismo nombre pero con diferente numero de argumentos o diferente tipo)
        var calculadora = new Calculadora();
        IO.println(calculadora.sum(3.33, 6.66));
        IO.println(calculadora.sum(3,6));
    }

    //POLIMORFISMO POR HERENCIA (sobreescritura)
public static class Animal{
    public void sound (){
        IO.println("Algún sonido");
    }
    public void eat(){
        IO.println("el animal come");
    }
}
public static class Dog extends Animal{
    @Override
    public void sound() {
        // super.sound(); <-- Si utilizo el super.'X' estaría llamando al metodo original de la superclase
        IO.println("Guau, guau, guau !"); //pongo el codigo q necesito en mi subclase Dog
    }
    //Al empezar a escribir el nombre del metodo, me sale ventanita y al pinchar se pone directamente el override.
    
    @Override
    public void eat() {
        IO.println("está comiendo carne");
    }
}
    //POLIMORFISMO POR SOBRECARGA
    public static class Calculadora {

        public int sum (int a, int b){
            return a+b;
        }

        public double sum (double a, double b){ //Mismo nombre de metodo, distinto tipo de variables
            return a+ b;
        }
    }

}
