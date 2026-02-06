public class NotificacionClashRoyal extends Notificacion {

    protected NotificacionClashRoyal(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Se envio la notificacion de batalla \"" + mensaje + "\" a: " + receptorNotificacion);
    }
}