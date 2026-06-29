package com.tiendaonline.service;

import com.tiendaonline.dto.ClienteRequestDTO;
import com.tiendaonline.dto.ClienteResponseDTO;
import com.tiendaonline.mapper.ClienteMapper;
import com.tiendaonline.model.Cliente;
import com.tiendaonline.repository.ClienteRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository repository;
    private final ClienteMapper mapper;

    @Override
    public ClienteResponseDTO crearCliente(ClienteRequestDTO request) {
        Cliente cliente = mapper.toModel(request);
        Cliente clienteGuardado = repository.save(cliente);
        return mapper.toDTO(clienteGuardado);
    }

    @Override
    public List<ClienteResponseDTO> obtenerClientes() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    @Override
    public ClienteResponseDTO clienteById(Long id_cliente) {
        Cliente cliente = repository.findById(id_cliente)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
        return mapper.toDTO(cliente);
    }

    @Override
    public ClienteResponseDTO actualizarCliente(Long id_cliente, ClienteRequestDTO request) {
        Cliente cliente = repository.findById(id_cliente)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
        cliente.setNombre(request.nombre());
        cliente.setApellido(request.apellido());
        cliente.setCorreo(request.correo());
        cliente.setTelefono(request.telefono());
        cliente.setDireccion(request.direccion());
        Cliente actualizado = repository.save(cliente);
        return mapper.toDTO(actualizado);
    }

    @Override
    public ClienteResponseDTO eliminarCliente(Long id_cliente) {
        Cliente cliente = repository.findById(id_cliente)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
        repository.delete(cliente);
        return mapper.toDTO(cliente);
    }

    @Override
    public List<ClienteResponseDTO> findByDireccion(String direccion) {
        return repository.findByDireccion(direccion)
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    @Override
    public List<ClienteResponseDTO> buscarByNombre(String nombre) {
        return repository.buscarPorNombre(nombre)
                .stream()
                .map(mapper::toDTO)
                .toList();
    }
}
