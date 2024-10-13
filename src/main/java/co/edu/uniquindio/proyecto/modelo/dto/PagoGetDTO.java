package co.edu.uniquindio.proyecto.modelo.dto;

import co.edu.uniquindio.proyecto.modelo.entidades.EstadoPago;
import co.edu.uniquindio.proyecto.modelo.entidades.Mediopago;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class PagoGetDTO {
    private int codigo;
    private Double monto;
    private LocalDate fechaPago;
    private Mediopago mediopago;
    private EstadoPago estadoPago;
}
