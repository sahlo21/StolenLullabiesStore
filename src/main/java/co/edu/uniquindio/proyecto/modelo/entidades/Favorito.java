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
    @Column(name = "codigo_producto")  // Especifica el nombre de la columna en la base de datos
    private int codigoProducto;

    @Id
    @Column(name = "codigo_usuario")  // Especifica el nombre de la columna en la base de datos
    private int codigoUsuario;

    @ManyToOne
    @JoinColumn(name = "codigo_producto", insertable = false, updatable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "codigo_usuario", insertable = false, updatable = false)
    private Usuario usuario;
}
