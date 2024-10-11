package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.modelo.entidades.Usuario;

import java.util.List;

public interface UsuarioServicio {
    int registrarUsuario(Usuario usuario);
    int actualizarUsuario(Usuario usuario);
    int eliminarUsuario(Usuario usuario);
    List<Usuario> listarUsuarios();
    Usuario buscarUsuario(int id);

}
