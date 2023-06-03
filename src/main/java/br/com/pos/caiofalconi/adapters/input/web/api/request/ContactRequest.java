package br.com.pos.caiofalconi.adapters.input.web.api.request;

import br.com.pos.caiofalconi.aplication.domain.Contact;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactRequest {
	
	private Long id;

	private String name;
	
	private String email;
	
	private String phone;
	
	public Contact toDomain(ContactRequest request) {
		
		return Contact.builder()
				.name(request.getName())
				.email(request.getEmail())
				.phone(request.getPhone())
				.build();
		
	}
}
