package com.persons.person.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persons.person.entity.Person;
import com.persons.person.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repository;
	
	// CREATE 
	public Person createPerson(Person person) {
	    return repository.save(person);
	}

	// READ
	public Person getPerson(Integer id) {
	    Optional<Person> person = repository.findById(id);
		if(person.isEmpty()){
			return null;
		}
		return person.get();
	}

	// DELETE
	public Person deletePerson(Person person) {
		Person deletePerson = this.getPerson(person.getId());
		if(deletePerson == null){
			return null;
		}
		repository.delete(deletePerson);
		return deletePerson;
	}
	
	// RETURN ALL
	public List<Person> returnAll() {
		return repository.findAll();
	}

}
