package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.modelo.entidades.Categoria;

import java.util.List;

public interface CategoriaServicio {
    int registrarCategoria(Categoria categoria)throws Exception;
    int actualizarCategoria(Categoria categoria)throws Exception;
    int eliminarCategoria(int id)throws Exception;
    int obtenerCategoriaNombre(String nombre)throws Exception;
    List<Categoria> listarCategorias()throws Exception;
    Boolean existeCategoria(String nombre);
}
