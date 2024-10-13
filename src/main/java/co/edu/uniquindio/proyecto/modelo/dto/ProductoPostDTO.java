package co.edu.uniquindio.proyecto.modelo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.AccessType;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
public class ProductoPostDTO {
    @NotBlank
    @Length(max = 50, message = "El nombre no debe superar los 50 caracteres")
    private String nombre;
    @Positive(message = "Las unidades deben ser mayor a cero")
    private int unidades;
    @NotBlank
    @Length(max = 50, message = "La descripcion no debe superar los 50 caracteres")
    private String descripcion;
    @Positive(message = "El precio debe ser mayor a cero")
    @NotNull(message = "El precio no puede ser nulo")
    @NotBlank(message = "El precio no puede ser vacío")
    private double precio;
    @NotNull
    private boolean activo;
    @NotNull
    private LocalDate fechaCreacion;
    @NotNull
    private LocalDate fechaLimite;

}
