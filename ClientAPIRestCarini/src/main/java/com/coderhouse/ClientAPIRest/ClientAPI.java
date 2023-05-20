package com.coderhouse.ClientAPIRest;


import com.coderhouse.ClientAPIRest.model.Cliente;
import com.coderhouse.ClientAPIRest.model.ClienteDTO;
import com.coderhouse.ClientAPIRest.repository.ClientDTORepository;
import com.coderhouse.ClientAPIRest.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Optional;

@SpringBootApplication
public class ClientAPI implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private ClientDTORepository clientDTORepository;


	public static void main(String[] args) {
		SpringApplication.run(ClientAPI.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Server listening. Access H2 on: http://localhost:8888/h2-console");

		try {
			Cliente cliente = new Cliente();
			cliente.setNombre("Luciano");
			cliente.setApellido("Carini");
			cliente.setFechaNacimiento(LocalDate.of(2005, 2, 4));
			this.clientRepository.save(cliente);

			ClienteDTO clienteDTO = new ClienteDTO();
			clienteDTO.setNombre("Luciano");
			clienteDTO.setApellido("Carini");
			clienteDTO.setEdad(18);
			this.clientDTORepository.save(clienteDTO);

			Optional<Cliente> clienteGuardado = this.clientRepository.findById(1);
			Optional<ClienteDTO> clienteDTOGuardado = this.clientDTORepository.findById(1);

			System.out.println(clienteGuardado);
			System.out.println(clienteDTOGuardado);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}


}
