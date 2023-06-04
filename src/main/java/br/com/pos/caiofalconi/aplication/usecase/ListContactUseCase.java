package br.com.pos.caiofalconi.aplication.usecase;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.pos.caiofalconi.aplication.domain.Contact;
import br.com.pos.caiofalconi.aplication.ports.input.IListContactUseCase;
import br.com.pos.caiofalconi.aplication.ports.output.IContactRepositoryPort;
import br.com.pos.caiofalconi.aplication.utils.UseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@UseCase
public class ListContactUseCase implements IListContactUseCase {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ListContactUseCase.class);
	
	private final IContactRepositoryPort iContactRepositoryPort;
	
	public List<Contact> execute(){
		
		LOGGER.info("Start process: List all contacts");
		
		return iContactRepositoryPort.listAll();
		
	}

}
