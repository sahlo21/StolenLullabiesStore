package co.edu.uniquindio.proyecto.modelo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DetallePedidoPostDTO {


   @Positive
   @NotNull(message = "Las unidades no puede ser nulo")
   @NotBlank(message = "Las unidades no puede ser vacío")
    private int unidades;

}
