// 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes
// tipos de parámetros (String, int, double). Llama a cada uno desde main.

public class Printer {
    protected String name;
    protected int numero;
    protected boolean impresionColor;

    // metodo 1
    public void print(String name){
        this.name=name;
        IO.println("nombre de impresora: " + name);
    }
    // metodo 2
    public void print(int numeroSerie){
        this.numero = numeroSerie;
        IO.println("numero de serie: " + numeroSerie);
    }
    // metodo 3
    public void print(boolean color ){
        this.impresionColor = color;
        System.out.println("imprime a color? : " + color);
    }

}
