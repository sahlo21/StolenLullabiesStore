package co.edu.uniquindio.proyecto.modelo.entidades;

import lombok.ToString;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pregunta implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Producto producto; // Relación con el producto

    @ManyToOne
    @JoinColumn(nullable = false)
    private Usuario usuario; // Relación con el usuario que pregunta

    @NotNull
    @Column(nullable = false, length = 500)
    private String contenido; // Contenido de la pregunta

    @Column(length = 500)
    private String respuesta; // Respuesta opcional
    @Column(nullable = false)
    private LocalDate fechaCreacion; // Fecha de creación
    @Column(nullable = false)
    private LocalDate fechaRespuesta; // Fecha de respuesta opcional
}
