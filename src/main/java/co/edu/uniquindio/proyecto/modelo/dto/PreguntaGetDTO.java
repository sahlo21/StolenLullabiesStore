package co.edu.uniquindio.proyecto.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
@Data
@AllArgsConstructor
public class PreguntaGetDTO {
    private int codigo;
    private String contenido;
    private String respuesta;
    private LocalDate fechaCreacion;
    private LocalDate fechaRespuesta;
}
