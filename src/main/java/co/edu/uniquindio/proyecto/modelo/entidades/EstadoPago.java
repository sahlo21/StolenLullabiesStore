package co.edu.uniquindio.proyecto.modelo.entidades;

public enum EstadoPago {
    PENDIENTE,  // El pago aún no ha sido completado
    COMPLETADO, // El pago se ha realizado exitosamente
    FALLIDO,    // El pago ha fallado
    REEMBOLSADO, // El pago ha sido reembolsado
    CANCELADO,  // El pago ha sido cancelado por el usuario o el sistema
    EN_PROCESO  // El pago está en proceso de verificación o confirmación
}
