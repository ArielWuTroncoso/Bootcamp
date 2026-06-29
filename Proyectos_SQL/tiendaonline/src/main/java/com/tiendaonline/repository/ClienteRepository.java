package com.tiendaonline.repository;

import com.tiendaonline.model.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    //Query method
    List<Cliente> findByDireccion(String direccion);

    //Query
    @Query("SELECT c FROM Cliente c WHERE c.nombre = :nombre")
    List<Cliente> buscarPorNombre(@Param("nombre") String nombre);
}
