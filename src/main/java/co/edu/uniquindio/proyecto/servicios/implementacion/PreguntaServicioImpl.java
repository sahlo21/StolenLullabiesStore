package co.edu.uniquindio.proyecto.servicios.implementacion;

import co.edu.uniquindio.proyecto.modelo.entidades.Pregunta;
import co.edu.uniquindio.proyecto.repositorios.PreguntaRepo;
import co.edu.uniquindio.proyecto.servicios.interfaces.PreguntaServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class PreguntaServicioImpl implements PreguntaServicio {
    private final PreguntaRepo preguntaRepo;
    @Override
    public int registrarPregunta(Pregunta pregunta) throws Exception {
        return 0;
    }

    @Override
    public int actualizarPregunta(Pregunta pregunta) throws Exception {
        return 0;
    }

    @Override
    public int eliminarPregunta(int id) throws Exception {
        return 0;
    }

    @Override
    public Pregunta getPregunta(int id) throws Exception {
        return null;
    }

    @Override
    public List<Pregunta> getPreguntas() throws Exception {
        return List.of();
    }

    @Override
    public List<Pregunta> getPreguntasPorProducto(int idProducto) throws Exception {
        return List.of();
    }

    @Override
    public List<Pregunta> getPreguntasPorUsuario(int idUsuario) throws Exception {
        return List.of();
    }

    @Override
    public Pregunta responderPregunta(int idPregunta, String respuesta) throws Exception {
        return null;
    }
}
