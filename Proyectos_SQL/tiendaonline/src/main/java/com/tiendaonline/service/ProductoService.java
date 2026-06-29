package com.tiendaonline.service;

import com.tiendaonline.dto.ProductoRequestDTO;
import com.tiendaonline.dto.ProductoResponseDTO;
import java.util.List;

public interface ProductoService {

    ProductoResponseDTO crearProducto(ProductoRequestDTO request);

    List<ProductoResponseDTO> obtenerProductos();

    ProductoResponseDTO productoById(Long id_producto);

    ProductoResponseDTO actualizarProducto(Long id_producto, ProductoRequestDTO request);

    ProductoResponseDTO eliminarProducto(Long id_producto);
}
