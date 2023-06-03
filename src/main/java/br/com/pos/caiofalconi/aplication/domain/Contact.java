package br.com.pos.caiofalconi.aplication.domain;

import br.com.pos.caiofalconi.aplication.ports.output.IContactRepositoryPort;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contact {
	
	private Long id;
	
	private String name;
	
	private String email;
	
	private String phone;
	
	public Contact save(IContactRepositoryPort iContactRepositoryPort) {
		
		validContactDomain(this);
		
		return iContactRepositoryPort.createSave(this);
	}

	private void validContactDomain(Contact domain) {
		
		if(domain.getName() == null || domain.getName().isBlank()) {
			throw new IllegalArgumentException("O nome do contato está nulo ou vazio");
		}
		
		if(domain.getEmail() == null || domain.getEmail().isBlank()) {
			throw new IllegalArgumentException("O email do contato está nulo ou vazio");
		}
		
		if(domain.getPhone() == null || domain.getPhone().isBlank()) {
			throw new IllegalArgumentException("O telefone do contato está nulo ou vazio");
		}
		
	}

}
