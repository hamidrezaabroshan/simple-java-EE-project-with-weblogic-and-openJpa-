package com.smartsoft.persistence;

import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PersonEjb {
@PersistenceContext
private EntityManager entityManager;
private static final Logger logger =Logger.getLogger("PersonEjb");
public void save(Person person) {
	entityManager.persist(person);
	logger.info("persisted");
}
}
