package co.edu.uniquindio.proyecto.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
@Data
@AllArgsConstructor
public class CuponGetDTO {
    private int id;
    private String codigo;
    private Double descuento;
    private LocalDate fechaExpiracion;
}
