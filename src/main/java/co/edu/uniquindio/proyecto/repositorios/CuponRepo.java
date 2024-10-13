package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.modelo.entidades.Administrador;
import co.edu.uniquindio.proyecto.modelo.entidades.Cupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CuponRepo extends JpaRepository<Cupon, Integer> {
    Cupon findByCodigo(String codigo);

    List<Cupon> findByActivo(Boolean activo);

    List<Cupon> findByFechaExpiracionAfter(LocalDate fechaActual);

    Boolean existsByCodigo(String codigo);

    // Alternativamente, buscar cupones usando el ID del producto
    List<Cupon> findByProductosValidos_Codigo(int productoId);
}
