package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
public class Resena implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Producto producto; // Relación con el producto

    @ManyToOne
    @JoinColumn(nullable = false)
    private Usuario usuario; // Relación con el usuario que hace la reseña

    @NotNull
    @Column(nullable = false, length = 500)
    private String contenido; // Contenido de la reseña

    @NotNull
    @Min(1)
    @Max(5)
    @Column(nullable = false)
    private int calificacion; // Calificación del 1 al 5
    @NotNull
    private LocalDate fechaCreacion; // Fecha de creación
}
