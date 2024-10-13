package co.edu.uniquindio.proyecto.modelo.dto;

import co.edu.uniquindio.proyecto.modelo.entidades.EstadoPago;
import co.edu.uniquindio.proyecto.modelo.entidades.Mediopago;
import jakarta.validation.constraints.Future;
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
public class PagoPostDTO {
    @Positive
    @NotNull(message = "El monto no puede ser nulo")
    @NotBlank(message = "El monto no puede ser vacío")
    private Double monto;
    @NotNull
    private LocalDate fechaPago;
    @NotNull(message = "El medio de pago no puede ser vacio")
    private Mediopago mediopago;

}
