package br.com.pos.caiofalconi.adapters.input.web.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.pos.caiofalconi.adapters.input.web.api.ContactAPI;
import br.com.pos.caiofalconi.adapters.input.web.api.request.ContactRequest;
import br.com.pos.caiofalconi.adapters.input.web.api.response.ContactResponse;
import br.com.pos.caiofalconi.aplication.domain.Contact;
import br.com.pos.caiofalconi.aplication.ports.input.ICreateContactUseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class ContactController implements ContactAPI {
	
	private final ICreateContactUseCase iCreateContactUseCase;
	
	@Override
	public ResponseEntity<ContactResponse> create(ContactRequest contactRequest) {
		
		Contact domain = iCreateContactUseCase.execute(contactRequest.toDomain(contactRequest));
		
		return ResponseEntity.ok(ContactResponse.toContactResponse(domain));
		
	}
	
	@Override
	public ResponseEntity<List<ContactResponse>> listAll() {
		return null;
	}
	
}
