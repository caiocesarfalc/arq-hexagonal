package br.com.pos.caiofalconi.adapters.output.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pos.caiofalconi.adapters.output.h2.entity.ContactEntity;

@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, Long>{

}
