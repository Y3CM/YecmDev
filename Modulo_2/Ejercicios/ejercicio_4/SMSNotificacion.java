package Ejercicios.ejercicio_4;

public class SMSNotificacion implements Notificacion {

    @Override
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }

   

}
