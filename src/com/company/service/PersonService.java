package com.company.service;

import com.company.models.Person;

public interface PersonService {

    String addPerson(Person person);

    void updatePerson(Long id, Person person);

    Person findById(Long id);

    void deletePersonById(Long id);

    Person[] findAll();
}
