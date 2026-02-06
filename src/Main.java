public class Main {

    public static void main(String[] args) {

        Notificacion[] notificaciones = new Notificacion[5];

        notificaciones[0] = new NotificacionCorreo("Pepito");
        notificaciones[1] = new NotificacionSMS("Juanito");
        notificaciones[2] = new NotificacionIG("Maria");
        notificaciones[3] = new NotificacionWhatsApp("Juan Mecanico");
        notificaciones[4] = new NotificacionClashRoyal("Steven");

        notificaciones[0].enviarMensaje("Hola mi amigo");
        notificaciones[1].enviarMensaje("Hola mi broco");
        notificaciones[2].enviarMensaje("Hola desde Instagram");
        notificaciones[3].enviarMensaje("Bienvenido al grupo de WhatsApp de la clase de mecanica");
        notificaciones[4].enviarMensaje("¡La batalla te espera en la Arena!");

    }
}

