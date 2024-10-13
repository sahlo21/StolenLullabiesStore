package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.modelo.entidades.Administrador;
import co.edu.uniquindio.proyecto.modelo.entidades.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PreguntaRepo extends JpaRepository<Pregunta, Integer> {
    List<Pregunta> findByProductoCodigo(int idProducto);
    List<Pregunta> findByUsuarioCodigo(int idUsuario);
}
