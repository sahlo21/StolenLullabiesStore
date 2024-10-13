package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.modelo.entidades.Usuario;

import java.util.List;

public interface UsuarioServicio {
    int registrarUsuario(Usuario usuario) throws Exception;
    int actualizarUsuario(Usuario usuario)throws Exception;
    int eliminarUsuario(Usuario usuario)throws Exception;
    List<Usuario> listarUsuarios()throws Exception;
    Usuario buscarUsuario(int id)throws Exception;

}
