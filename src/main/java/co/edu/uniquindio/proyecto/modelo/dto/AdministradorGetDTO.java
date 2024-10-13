package co.edu.uniquindio.proyecto.modelo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
public class AdministradorGetDTO {
    private int codigo;
    private String nombre;
    private String email;
    private String password;

}
