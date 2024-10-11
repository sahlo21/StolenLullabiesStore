package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.modelo.entidades.DetallePedido;

import java.util.List;

public interface DetallePedidoServicio {
    int registrarDetallePedidoServicio(DetallePedidoServicio detallePedidoServicio);
    int actualizarDetallePedidoServicio(DetallePedidoServicio detallePedidoServicio);
    int eliminarDetallePedidoServicio(int id);
    List<DetallePedidoServicio> listarDetallePedidoServicio();
    DetallePedido obtenerDetallePedidoServicio(int id);
    List<DetallePedido> obtenerDetallesPorPedido(Long pedidoId);
    Double calcularSubtotal(DetallePedido detallePedido);
}
