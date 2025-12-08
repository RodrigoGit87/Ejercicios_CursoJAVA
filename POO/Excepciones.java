package Practicas_Rodrigo.POO;

public class Excepciones {
    static void main() {
        var num = 10;
        var num2 = 2;
//        double result = num / num2;
//        System.out.println(result);  10 / 0 da error aritmetico (no se puede dividir entre 0)
        /*Esta excepcion aritmetica provocará q el programa deje de funcionar. Para evitarlo usarmos el try catch
        * Try catch*/

//        try{
//            var result = num / num2;
//            System.out.println(result);
//        } catch (ArithmeticException e){ //Los parametros de catch especificamos el tipo de erro que esperamos.
//            // 'Exception' o 'RuntimeException' es el general. Después un carácter 'e' normalmente en forma de nombre.
//            IO.println(" ERROR " + e.getMessage());
//        }
//        IO.println(" java continua..");

        /* Try con múltiples catch */
        try{
            var result = num / num2;
            System.out.println(result);

            var name = "rodri";
            name = null;
            IO.println("Nombre: "+ name.toUpperCase()); // al definir name como null, el metodo toUpperCase dará error

        } catch (ArithmeticException e){ //Los parametros de catch especificamos el tipo de erro que esperamos.
            // 'Exception' o 'RuntimeException' es el general. Después un carácter 'e' normalmente en forma de nombre.
            IO.println(" Cuidado con dividir entre 0:  " + e.getMessage());
        } catch (NullPointerException e){
            System.out.println("ha ocurrido un error null  "+e.getMessage());
        } catch (Exception e){ // para asegurar q no hay otro errores, usamos el génerico
            System.out.println(" Error no esperado/desconocido");
        } finally { // Bloque finally es un bloque q siempre se ejecuta.
            System.out.println(" Fin del try catch");
        }

        IO.println(" java continua..");
    }
}
