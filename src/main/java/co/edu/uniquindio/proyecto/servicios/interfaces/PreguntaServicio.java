package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.modelo.entidades.Pregunta;

import java.util.List;

public interface PreguntaServicio {
    int registrarPregunta(Pregunta pregunta)throws Exception;
    int actualizarPregunta(Pregunta pregunta)throws Exception;
    int eliminarPregunta(int id)throws Exception;
    Pregunta getPregunta(int id)throws Exception;
    List<Pregunta> getPreguntas()throws Exception;
    List<Pregunta> getPreguntasPorProducto(int idProducto)throws Exception;
    List<Pregunta> getPreguntasPorUsuario(int idUsuario)throws Exception;
    Pregunta responderPregunta(int idPregunta, String respuesta)throws Exception;
}
