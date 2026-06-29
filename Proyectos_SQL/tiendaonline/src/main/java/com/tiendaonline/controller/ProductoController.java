package com.tiendaonline.controller;

import com.tiendaonline.dto.ProductoRequestDTO;
import com.tiendaonline.dto.ProductoResponseDTO;
import com.tiendaonline.service.ProductoService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService service;

    @PostMapping
    public ProductoResponseDTO crearProducto(@RequestBody ProductoRequestDTO request) {
        return service.crearProducto(request);
    }

    @GetMapping
    public List<ProductoResponseDTO> obtenerProductos() {
        return service.obtenerProductos();
    }

    @GetMapping("/{id_producto}")
    public ProductoResponseDTO productoById(@PathVariable Long id_producto) {
        return service.productoById(id_producto);
    }

    @PutMapping("/{id_producto}")
    public ProductoResponseDTO actualizarProducto(
            @PathVariable Long id_producto,
            @RequestBody ProductoRequestDTO request
    ) {
        return service.actualizarProducto(id_producto, request);
    }

    @DeleteMapping("/{id_producto}")
    public ProductoResponseDTO eliminarProducto(@PathVariable Long id_producto) {
        return service.eliminarProducto(id_producto);
    }
}
