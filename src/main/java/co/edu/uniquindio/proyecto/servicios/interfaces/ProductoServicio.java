package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.modelo.entidades.Categoria;
import co.edu.uniquindio.proyecto.modelo.entidades.Pregunta;
import co.edu.uniquindio.proyecto.modelo.entidades.Producto;

import java.util.List;

public interface ProductoServicio {
    int registrarProducto(Producto producto)throws Exception;
    int actualizarProducto(Producto producto)throws Exception;
    int eliminarProducto(Producto producto)throws Exception;
    List<Producto> listarProductos()throws Exception;
    List<Producto> buscarProductoPorNombre(String nombre)throws Exception;
    List<Producto> buscarProductoPorCategoria(Categoria categoria)throws Exception;
    List<Producto> buscarProductoPorPrecio(double precioMin, double precioMax)throws Exception;
    List<Producto> listarProductosPorEstado(boolean activo)throws Exception;
    Producto agregarPregunta(int idProducto, Pregunta pregunta)throws Exception;
    List<Producto> filtrarProductosPorPrecioYEstado(double minPrecio, double maxPrecio, boolean activo)throws Exception;

}
