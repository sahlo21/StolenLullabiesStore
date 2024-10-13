package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Producto implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @NotNull
    @Column(nullable = false, length = 30)
    @Size(min = 1, max = 30)
    private String nombre;
    @NotNull
    @Column(nullable = false)
    private int unidades;
    @NotNull
    @Column(nullable = false, length = 50)
    @Size(min = 1, max = 100)
    private String descripcion;
    @NotNull
    @Column(nullable = false)
    private double precio;
    @NotNull
    @Column(nullable = false)
    private boolean activo;
    @NotNull
    @Column(nullable = false)
    private LocalDate fechaCreacion;
    @NotNull
    @Column(nullable = false)
    private LocalDate fechaLimite;
    @ManyToMany
    private List<Categoria> categorias;

    @OneToMany(mappedBy = "producto")
    private List<Favorito> favoritos;
    @OneToMany(mappedBy = "producto")
    private List<Imagen> imagenes;
    @OneToMany(mappedBy ="producto")
    private List<DetallePedido> detalles_pedido;

    @ManyToOne
    private Administrador administrador;
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<Pregunta> preguntas; // Lista de preguntas asociadas al producto

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<Resena> reseñas; // Lista de reseñas asociadas al producto

}
