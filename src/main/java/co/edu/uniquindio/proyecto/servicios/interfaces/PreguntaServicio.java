package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.modelo.entidades.Pregunta;

import java.util.List;

public interface PreguntaServicio {
    int registrarPregunta(Pregunta pregunta);
    int actualizarPregunta(Pregunta pregunta);
    int eliminarPregunta(int id);
    Pregunta getPregunta(int id);
    List<Pregunta> getPreguntas();
    List<Pregunta> getPreguntasPorProducto(int idProducto);
    List<Pregunta> getPreguntasPorUsuario(int idUsuario);
    Pregunta responderPregunta(int idPregunta, String respuesta);
}
