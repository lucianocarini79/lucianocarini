package com.coderhouse.ClientAPIRest.repository;

import com.coderhouse.ClientAPIRest.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Cliente, Integer> {
}
