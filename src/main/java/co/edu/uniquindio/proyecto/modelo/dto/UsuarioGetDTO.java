package co.edu.uniquindio.proyecto.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsuarioGetDTO {
    private int codigo;
    private String nombre;
    private String email;
    private String password;
    private String direccion;
    private String telefono;


}
