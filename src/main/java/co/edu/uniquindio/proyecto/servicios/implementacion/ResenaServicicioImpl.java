package co.edu.uniquindio.proyecto.servicios.implementacion;

import co.edu.uniquindio.proyecto.modelo.entidades.Resena;
import co.edu.uniquindio.proyecto.repositorios.ResenaRepo;
import co.edu.uniquindio.proyecto.servicios.interfaces.ResenaServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ResenaServicicioImpl implements ResenaServicio {
    private final ResenaRepo repo;
    @Override
    public int crearReseña(Resena reseña) {
        return 0;
    }

    @Override
    public int actualizarReseña(Resena reseña) {
        return 0;
    }

    @Override
    public void eliminarReseña(int id) {

    }

    @Override
    public Resena obtenerReseña(int id) {
        return null;
    }

    @Override
    public List<Resena> listarReseñas() {
        return List.of();
    }

    @Override
    public List<Resena> listarReseñasPorProducto(int codigoProducto) {
        return List.of();
    }

    @Override
    public List<Resena> listarReseñasPorUsuario(int idUsuario) {
        return List.of();
    }

    @Override
    public double calcularCalificacionPromedio(int codigoProducto) {
        return 0;
    }
}
