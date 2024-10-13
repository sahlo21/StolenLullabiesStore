package co.edu.uniquindio.proyecto.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ResenaGetDTO {
    private int id;
    private String contenido;
    private int calificacion;
    private LocalDate fechaCreacion;
}
