package com.company.service.impl;

import com.company.enums.Gender;
import com.company.models.Database;
import com.company.models.Person;
import com.company.service.PersonService;

import java.util.Arrays;
import java.util.Scanner;

public class PersonServiceImpl implements PersonService {

    Database database;

    public PersonServiceImpl(Database database) {
        this.database = database;
    }

    @Override
    public String addPerson(Person person) {
        Person newPerson = new Person();
        newPerson.setId(person.getId());
        newPerson.setName(person.getName());
        newPerson.setAge(person.getAge());
        newPerson.setEmail(person.getEmail());
        newPerson.setGender(person.getGender());
        Person[] people = Arrays.copyOf(database.getPeople(), database.getPeople().length + 1);
        people[people.length - 1] = newPerson;
        database.setPeople(people);
        return "Успешно добавлен!";
    }

    @Override
    public void updatePerson(Long id, Person person) {

        for (Person p : database.getPeople()) {
            if (p.getId().equals(id)) {
                p.setName(person.getName());
                p.setAge(person.getAge());
                p.setEmail(person.getEmail());
                p.setGender(Gender.MALE);
                System.out.println("Person successfully updated!");
            }
        }
    }

    @Override
    public Person findById(Long id) {
        Person[] people = database.getPeople();
        for (Person person : people) {
            if (id.equals(person.getId())) {
                return person;
            }
        }

        return null;
    }

    @Override
    public void deletePersonById(Long id) {

    }

    @Override
    public Person[] findAll() {
        return database.getPeople();
    }
}
