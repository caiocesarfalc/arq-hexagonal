package br.com.pos.caiofalconi.adapters.output.h2.service;

import org.springframework.stereotype.Service;

import br.com.pos.caiofalconi.adapters.output.h2.entity.ContactEntity;
import br.com.pos.caiofalconi.adapters.output.h2.repository.ContactRepository;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InsertDadosInContactService {
	
	private final ContactRepository contactRepository;
	
	@PostConstruct
	public void insertDadosInContact() {
		
		contactRepository.save(ContactEntity.builder()
				.name("JOAO DA SILVA")
				.email("jsilva@email.com")
				.phone("987654321")
				.build());
		
		contactRepository.save(ContactEntity.builder()
				.name("MARIA JOAQUINA")
				.email("mjoaquina@email.com")
				.phone("988776655")
				.build());
		
	}
}
