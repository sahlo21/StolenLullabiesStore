package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.modelo.entidades.Pregunta;
import co.edu.uniquindio.proyecto.modelo.entidades.Producto;

import java.util.List;

public interface ProductoServicio {
    int registrarProducto(Producto producto);
    int actualizarProducto(Producto producto);
    int eliminarProducto(Producto producto);
    List<Producto> listarProductos();
    List<Producto> buscarProductoPorNombre(String nombre);
    List<Producto> buscarProductoPorCategoria(String categoria);
    List<Producto> buscarProductoPorPrecio(double precioMin, double precioMax);
    List<Producto> listarProductosPorEstado(boolean activo);
    Producto agregarPregunta(int idProducto, Pregunta pregunta);
    List<Producto> filtrarProductosPorPrecioYEstado(double minPrecio, double maxPrecio, boolean activo);

}
