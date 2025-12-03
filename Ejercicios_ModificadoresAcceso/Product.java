// 2. Crea una clase Product con el atributo privado price. 
// Añade el método setPrice(double price) que solo permita precios mayores a 0.
public class Product {
    private double price;

    public void setPrice(double price){
        if( price < 0){
            IO.println("Precio no válido.");
        } else {
            this.price = price;
        }
    }
    
}
