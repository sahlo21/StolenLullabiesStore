package co.edu.uniquindio.proyecto.modelo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
public class PedidoPostDTO {
    @NotNull
    private LocalDate fechaCreacion;
    @Positive
    @NotNull(message = "El valor no puede ser nulo")
    @NotBlank(message = "El valor no puede ser vacío")
    private Double valorTotal;
}
