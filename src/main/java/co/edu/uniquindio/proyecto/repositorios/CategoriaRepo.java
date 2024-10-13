package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.modelo.entidades.Administrador;
import co.edu.uniquindio.proyecto.modelo.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoriaRepo extends JpaRepository<Categoria, Integer> {
    // Consulta personalizada para buscar por nombre
    Optional<Categoria> findByNombre(String nombre);
    Boolean existsByNombre(String nombre);
}
