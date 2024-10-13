package co.edu.uniquindio.proyecto.modelo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@AllArgsConstructor
public class UsuarioPostDTO {

    @NotBlank
    @Length(max=50, message = "El nombre debe tener maximo 50 caracteres")
    private String nombre;
    @NotBlank
    @Length(max=35, message = "El email debe tener maximo 35 caracteres")
    private String email;
    @NotBlank
    @Length(max=20, message = "La contraseña debe tener maximo 20 caracteres")
    private String password;
    @NotBlank
    @Length(max=100, message = "La contraseña debe tener maximo 100 caracteres")
    private String direccion;
    @NotBlank
    @Length(max=15, message = "La contraseña debe tener maximo 15 caracteres")
    private String telefono;


}
