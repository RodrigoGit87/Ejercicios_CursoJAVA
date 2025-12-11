// 6. Crea una clase Notification con metodo send(), y subclases EmailNotification, SMSNotification.
//  Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.

public class Notification {
    protected String mensaje;

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public void send(){
        IO.println("Mensaje genérico: " + mensaje);
    }

public static class EmailNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Enviando email: " + mensaje);
    }
}
public static class SMSNotification extends Notification{
    @Override
    public void send() {
        IO.println(" Enviando SMS: " + mensaje);
    }
}

}
