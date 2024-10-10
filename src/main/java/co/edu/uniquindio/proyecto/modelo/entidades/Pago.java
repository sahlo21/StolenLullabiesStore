package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pago implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @Positive(message = "El monto debe ser mayor que cero")
    @NotNull
    @Column(nullable = false)
    private double monto;
    @PastOrPresent(message = "La fecha de pago no puede ser en el futuro")
    @NotNull
    @Column(nullable = false)
    private LocalDate fechaPago;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Mediopago metodoPago;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoPago estadoPago;

    @OneToOne
    @JoinColumn(name = "pedido_codigo", nullable = false) // Especifica el nombre de la columna
    private Pedido pedido; // Relación con el pedido

}

