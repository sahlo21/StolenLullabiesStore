package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.modelo.entidades.Categoria;
import co.edu.uniquindio.proyecto.modelo.entidades.Producto;
import co.edu.uniquindio.proyecto.modelo.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ProductoRepo  extends JpaRepository<Producto, Integer> {
    List<Producto> findByNombreContaining(String nombre);
    List<Producto> findByCategoriasContaining(Categoria categoria);
    List<Producto> findByPrecioBetween(double precioMin, double precioMax);
    List<Producto> findByActivo(boolean activo);
}
