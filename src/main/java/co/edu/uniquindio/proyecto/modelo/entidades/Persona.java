package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Persona implements Serializable  {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @NotNull
    @Column(nullable = false, length = 50)
    @Size(min = 1, max = 50)
    private String nombre;
    @NotNull
    @Column(nullable = false, length = 35)
    @Size(min = 1, max = 35)
    private String email;
    @NotNull
    @Column(nullable = false, length = 20)
    @Size(min = 8, max = 20)
    private String password;
}
