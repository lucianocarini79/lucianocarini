package com.coderhouse.ClientAPIRest.repository;

import com.coderhouse.ClientAPIRest.model.ClienteDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDTORepository extends JpaRepository<ClienteDTO, Integer> {
}
