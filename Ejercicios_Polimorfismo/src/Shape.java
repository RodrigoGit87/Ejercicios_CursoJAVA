// 2. Crea una clase Shape con el metodo calculateArea().
//  Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e
//  imprimir el área de varias figuras.

public class Shape {

    public double calcularArea() {
        return 0;
    }

    //Clase Círculo
public static class Circle extends Shape{
    protected double radio;
    //constructor
    public Circle(double radio) {
        this.radio = radio;
    }//metodo sobreescrito
    @Override
    public double calcularArea() {
        IO.print("Circulo: ");
        return Math.PI * Math.pow(radio, 2);
    }
}
//Clase REctangulo
public static class Rectangle extends Shape{
    protected double base;
    protected double altura;
    //constructor
    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    //metodo sobreescrito
    @Override
    public double calcularArea() {
        System.out.print("Rectángulo: ");
        return base * altura;
    }
    //Añado calcular perimetro
    public double calcularPerimetro(){
        return 2* (base * altura);
    }
}

}
