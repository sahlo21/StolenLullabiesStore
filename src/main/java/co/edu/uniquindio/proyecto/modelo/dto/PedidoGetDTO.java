package co.edu.uniquindio.proyecto.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class PedidoGetDTO {
    private int codigo;
    private LocalDate fechaCreacion;
    private Double valorTotal;
}
