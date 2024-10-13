package co.edu.uniquindio.proyecto.servicios.implementacion;

import co.edu.uniquindio.proyecto.modelo.entidades.Favorito;
import co.edu.uniquindio.proyecto.repositorios.FavoritoRepo;
import co.edu.uniquindio.proyecto.servicios.interfaces.FavoritoServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class FavoritoServicioImpl implements FavoritoServicio {
    private final FavoritoRepo favoritoRepo;
    @Override
    public int registrarFavorito(Favorito favorito) throws Exception {
        return 0;
    }

    @Override
    public int eliminarFavorito(Favorito favorito) throws Exception {
        return 0;
    }

    @Override
    public List<Favorito> listarFavoritosUsuario(int idUsuario) throws Exception {
        return List.of();
    }
}
