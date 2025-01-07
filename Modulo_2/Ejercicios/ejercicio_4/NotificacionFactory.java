package Ejercicios.ejercicio_4;

public class NotificacionFactory {
    public static Notificacion sendNotificacion(TipoNotificacion tipo){
            switch (tipo) {
                case CORREO:
                   return new CorreoNotificacion();
                case SMS:
                   return new SMSNotificacion();
                case PUSH:
                   return new PushNotificacion();
            
                default:
                    throw new IllegalArgumentException("Tipo de notificacion desconocido");
            }
    }
}
