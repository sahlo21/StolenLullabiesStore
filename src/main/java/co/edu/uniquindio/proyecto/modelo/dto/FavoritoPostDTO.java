package co.edu.uniquindio.proyecto.modelo.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FavoritoPostDTO {
    @NotNull
    private int codigoProducto;
    @NotNull
    private int codigoUsuario;
}
