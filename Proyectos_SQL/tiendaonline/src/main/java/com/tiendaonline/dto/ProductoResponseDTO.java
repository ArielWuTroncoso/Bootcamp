package com.tiendaonline.dto;

import lombok.Builder;

@Builder
public record ProductoResponseDTO(
        Long id_producto,
        String nombre,
        int stock
) {
}
