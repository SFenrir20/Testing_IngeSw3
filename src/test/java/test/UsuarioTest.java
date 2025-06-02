package test;

import app.Notificador;
import app.Usuario;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


class UsuarioTest {

    @Test
    void testNotificacion() {
        Notificador mock = mock(Notificador.class);
        Usuario usuario = new Usuario(mock);

        usuario.enviarMensaje("Hola");

        verify(mock).notificar("Hola");
    }
}
