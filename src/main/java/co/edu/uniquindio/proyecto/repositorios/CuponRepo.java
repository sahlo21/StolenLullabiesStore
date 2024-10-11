package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.modelo.entidades.Administrador;
import co.edu.uniquindio.proyecto.modelo.entidades.Cupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CuponRepo extends JpaRepository<Administrador, Integer> {
    // Método para encontrar un cupón por su código
    Cupon findByCodigo(String codigo);

    // Puedes agregar más métodos según tus necesidades
    // Por ejemplo, si necesitas encontrar cupones activos
    List<Cupon> findByActivo(Boolean activo);

    // Método para encontrar cupones que no hayan expirado
    List<Cupon> findByFechaExpiracionAfter(LocalDate fechaActual);
}
