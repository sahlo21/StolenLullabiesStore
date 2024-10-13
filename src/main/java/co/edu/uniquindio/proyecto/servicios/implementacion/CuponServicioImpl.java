package co.edu.uniquindio.proyecto.servicios.implementacion;

import co.edu.uniquindio.proyecto.modelo.entidades.Cupon;
import co.edu.uniquindio.proyecto.repositorios.CuponRepo;
import co.edu.uniquindio.proyecto.servicios.interfaces.CuponServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CuponServicioImpl implements CuponServicio {
    private final CuponRepo cuponRepo;
    @Override
    public int registrarCupon(Cupon cupon) throws Exception {
        return 0;
    }

    @Override
    public int actualizarCupon(Cupon cupon) throws Exception {
        return 0;
    }

    @Override
    public int eliminarCupon(Cupon cupon) throws Exception {
        return 0;
    }

    @Override
    public List<Cupon> listarCupons() throws Exception {
        return List.of();
    }

    @Override
    public List<Cupon> buscarCuponesActivos() throws Exception {
        return List.of();
    }

    @Override
    public List<Cupon> buscarCuponesPorProducto(int productoId) throws Exception {
        return List.of();
    }

    @Override
    public Cupon obtenerCupon(int id) throws Exception {
        return null;
    }

    @Override
    public Boolean existeCupon(String codigo) throws Exception {
        return null;
    }
}
