package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo; // El código del cupón

    private Double descuento; // El porcentaje o cantidad de descuento

    private LocalDate fechaExpiracion; // Fecha límite para usar el cupón

    private Boolean activo; // Si el cupón está activo o no

    @ManyToMany
    @JoinTable(
            name = "cupon_producto",
            joinColumns = @JoinColumn(name = "cupon_id"),
            inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    private List<Producto> productosValidos; // Productos donde aplica el cupón

    // Getters y setters
}
