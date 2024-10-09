package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Comentario implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @NotNull
    @Size(min = 1, max = 500)
    @Column(nullable = false, length = 500)
    private String mensaje;
    @NotNull
    @Column(nullable = false)
    private Date fecha_creacion;
    @ManyToOne
    private Usuario usuario;
    @ManyToOne
    private Producto producto;
}
