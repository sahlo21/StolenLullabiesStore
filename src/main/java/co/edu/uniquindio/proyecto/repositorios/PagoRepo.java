package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.modelo.entidades.Administrador;
import co.edu.uniquindio.proyecto.modelo.entidades.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PagoRepo extends JpaRepository<Pago, Integer> {
    List<Pago> findByPedidoCodigo(int codigoPedido);
}
