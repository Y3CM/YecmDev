package Ejercicios.ejercicio_4;

public class PushNotificacion implements Notificacion{

    @Override
    public void send(String message) {
        System.out.println("Enviando notificación push: " + message);
    }

   

}
