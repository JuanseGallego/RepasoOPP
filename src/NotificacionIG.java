public class NotificacionIG extends Notificacion {

    protected NotificacionIG(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Se envió el mensaje \"" + mensaje + "\" por Instagram a: " + receptorNotificacion);
    }
}
