package co.edu.uniquindio.proyecto.servicios.implementacion;

import co.edu.uniquindio.proyecto.modelo.entidades.Categoria;
import co.edu.uniquindio.proyecto.repositorios.CategoriaRepo;
import co.edu.uniquindio.proyecto.servicios.interfaces.CategoriaServicio;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoriaServicioImpl implements CategoriaServicio {


    private final CategoriaRepo categoriaRepository;


    @Override
    public int registrarCategoria(Categoria categoria) throws Exception {
        return 0;
    }

    @Override
    public int actualizarCategoria(Categoria categoria) throws Exception {
        return 0;
    }

    @Override
    public int eliminarCategoria(int id) throws Exception {
        return 0;
    }

    @Override
    public int obtenerCategoriaNombre(String nombre) throws Exception {
        return 0;
    }

    @Override
    public List<Categoria> listarCategorias() throws Exception {
        return List.of();
    }

    @Override
    public Boolean existeCategoria(String nombre) {
        return null;
    }
}
