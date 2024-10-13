package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.modelo.entidades.DetallePedido;

import java.util.List;

public interface DetallePedidoServicio {
    int registrarDetallePedidoServicio(DetallePedidoServicio detallePedidoServicio)throws Exception;
    int actualizarDetallePedidoServicio(DetallePedidoServicio detallePedidoServicio)throws Exception;
    int eliminarDetallePedidoServicio(int id)throws Exception;
    List<DetallePedidoServicio> listarDetallePedidoServicio()throws Exception;
    DetallePedido obtenerDetallePedidoServicio(int id)throws Exception;
    List<DetallePedido> obtenerDetallesPorPedido(int pedidoId)throws Exception;
    Double calcularSubtotal(DetallePedido detallePedido)throws Exception;
}
