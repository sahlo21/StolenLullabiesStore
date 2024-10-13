package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.modelo.entidades.Favorito;

import java.util.List;

public interface FavoritoServicio {
    int registrarFavorito(Favorito favorito)throws Exception;
    int eliminarFavorito(Favorito favorito)throws Exception;
    List<Favorito> listarFavoritosUsuario(int idUsuario)throws Exception;

}
