package Notificaciones;

import Notificaciones.EstadoNotificacionState;
import Notificaciones.Notificacion;

public class EnviadaState implements EstadoNotificacionState {
    @Override
    public String name(){ return "ENVIADA"; }
    @Override
    public void onEnter(Notificacion n){
        
    }
}
