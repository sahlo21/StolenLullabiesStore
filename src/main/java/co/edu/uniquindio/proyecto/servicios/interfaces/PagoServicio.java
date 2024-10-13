package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.modelo.entidades.EstadoPago;
import co.edu.uniquindio.proyecto.modelo.entidades.Pago;

import java.util.List;

public interface PagoServicio {

    Pago crearPago(Pago pago)throws Exception;


    Pago obtenerPagoPorId(int id)throws Exception;


    void cambiarEstadoPago(int id, EstadoPago nuevoEstado)throws Exception;


    List<Pago> obtenerPagoPorPedido(int codigoPedido)throws Exception;

}
