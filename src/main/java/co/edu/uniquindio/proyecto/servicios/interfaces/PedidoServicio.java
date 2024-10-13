package co.edu.uniquindio.proyecto.servicios.interfaces;
import co.edu.uniquindio.proyecto.modelo.entidades.Pedido;
import co.edu.uniquindio.proyecto.modelo.entidades.DetallePedido;

import java.util.List;

    public interface PedidoServicio {
        Pedido crearPedido(Pedido pedido)throws Exception;
        List<Pedido> listarPedidos()throws Exception;
        Pedido obtenerPedidoPorCodigo(int codigo)throws Exception;
        Pedido actualizarPedido(Pedido pedido)throws Exception;
        void eliminarPedido(int codigo)throws Exception;
        void agregarDetalleAlPedido(int codigoPedido, DetallePedido detallePedido)throws Exception;
        void eliminarDetalleDelPedido(int codigoPedido, int codigoDetalle)throws Exception;
        void aplicarCupon(int codigoPedido, String codigoCupon)throws Exception;
        Double calcularTotalPedido(int codigoPedido)throws Exception;
    }




