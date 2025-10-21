package Notificaciones;

import Notificaciones.Notificacion;

public class FallidaState implements EstadoNotificacionState {
    @Override
    public String name(){ return "FALLIDA"; }
    @Override
    public void onEnter(Notificacion n){
        
    }
}
