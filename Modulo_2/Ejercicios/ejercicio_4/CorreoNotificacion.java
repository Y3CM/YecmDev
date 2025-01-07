package Ejercicios.ejercicio_4;

public class CorreoNotificacion implements Notificacion{

    @Override
    public void send(String message) {
        System.out.println("Enviando correo: " + message);
    }

 
}
