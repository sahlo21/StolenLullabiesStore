package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Usuario extends Persona implements Serializable {

    @NotNull
    @Column(nullable = false, length = 100)
    @Size(min = 5, max = 100)
    private String direccion;
    @NotNull
    @Column(nullable = false, length = 15)
    @Size(min = 7, max = 15)
    private String telefono;


    @OneToMany(mappedBy = "usuario")
    private List<Pedido> pedidos;

    @OneToMany(mappedBy = "usuario")
    private List<Favorito> favoritos;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Pregunta> preguntas; // Lista de preguntas realizadas por el usuario
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Resena> reseñas; // Lista de reseñas realizadas por el usuario
}
