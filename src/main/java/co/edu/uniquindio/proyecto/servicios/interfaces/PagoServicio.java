package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.modelo.entidades.Pago;

import java.util.List;

public interface PagoServicio {

    Pago crearPago(Pago pago);


    Pago obtenerPagoPorId(Long id);


    void cambiarEstadoPago(Long id, String nuevoEstado);


    List<Pago> obtenerTodosLosPagosPorPedido(int codigoPedido);

}
