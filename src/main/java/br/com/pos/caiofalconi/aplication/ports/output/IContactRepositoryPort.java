package br.com.pos.caiofalconi.aplication.ports.output;

import java.util.List;

import br.com.pos.caiofalconi.aplication.domain.Contact;

public interface IContactRepositoryPort {

	Contact createSave(Contact contato);
	
	List<Contact> listAll();
}
