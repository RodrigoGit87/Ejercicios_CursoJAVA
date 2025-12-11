import java.util.Scanner;

// 5. Crea una clase Vehicle con un metodo start(). Luego crea Car, Bike y Truck que sobrescriban ese metodo.
// Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
public class Vehicle {
    protected boolean power;
    protected String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void start(){
        Scanner sc=  new Scanner(System.in);
        System.out.println("¿Encender el vehiculo? Escribe Y (para Si) o N (para No) ");

            String bandera = sc.nextLine().trim();
            if (bandera.equalsIgnoreCase("Y")){
                this.power = true;
                IO.println(" El vehiculo"+ this.name + "ha arrancado !");
            } else if(bandera.equalsIgnoreCase("N")){
                this.power = false;
                System.out.println(" El vehiculo"+ this.name +"no ha iniciado el arranque ");
            } else {
                this.power = false;
                System.out.println("Opción desconocida ('" + bandera + "'). Se asume apagado.");
            }

    }

public static class Car extends Vehicle{

    @Override
    public void start() {
        super.start();
    }
    }
public static class  Bike extends Vehicle{
    @Override
    public void start() {
        super.start();
    }
}
public static class Truck extends Vehicle{
    @Override
    public void start() {
        super.start();
    }
}
}
