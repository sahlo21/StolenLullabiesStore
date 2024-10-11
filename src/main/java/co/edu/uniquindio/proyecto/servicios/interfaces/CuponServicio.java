package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.modelo.entidades.Cupon;

import java.util.List;

public interface CuponServicio {
    int registrarCupon(Cupon cupon);
    int actualizarCupon(Cupon cupon);
    int eliminarCupon(Cupon cupon);
    List<Cupon> listarCupons();
    List<Cupon> buscarCuponesActivos();
    List<Cupon> buscarCuponesPorProducto(int productoId);
    Cupon obtenerCupon(int id);
    Boolean existeCupon(String codigo);
}
