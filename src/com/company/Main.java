package com.company;

import com.company.enums.Gender;
import com.company.models.Database;
import com.company.models.Person;
import com.company.service.PersonService;
import com.company.service.impl.PersonServiceImpl;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person person = new Person(1L, "Adelina", 6, "adelina@gmail.com", Gender.FEMALE);
        Database database = new Database();
        PersonService personService = new PersonServiceImpl(database);
        System.out.println(personService.addPerson(person));
        System.out.println("___________________________");
        System.out.println(personService.findById(1L));
        System.out.println("___________________________");
        personService.updatePerson(1L, new Person(1L, "Aliaskar", 20, "aliaskar@gmail.com", Gender.MALE));
        System.out.println("___________________________");
        System.out.println(personService.findById(1L));
        System.out.println("______________________________");

        System.out.println(Arrays.toString(database.getPeople()));
        for (Person p :database.getPeople()) {
            System.out.println(p.getName());
        }
    }
}
