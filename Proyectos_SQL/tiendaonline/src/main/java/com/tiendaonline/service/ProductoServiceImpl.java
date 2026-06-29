package com.tiendaonline.service;

import com.tiendaonline.dto.ProductoRequestDTO;
import com.tiendaonline.dto.ProductoResponseDTO;
import com.tiendaonline.mapper.ProductoMapper;
import com.tiendaonline.model.Producto;
import com.tiendaonline.repository.ProductoRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository repository;
    private final ProductoMapper mapper;

    @Override
    public ProductoResponseDTO crearProducto(ProductoRequestDTO request) {
        Producto producto = mapper.toModel(request);
        Producto productoGuardado = repository.save(producto);
        return mapper.toDTO(productoGuardado);
    }

    @Override
    public List<ProductoResponseDTO> obtenerProductos() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    @Override
    public ProductoResponseDTO productoById(Long id_producto) {
        Producto producto = repository.findById(id_producto)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        return mapper.toDTO(producto);
    }

    @Override
    public ProductoResponseDTO actualizarProducto(Long id_producto, ProductoRequestDTO request) {
        Producto producto = repository.findById(id_producto)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        producto.setNombre(request.nombre());
        producto.setDescripcion(request.descripcion());
        producto.setPrecio(request.precio());
        producto.setStock(request.stock());
        producto.setCategoria(request.categoria());
        Producto actualizado = repository.save(producto);
        return mapper.toDTO(actualizado);
    }

    @Override
    public ProductoResponseDTO eliminarProducto(Long id_producto) {
        Producto producto = repository.findById(id_producto)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        repository.delete(producto);
        return mapper.toDTO(producto);
    }
}
