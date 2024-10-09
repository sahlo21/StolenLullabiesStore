package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.Entity;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Administrador extends Persona implements Serializable  {



}
