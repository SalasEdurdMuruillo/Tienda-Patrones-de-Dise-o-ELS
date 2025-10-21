/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notificaciones;

import Facturacion.Factura;
import Notificaciones.CanalNotificacion;
import Notificaciones.EstadoNotificacion;
import Notificaciones.PendienteState;
import java.time.LocalDateTime;

/**
 * Clase que representa una notificación generada a partir de una factura.
 * Aplica el patrón State para manejar los diferentes estados de la notificación.
 * 
 * @author Eduard Salas Murillo
 */
public class Notificacion {

    private int id;
    private Factura factura;
    private CanalNotificacion canal;
    private EstadoNotificacion estado; 
    private EstadoNotificacionState estadoState; 
    private LocalDateTime fecha;

    
    public Notificacion(int id, Factura factura, CanalNotificacion canal) {
        this.id = id;
        this.factura = factura;
        this.canal = canal;
        this.estado = EstadoNotificacion.PENDIENTE;
        this.estadoState = new PendienteState();
        this.estadoState.onEnter(this);
        this.fecha = LocalDateTime.now();
    }

   
    public int getId() { return id; }
    public Factura getFactura() { return factura; }
    public CanalNotificacion getCanal() { return canal; }
    public EstadoNotificacion getEstado() { return estado; }
    public LocalDateTime getFecha() { return fecha; }
    
    public void setEstado(EstadoNotificacion e) {
        this.estado = e;
        switch (e) {
            case PENDIENTE -> this.estadoState = new PendienteState();
            case ENVIADA -> this.estadoState = new EnviadaState();
            case FALLIDA -> this.estadoState = new FallidaState();
            default -> this.estadoState = new PendienteState();
        }
        this.estadoState.onEnter(this);
    }

   
    public String getEstadoName() {
        return this.estadoState != null ? this.estadoState.name() : this.estado.name();
    }

    
    @Override
    public String toString() {
        return "Notificacion{" +
                "id=" + id +
                ", factura=" + factura +
                ", canal=" + canal +
                ", estado=" + estado +
                ", fecha=" + fecha +
                '}';
    }
}
