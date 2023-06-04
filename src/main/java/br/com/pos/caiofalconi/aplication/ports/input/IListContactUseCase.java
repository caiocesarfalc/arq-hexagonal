package br.com.pos.caiofalconi.aplication.ports.input;

import java.util.List;

import br.com.pos.caiofalconi.aplication.domain.Contact;

public interface IListContactUseCase {
	
	List<Contact> execute();

}
