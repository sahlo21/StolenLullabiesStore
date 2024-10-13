package co.edu.uniquindio.proyecto.servicios.implementacion;

import co.edu.uniquindio.proyecto.modelo.entidades.DetallePedido;
import co.edu.uniquindio.proyecto.modelo.entidades.Pedido;
import co.edu.uniquindio.proyecto.repositorios.PedidoRepo;
import co.edu.uniquindio.proyecto.servicios.interfaces.PedidoServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class PedidoServicioImpl implements PedidoServicio {
    private final PedidoRepo pedidoRepo;
    @Override
    public Pedido crearPedido(Pedido pedido) throws Exception {
        return null;
    }

    @Override
    public List<Pedido> listarPedidos() throws Exception {
        return List.of();
    }

    @Override
    public Pedido obtenerPedidoPorCodigo(int codigo) throws Exception {
        return null;
    }

    @Override
    public Pedido actualizarPedido(Pedido pedido) throws Exception {
        return null;
    }

    @Override
    public void eliminarPedido(int codigo) throws Exception {

    }

    @Override
    public void agregarDetalleAlPedido(int codigoPedido, DetallePedido detallePedido) throws Exception {

    }

    @Override
    public void eliminarDetalleDelPedido(int codigoPedido, int codigoDetalle) throws Exception {

    }

    @Override
    public void aplicarCupon(int codigoPedido, String codigoCupon) throws Exception {

    }

    @Override
    public Double calcularTotalPedido(int codigoPedido) throws Exception {
        return 0.0;
    }
}
