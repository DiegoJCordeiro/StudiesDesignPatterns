package br.com.diegocordeiro.patterns.structural.bridge.models;

import java.time.LocalDateTime;

public abstract class Record {

    protected String name;
    protected LocalDateTime entryDateHour;
    protected LocalDateTime departureDateHour;
    protected Integer age;
    protected String lastname;

    public Record(String name, LocalDateTime entryDateHour, LocalDateTime departureDateHour, Integer age, String lastname) {
        this.name = name;
        this.entryDateHour = entryDateHour;
        this.departureDateHour = departureDateHour;
        this.age = age;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getEntryDateHour() {
        return entryDateHour;
    }

    public LocalDateTime getDepartureDateHour() {
        return departureDateHour;
    }

    public Integer getAge() {
        return age;
    }

    public String getLastname() {
        return lastname;
    }
}
