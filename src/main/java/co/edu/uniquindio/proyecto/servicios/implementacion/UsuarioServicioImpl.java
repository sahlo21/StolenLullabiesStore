package co.edu.uniquindio.proyecto.servicios.implementacion;

import co.edu.uniquindio.proyecto.modelo.entidades.Usuario;
import co.edu.uniquindio.proyecto.repositorios.UsuarioRepo;
import co.edu.uniquindio.proyecto.servicios.interfaces.UsuarioServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UsuarioServicioImpl implements UsuarioServicio {
    private final UsuarioRepo usuarioRepo;
    @Override
    public int registrarUsuario(Usuario usuario) throws Exception {
        return 0;
    }

    @Override
    public int actualizarUsuario(Usuario usuario) throws Exception {
        return 0;
    }

    @Override
    public int eliminarUsuario(Usuario usuario) throws Exception {
        return 0;
    }

    @Override
    public List<Usuario> listarUsuarios() throws Exception {
        return List.of();
    }

    @Override
    public Usuario buscarUsuario(int id) throws Exception {
        return null;
    }
}
