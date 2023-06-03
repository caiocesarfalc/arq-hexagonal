package br.com.pos.caiofalconi.adapters.input.web.api.response;

import br.com.pos.caiofalconi.aplication.domain.Contact;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContactResponse {
	
	private Long id;

	private String name;
	
	private String email;
	
	private String phone;
	
	public static ContactResponse toContactResponse (Contact domain) {
		
		return ContactResponse.builder()
				.id(domain.getId())
				.name(domain.getName())
				.email(domain.getEmail())
				.phone(domain.getPhone())
				.build();
			
	}

}
