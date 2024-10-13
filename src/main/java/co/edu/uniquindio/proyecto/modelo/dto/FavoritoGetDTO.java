package co.edu.uniquindio.proyecto.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FavoritoGetDTO {
    private int codigoProducto;
    private int codigoUsuario;
}
