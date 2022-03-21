package com.persons.person.Controller;

import java.util.List;

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

}
