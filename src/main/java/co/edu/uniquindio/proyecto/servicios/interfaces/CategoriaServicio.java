package co.edu.uniquindio.proyecto.servicios.interfaces;

import co.edu.uniquindio.proyecto.modelo.entidades.Categoria;

import java.util.List;

public interface CategoriaServicio {
    int registrarCategoria(Categoria categoria);
    int actualizarCategoria(Categoria categoria);
    int eliminarCategoria(int id);
    int obtenerCategoriaNombre(String nombre);
    List<Categoria> listarCategorias();
    Boolean existeCategoria(String nombre);
}
