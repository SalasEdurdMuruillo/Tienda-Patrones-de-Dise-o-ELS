package Notificaciones;

public class PendienteState implements EstadoNotificacionState {
    @Override
    public String name(){ return "PENDIENTE"; }
    @Override
    public void onEnter(Notificacion n){
        
    }
}
