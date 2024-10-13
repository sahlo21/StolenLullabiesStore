package co.edu.uniquindio.proyecto.servicios.implementacion;

import co.edu.uniquindio.proyecto.modelo.entidades.EstadoPago;
import co.edu.uniquindio.proyecto.modelo.entidades.Pago;
import co.edu.uniquindio.proyecto.repositorios.PagoRepo;
import co.edu.uniquindio.proyecto.servicios.interfaces.PagoServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class PagoServicioImpl implements PagoServicio {
    private final PagoRepo pagoRepo;
    @Override
    public Pago crearPago(Pago pago) throws Exception {
        return null;
    }

    @Override
    public Pago obtenerPagoPorId(int id) throws Exception {
        return null;
    }

    @Override
    public void cambiarEstadoPago(int id, EstadoPago nuevoEstado) throws Exception {

    }

    @Override
    public List<Pago> obtenerPagoPorPedido(int codigoPedido) throws Exception {
        return List.of();
    }
}
