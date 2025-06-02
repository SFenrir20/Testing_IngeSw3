package app;

public class Usuario {
    private Notificador notificador;

    public Usuario(Notificador notificador) {
            this.notificador = notificador;
    }

    public void enviarMensaje(String mensaje) {
        notificador.notificar(mensaje);
    }
}
