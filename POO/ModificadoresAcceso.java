// Modificadores de acceso

/*
 * public: Acceso total, se puede acceder desde cualquier clase y archivo java.
 * private: Acceso restringido, solo se puede acceder desde la misma clase
 * protected: Acceso restringido, solo se puede acceder desde la misma clase y las subclases
 * default: Acceso restringido, solo se puede acceder desde la misma clase y mismo paquete
 */
public class ModificadoresAcceso {

  // Atributos
  protected String name;
  private int edad;
  final private String id;/*
                           * Final tampoco se puede modificar ni desde la misma clase.
                           * y private, nadie lo puede modificar desde fuera de la clase.
                           */

  // Constructor
  public ModificadoresAcceso(String name, int edad, String id) {
    this.name = name;
    setEdad(edad); // Llamamos al setter, que ya modifica this.edad internamente
    this.id = id;
  }

  /*
   * Como final y private, no se puede modificar. LA solucion son los
   * métodos setters(modificar) y getters (obtener)
   */

  public void setEdad(int edad) {
    if (edad > 18) {
      this.edad = edad;
    } else
      IO.println("La edad debe ser mayor de 18 años");
  }

  public int getEdad() {
    return edad;
  }

  public String getID() {
    return id;
  }

  // método mostrar datos
  public void mostrarDatos() {
    IO.println("\n Nombre: " + name + " edad: " + edad + " dni: " + id);
  }

  public static void main(String[] args) {
    var persona = new ModificadoresAcceso("persona1", 17, "12345678A");
    persona.setEdad(38);
    persona.getEdad();
    persona.mostrarDatos();

  }
}