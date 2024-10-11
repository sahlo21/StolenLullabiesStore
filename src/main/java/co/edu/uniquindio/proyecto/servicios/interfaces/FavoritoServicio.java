package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.modelo.entidades.Favorito;

import java.util.List;

public interface FavoritoServicio {
    int registrarFavorito(Favorito favorito);
    int eliminarFavorito(Favorito favorito);
    List<Favorito> listarFavoritosUsuario(int idUsuario);

}
