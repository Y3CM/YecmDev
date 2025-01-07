package Ejercicios.ejercicio_4;

public class Main {
    public static void main(String[] args) {
        Notificacion correo1 = NotificacionFactory.sendNotificacion(TipoNotificacion.CORREO);
        Notificacion telefono1 = NotificacionFactory.sendNotificacion(TipoNotificacion.PUSH);
        Notificacion SMS1 = NotificacionFactory.sendNotificacion(TipoNotificacion.SMS);
        correo1.send("Hola! Este es un correo de prueba.");
        telefono1.send("Esto es un push de prueba.");
        SMS1.send("Esto es un SMS de prueba.");
    }

}
