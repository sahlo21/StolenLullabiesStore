package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.modelo.entidades.Administrador;
import co.edu.uniquindio.proyecto.modelo.entidades.Favorito;
import co.edu.uniquindio.proyecto.modelo.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoritoRepo extends JpaRepository<Favorito, Integer> {
    List<Favorito> findByUsuarioCodigo(int idUsuario);

}
