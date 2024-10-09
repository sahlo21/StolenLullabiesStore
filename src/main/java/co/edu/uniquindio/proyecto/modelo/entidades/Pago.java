package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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

    @NotNull
    @Column(nullable = false)
    private double monto;

    @NotNull
    @Column(nullable = false)
    private LocalDate fechaPago;

    @NotNull
    @Column(nullable = false, length = 20)
    private String metodoPago; // Por ejemplo, "Tarjeta", "PayPal", etc.

    @NotNull
    @Column(nullable = false, length = 15)
    private String estadoPago; // Por ejemplo, "exitoso", "fallido"

    @ManyToOne
    @JoinColumn(nullable = false)
    private Pedido pedido;

}

