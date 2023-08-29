package br.com.diegocordeiro.patterns.behavior.iterator;

import br.com.diegocordeiro.patterns.behavior.iterator.models.Person;

import java.util.ArrayList;
import java.util.Iterator;

public interface PersonList extends Iterator<Person> {

    void add(Person person);
}
