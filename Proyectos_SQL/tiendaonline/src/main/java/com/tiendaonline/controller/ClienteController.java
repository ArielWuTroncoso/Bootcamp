package com.tiendaonline.controller;

import com.tiendaonline.dto.ClienteRequestDTO;
import com.tiendaonline.dto.ClienteResponseDTO;
import com.tiendaonline.service.ClienteService;
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
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    @PostMapping
    public ClienteResponseDTO crearCliente(@RequestBody ClienteRequestDTO request) {
        return service.crearCliente(request);
    }

    @GetMapping
    public List<ClienteResponseDTO> obtenerClientes() {
        return service.obtenerClientes();
    }

    @GetMapping("/{id_cliente}")
    public ClienteResponseDTO clienteById(@PathVariable Long id_cliente) {
        return service.clienteById(id_cliente);
    }

    @PutMapping("/{id_cliente}")
    public ClienteResponseDTO actualizarCliente(
            @PathVariable Long id_cliente,
            @RequestBody ClienteRequestDTO request
    ) {
        return service.actualizarCliente(id_cliente, request);
    }

    @DeleteMapping("/{id_cliente}")
    public ClienteResponseDTO eliminarCliente(@PathVariable Long id_cliente) {
        return service.eliminarCliente(id_cliente);
    }

    @GetMapping("/nombres/{nombre}")
    public List<ClienteResponseDTO> listaPorNombres(@PathVariable String nombre) {
        return service.buscarByNombre(nombre);
    }

    @GetMapping("/direcciones/{direccion}")
    public List<ClienteResponseDTO> listaPorDireccion(@PathVariable String direccion) {
        return service.findByDireccion(direccion);
    }
}
