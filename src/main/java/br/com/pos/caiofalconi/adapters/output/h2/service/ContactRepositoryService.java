package br.com.pos.caiofalconi.adapters.output.h2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.pos.caiofalconi.adapters.output.h2.entity.ContactEntity;
import br.com.pos.caiofalconi.adapters.output.h2.repository.ContactRepository;
import br.com.pos.caiofalconi.aplication.domain.Contact;
import br.com.pos.caiofalconi.aplication.ports.output.IContactRepositoryPort;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ContactRepositoryService implements IContactRepositoryPort {
	
	private final ContactRepository contactRepository;
	
	@Override
	public Contact createSave (Contact domain) {
		
		ContactEntity entity = contactRepository.save(ContactEntity.toContactEntity(domain));
		
		return Contact.builder()
				.id(entity.getId())
				.name(entity.getName())
				.email(entity.getEmail())
				.phone(entity.getPhone())
				.build();
	}
	
	public List<Contact> listAll() {
		
		List<ContactEntity> listContactEntity = contactRepository.findAll();
		
		List<Contact> listContact = new ArrayList<Contact>();
		
		listContactEntity.forEach(entity -> listContact.add(Contact.builder()
				.id(entity.getId())
				.name(entity.getName())
				.email(entity.getEmail())
				.phone(entity.getPhone())
				.build()));
		
		return listContact;
	}

}
