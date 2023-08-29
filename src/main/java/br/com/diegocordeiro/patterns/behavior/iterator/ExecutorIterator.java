package br.com.diegocordeiro.patterns.behavior.iterator;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.behavior.iterator.models.Person;

public class ExecutorIterator implements ExecutorPatterns {

    @Override
    public void execute() {

        System.out.println("----- Start - Using Iterator Pattern. -----");
        System.out.println("----- -----");

        PersonList personList = new PersonIterator();
        personList.add(new Person(1, "1"));
        personList.add(new Person(2, "2"));
        personList.add(new Person(3, "3"));
        personList.add(new Person(4, "4"));
        personList.add(new Person(5, "5"));
        personList.add(new Person(6, "6"));
        personList.add(new Person(7, "7"));
        personList.add(new Person(8, "8"));
        personList.add(new Person(9, "9"));
        personList.add(new Person(10, "10"));

        while(personList.hasNext()){
            Person person = personList.next();
            System.out.println(person.toString());
        }

        System.out.println("----- -----");
        System.out.println("----- End - Using Iterator Pattern. -----");
    }
}
