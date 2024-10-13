package co.edu.uniquindio.proyecto.servicios.implementacion;

import co.edu.uniquindio.proyecto.modelo.entidades.Categoria;
import co.edu.uniquindio.proyecto.modelo.entidades.Pregunta;
import co.edu.uniquindio.proyecto.modelo.entidades.Producto;
import co.edu.uniquindio.proyecto.repositorios.ProductoRepo;
import co.edu.uniquindio.proyecto.servicios.interfaces.ProductoServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProductoServicioImpl implements ProductoServicio {
    private final ProductoRepo productoRepo;
    @Override
    public int registrarProducto(Producto producto) throws Exception {
        return 0;
    }

    @Override
    public int actualizarProducto(Producto producto) throws Exception {
        return 0;
    }

    @Override
    public int eliminarProducto(Producto producto) throws Exception {
        return 0;
    }

    @Override
    public List<Producto> listarProductos() throws Exception {
        return List.of();
    }

    @Override
    public List<Producto> buscarProductoPorNombre(String nombre) throws Exception {
        return List.of();
    }

    @Override
    public List<Producto> buscarProductoPorCategoria(Categoria categoria) throws Exception {
        return List.of();
    }

    @Override
    public List<Producto> buscarProductoPorPrecio(double precioMin, double precioMax) throws Exception {
        return List.of();
    }

    @Override
    public List<Producto> listarProductosPorEstado(boolean activo) throws Exception {
        return List.of();
    }

    @Override
    public Producto agregarPregunta(int idProducto, Pregunta pregunta) throws Exception {
        return null;
    }

    @Override
    public List<Producto> filtrarProductosPorPrecioYEstado(double minPrecio, double maxPrecio, boolean activo) throws Exception {
        return List.of();
    }
}
