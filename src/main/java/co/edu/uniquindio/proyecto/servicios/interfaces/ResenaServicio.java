package co.edu.uniquindio.proyecto.servicios.interfaces;


import co.edu.uniquindio.proyecto.modelo.entidades.Resena;

import java.util.List;

public interface ResenaServicio {

    int crearReseña(Resena reseña);
    int actualizarReseña(Resena reseña);
    void eliminarReseña(int id);
    Resena obtenerReseña(int id);

    List<Resena> listarReseñas();

    List<Resena> listarReseñasPorProducto(int codigoProducto);

    List<Resena> listarReseñasPorUsuario(int idUsuario);

    double calcularCalificacionPromedio(int codigoProducto);
}
