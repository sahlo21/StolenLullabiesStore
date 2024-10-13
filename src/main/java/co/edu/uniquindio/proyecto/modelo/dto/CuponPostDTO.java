package co.edu.uniquindio.proyecto.modelo.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class CuponPostDTO {
    @NotBlank
    @Length(max=20, message = "El codigo no debe superar los 20 caracteres")
    private String codigo;
    @NotNull
    @DecimalMin(value = "0.0", inclusive = true, message = "El descuento debe ser al menos 0")
    @DecimalMax(value = "100.0", inclusive = true, message = "El descuento no debe superar 100")
    private Double descuento;
    @NotNull
    @Future(message = "La fecha de expiración debe ser en el futuro")
    private LocalDate fechaExpiracion;

}
