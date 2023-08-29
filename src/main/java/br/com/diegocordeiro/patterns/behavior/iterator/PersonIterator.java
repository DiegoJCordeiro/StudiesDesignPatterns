package br.com.diegocordeiro.patterns.behavior.iterator;

import br.com.diegocordeiro.patterns.behavior.iterator.models.Person;

import java.util.Iterator;
import java.util.Objects;

public class PersonIterator implements PersonList {

    private Person[] persons;

    private static final Integer DEFAULT_CAPACITY = 0;

    private int index = -1;

    private int indexAddOperation;

    public PersonIterator(){
        this.indexAddOperation = 0;
        this.persons = new Person[DEFAULT_CAPACITY];
    }

    @Override
    public boolean hasNext() {
        this.index = this.index + 1;

        if(persons.length <= this.index)
            return false;

        return persons[this.index] != null;
    }

    @Override
    public Person next() {
        return persons[this.index];
    }

    @Override
    public void add(Person person) {

        indexAddOperation = this.persons.length + 1;

        Person[] personsAux = new Person[indexAddOperation];

        System.arraycopy(this.persons, 0, personsAux, 0, this.persons.length - 1 + 1);

        personsAux[indexAddOperation - 1] = person;

        this.persons = personsAux;
    }
}
