package Practicas_Rodrigo.Ejercicios_Classes_POO;
// 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
public class Product {
    double precio;
    String name;

    //Constructor
    public Product(String name) {
        this.name = name;
    }

    //Método Descuento
    public double aplicarDescuento20 (double precio){
        this.precio=precio;
      double precioConDescuento= precio - (precio * 0.20);//descuento del 20%
      return precioConDescuento;
    }
    //main
    public static void main (){
        var producto001 = new Product("champú");
        var producto002 = new Product("colonia");
        var producto003 = new Product("dildo de schwarokski");

        //llamada a metodo
       IO.println(producto003.aplicarDescuento20(1000.69));
       IO.println(producto002.aplicarDescuento20(8.10));
       IO.println(producto001.aplicarDescuento20(3));
    }
}
