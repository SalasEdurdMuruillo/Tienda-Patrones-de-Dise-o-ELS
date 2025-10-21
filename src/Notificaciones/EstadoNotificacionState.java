package Notificaciones;

import Notificaciones.Notificacion;

public interface EstadoNotificacionState {
    String name();
    void onEnter(Notificacion n);
}
