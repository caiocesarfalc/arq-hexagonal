package br.com.pos.caiofalconi.aplication.ports.input;

import br.com.pos.caiofalconi.aplication.domain.Contact;

public interface ICreateContactUseCase {
	
	Contact execute(Contact contato);

}
