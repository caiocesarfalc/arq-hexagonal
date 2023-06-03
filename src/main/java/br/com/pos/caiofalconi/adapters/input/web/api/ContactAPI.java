package br.com.pos.caiofalconi.adapters.input.web.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.pos.caiofalconi.adapters.input.web.api.request.ContactRequest;
import br.com.pos.caiofalconi.adapters.input.web.api.response.ContactResponse;

@RequestMapping("/api/v1/contacts")
public interface ContactAPI {
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<ContactResponse> create(@RequestBody ContactRequest contactRequest);
	
	@GetMapping("/listAll")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<ContactResponse>> listAll();

}
