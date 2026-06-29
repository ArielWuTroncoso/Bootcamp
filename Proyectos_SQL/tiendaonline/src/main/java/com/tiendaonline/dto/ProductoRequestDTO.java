package com.tiendaonline.dto;

import java.math.BigDecimal;

public record ProductoRequestDTO(
        String nombre,
        String descripcion,
        BigDecimal precio,
        int stock,
        String categoria
) {
}
