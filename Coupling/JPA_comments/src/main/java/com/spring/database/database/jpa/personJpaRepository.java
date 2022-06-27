package com.spring.database.database.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.spring.database.database.entity.Person;

//Repositotry
//transaction management
@Repository
@Transactional
public class personJpaRepository {

//connect to database 
//entity manager manages the entities,all opration performing in specific session are all stored in entitymanager
//all opr not really stored in entity manager but in persistenceContext
//Entity manager interface to the persistence context all opr have to be goin through ENTITYMANAGER
@PersistenceContext
EntityManager entityManager;
	
	public Person findbyId(int id) {
		return entityManager.find(Person.class, id) ; //JPA
	}
	
	
}
