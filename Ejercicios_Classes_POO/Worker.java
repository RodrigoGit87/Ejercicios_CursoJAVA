package Practicas_Rodrigo.Ejercicios_Classes_POO;
//Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
public class Worker {
    String nombre;
    double salario;
//constructor
    public Worker(String nombre) {
        this.nombre = nombre;
        this.salario = salario;
    }
//metodo
    public void mostrarSalario (double salario){
        this.salario=salario;
        IO.println("El salario anual de "+ this.nombre + " es de: " + salario);
    }
//main
    static void main (){
        var currante1 = new Worker("Antonio");
        var currante2 = new Worker("pepito");
        currante1.mostrarSalario(24887.99);
        currante2.mostrarSalario(19261.88);
    }


}
