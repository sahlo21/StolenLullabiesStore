package co.edu.uniquindio.proyecto.modelo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@AllArgsConstructor
public class CategoriaPostDTO {
    @NotBlank
    @Length(max=20, message = "El nombre de la categoria no debe superar los 20 caracteres")
    private String nombre;
}
