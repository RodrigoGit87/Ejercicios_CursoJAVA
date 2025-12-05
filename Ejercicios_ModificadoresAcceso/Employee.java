// 7. Crea una clase Employee con el atributo privado salary.
// Agrega el metodo raiseSalary(double percent) que solo permita aumentos positivos.

public static class Employee {
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //metodo con try catch :P
    public void raiseSalary(double percent) {
        try {
            if (percent <= 0) {
                setSalary(salary);
                IO.print("El aumento debe ser positivo, ingrese un nuevo valor positivo");
            } else {
                var salarioToral = salary += percent;
                IO.println("El salario total es: " + salarioToral);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            Scanner sc = new Scanner(System.in);
            percent = sc.nextDouble();
            raiseSalary(percent);
        }
    }
}
    static void main (){
        var empleado = new Employee();
        empleado.setSalary(3000.22);
        empleado.raiseSalary(-100.22);
    }

