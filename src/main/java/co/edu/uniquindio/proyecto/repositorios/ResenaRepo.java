package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.modelo.entidades.Administrador;
import co.edu.uniquindio.proyecto.modelo.entidades.Resena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResenaRepo extends JpaRepository<Resena, Integer> {
    List<Resena> findByProductoCodigo(int codigoProducto);
    List<Resena> findByUsuarioCodigo(int codigoUsuario);

}
