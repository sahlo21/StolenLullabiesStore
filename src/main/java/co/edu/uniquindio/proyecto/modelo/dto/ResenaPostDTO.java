package co.edu.uniquindio.proyecto.modelo.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
public class ResenaPostDTO {
    @NotNull
    @Length(min = 1, max = 500, message = "La reseña no debe superar los 500 caracteres")
    private String contenido; // Contenido de la reseña

    @NotNull
    @Min(1)
    @Max(5)
    @Column(nullable = false)
    private int calificacion; // Calificación del 1 al 5
    @NotNull
    private LocalDate fechaCreacion; // Fecha de creación
}
