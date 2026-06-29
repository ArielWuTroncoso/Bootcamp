package com.tiendaonline.service;

import com.tiendaonline.dto.ClienteRequestDTO;
import com.tiendaonline.dto.ClienteResponseDTO;
import java.util.List;

public interface ClienteService {

    ClienteResponseDTO crearCliente(ClienteRequestDTO request);

    List<ClienteResponseDTO> obtenerClientes();

    ClienteResponseDTO clienteById(Long id_cliente);

    ClienteResponseDTO actualizarCliente(Long id_cliente, ClienteRequestDTO request);

    ClienteResponseDTO eliminarCliente(Long id_cliente);

    List<ClienteResponseDTO> findByDireccion(String direccion);

    List<ClienteResponseDTO> buscarByNombre(String nombre);
}
