package co.edu.uniquindio.proyecto.servicios.interfaces;
import co.edu.uniquindio.proyecto.modelo.entidades.Pedido;
import co.edu.uniquindio.proyecto.modelo.entidades.DetallePedido;

import java.util.List;

    public interface PedidoServicio {
        Pedido crearPedido(Pedido pedido);
        List<Pedido> listarPedidos();
        Pedido obtenerPedidoPorCodigo(int codigo);
        Pedido actualizarPedido(Pedido pedido);
        void eliminarPedido(int codigo);
        void agregarDetalleAlPedido(int codigoPedido, DetallePedido detallePedido);
        void eliminarDetalleDelPedido(int codigoPedido, int codigoDetalle);
        void aplicarCupon(int codigoPedido, String codigoCupon);
        Double calcularTotalPedido(int codigoPedido);
    }



}
