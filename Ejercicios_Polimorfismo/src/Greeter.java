public class Greeter {
    protected String name;
    public void greet(){
        String mensaje = "Hola";
        IO.println(mensaje);
    }

    public void greet(String name){
        this.name = name;
        System.out.println("Hola " + name);
    }

}
