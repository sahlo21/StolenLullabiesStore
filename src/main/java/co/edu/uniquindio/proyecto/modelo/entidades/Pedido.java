package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Pedido implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @NotNull
    @Column(nullable = false)
    private LocalDate fecha_creacion;
    @NotNull
    @Column(nullable = false)
    private Double valor_total;
    @OneToOne(mappedBy = "pedido", cascade = CascadeType.ALL) // Asegúrate de incluir cascade
    private Pago pago; // Un pago asociado al pedido
    @ManyToOne
    private Usuario usuario;
    @OneToMany(mappedBy ="pedido")
    private List<DetallePedido> detalle_compras;

    @ManyToOne
    private Cupon cuponAplicado; // Cupón aplicado a la compra

}
