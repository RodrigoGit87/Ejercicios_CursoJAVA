package Practicas_Rodrigo.Ejercicios_Herencia;

public class Main {
     static void main(){
        //Ejercicio 1. Superclase Vehicle
//        var vehiculo = new Vehicle();
//        vehiculo.brand = " Honda ";
//        vehiculo.move();
//        var coche = new Vehicle.Car();
//        coche.brand = " Cupra ";
//        coche.move();
//        coche.honk();

        //Ejercicio 2 Superclase Person
//        var estudiante = new Person.Student();
//        IO.println("el estudiante tiene la nota: ");
//        estudiante.study(false);

         //Ejercicio 3
//         var perro = new Animal.Dog();
//         var gato = new  Animal.Cat();
//         perro.setName("perruno");
//         gato.setName("gatuno");
//         gato.makeSound();
//         perro.makeSound();

         //Ejercicio 4
//         var manager1 = new Employee.Manager();
//         manager1.setName("Boomer boomerez");
//         manager1.setSalary(4765.69F);
//         manager1.setDepartment("Informática");
//         manager1.mostrarDatos();

         //Ejercicio 5
         var circulo = new Shape.Circle(6);
         var rectangulo = new Shape.Rectangle(3,11);
         IO.println(circulo.calcularArea());
         IO.println(rectangulo.calcularArea());


}
}
