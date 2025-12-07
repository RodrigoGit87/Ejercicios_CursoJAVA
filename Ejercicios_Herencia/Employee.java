package Practicas_Rodrigo.Ejercicios_Herencia;
// 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.

public class Employee {
    protected String name;
    protected float salary;

    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }
    //Getter
    public String getName(){
        return this.name;
    }
    public float getSalary(){
        return this.salary;
    }
    //Clase hija Manager
public static class Manager extends Employee{
    protected String department;
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
    public void mostrarDatos(){
        IO.println("el manager "+getName()+", en el departamento "+ getDepartment()  +" ,tiene un salario de : "+getSalary() +"€");
    }
}
}
