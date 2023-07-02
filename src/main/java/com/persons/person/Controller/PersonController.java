package com.persons.person.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.persons.person.entity.Person;
import com.persons.person.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public Person createEmployee(@RequestBody Person person) {
	    return service.createPerson(person);
	}
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Person> returnAll(){
		 return service.returnAll();
	}

	@RequestMapping(value="/getperson", method=RequestMethod.GET)
	public Person returnByID(@RequestBody Person person){
		 return service.getPerson(person.getId());
	}

	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public Person returnDeleteAll(@RequestBody Person person){
		 return service.deletePerson(person);
	}

}
