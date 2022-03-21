package com.persons.person.service;

import java.util.List;

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
	public List<Person> getPerson() {
	    return repository.findAll();
	}

	// DELETE
	public void deletePerson(Integer id) {
		repository.deleteById(id);
	}
	
	public List<Person> returnAll() {
		return repository.findAll();
	}
}
