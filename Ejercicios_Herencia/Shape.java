package Practicas_Rodrigo.Ejercicios_Herencia;
// 5. Crea una clase abstracta Shape con un metodo calculateArea(). Luego implementa ese metodo en Circle y Rectangle.

//Poner abstract delante de class para declararla abstracta.
public abstract class Shape {
    public abstract double calcularArea();/*Asi se declara un metodo abstracto. Va a obligar a las demás clases a
    usar este metodo, pero habrá que añadir los parametros en cada metodo de las clases hijas*/

public static class Circle extends Shape{
    protected double radio;

    public Circle(double radio) { //Constructor
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
public static class Rectangle extends Shape{
    protected double base;
    protected double altura;

    public Rectangle(double base, double altura) {//Constructor
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }
}
}

