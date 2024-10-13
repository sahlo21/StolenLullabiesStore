package co.edu.uniquindio.proyecto.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ProductoGetDTO {
    private int codigo;
    private String nombre;
    private int unidades;
    private String descripcion;
    private double precio;
    private boolean activo;
    private LocalDate fechaCreacion;
    private LocalDate fechaLimite;

}
