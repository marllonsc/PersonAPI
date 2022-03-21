package com.persons.person.repository;

import org.springframework.stereotype.Repository;

import com.persons.person.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer>{		

}
