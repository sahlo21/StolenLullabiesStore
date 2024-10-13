package co.edu.uniquindio.proyecto.servicios.implementacion;

import co.edu.uniquindio.proyecto.modelo.entidades.DetallePedido;
import co.edu.uniquindio.proyecto.repositorios.DetallePedidoRepo;
import co.edu.uniquindio.proyecto.servicios.interfaces.DetallePedidoServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class DetallePedidoServicioImpl implements DetallePedidoServicio {
    private final DetallePedidoRepo detallePedidoRepo;

    @Override
    public int registrarDetallePedidoServicio(DetallePedidoServicio detallePedidoServicio) throws Exception {
        return 0;
    }

    @Override
    public int actualizarDetallePedidoServicio(DetallePedidoServicio detallePedidoServicio) throws Exception {
        return 0;
    }

    @Override
    public int eliminarDetallePedidoServicio(int id) throws Exception {
        return 0;
    }

    @Override
    public List<DetallePedidoServicio> listarDetallePedidoServicio() throws Exception {
        return List.of();
    }

    @Override
    public DetallePedido obtenerDetallePedidoServicio(int id) throws Exception {
        return null;
    }

    @Override
    public List<DetallePedido> obtenerDetallesPorPedido(int pedidoId) throws Exception {
        return List.of();
    }

    @Override
    public Double calcularSubtotal(DetallePedido detallePedido) throws Exception {
        return 0.0;
    }
}
