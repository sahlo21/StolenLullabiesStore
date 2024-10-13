package co.edu.uniquindio.proyecto.modelo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class PreguntaPostDTO {
    @NotBlank
    @Length(max=500, message = "La pregunta no puede superar los 500 caracteres")
    private String contenido;
    @NotBlank
    @Length(max=500, message = "La respuesta no puede superar los 500 caracteres")
    private String respuesta;
    @NotNull
    private LocalDate fechaCreacion;
    @NotNull
    private LocalDate fechaRespuesta;
}
