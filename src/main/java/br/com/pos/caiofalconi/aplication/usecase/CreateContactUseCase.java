package br.com.pos.caiofalconi.aplication.usecase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.pos.caiofalconi.aplication.domain.Contact;
import br.com.pos.caiofalconi.aplication.ports.input.ICreateContactUseCase;
import br.com.pos.caiofalconi.aplication.ports.output.IContactRepositoryPort;
import br.com.pos.caiofalconi.aplication.utils.UseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@UseCase
public class CreateContactUseCase implements ICreateContactUseCase {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CreateContactUseCase.class);
	
	private final IContactRepositoryPort iContactRepositoryPort;
	
	public Contact execute(Contact contactDomain){
		
		LOGGER.info("Start process: Save contact {}", contactDomain);
		
		return contactDomain.save(iContactRepositoryPort);
		
	}

}
