package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.modelo.entidades.Cupon;

import java.util.List;

public interface CuponServicio {
    int registrarCupon(Cupon cupon)throws Exception;
    int actualizarCupon(Cupon cupon)throws Exception;
    int eliminarCupon(Cupon cupon)throws Exception;
    List<Cupon> listarCupons()throws Exception;
    List<Cupon> buscarCuponesActivos()throws Exception;
    List<Cupon> buscarCuponesPorProducto(int productoId)throws Exception;
    Cupon obtenerCupon(int id)throws Exception;
    Boolean existeCupon(String codigo)throws Exception;
}
