package br.com.diegocordeiro.patterns.structural.bridge.models;

import java.time.LocalDateTime;

public class RecordClient extends Record {

    protected RecordClient(String name, LocalDateTime entryDateHour, LocalDateTime departureDateHour, Integer age, String lastname) {
        super(name, entryDateHour, departureDateHour, age, lastname);
    }

    public static class Builder {

        private String name;
        private LocalDateTime entryDateHour;
        private LocalDateTime departureDateHour;
        private Integer age;
        private String lastName;

        public Builder withName(String name) {

            this.name = name;
            return this;
        }

        public Builder withEntryDateHour(LocalDateTime entryDateHour) {

            this.entryDateHour = entryDateHour;
            return this;
        }

        public Builder withDepartureDateHour(LocalDateTime departureDateHour) {

            this.departureDateHour = departureDateHour;
            return this;
        }

        public Builder withAge(Integer age) {

            this.age = age;
            return this;
        }

        public Builder withLastName(String lastName) {

            this.lastName = lastName;
            return this;
        }

        public RecordClient build(){

            return new RecordClient(name, entryDateHour, departureDateHour, age, lastName);
        }
    }
}
