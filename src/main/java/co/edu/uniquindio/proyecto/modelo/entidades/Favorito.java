package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
@IdClass(FavoritoId.class)
public class Favorito implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "codigo_producto")
    private Producto producto;

    @Id
    @ManyToOne
    @JoinColumn(name = "codigo_usuario")
    private Usuario usuario;

}
