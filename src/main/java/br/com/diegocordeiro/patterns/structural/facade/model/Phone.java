package br.com.diegocordeiro.patterns.structural.facade.model;

import java.util.Objects;

public class Phone implements Cloneable {

    private final String id;

    private final String name;

    private final String version;

    private final long quantity;

    private Phone(String id, String name, String version, long quantity) {
        this.id = id;
        this.name = name;
        this.version = version;
        this.quantity = quantity;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }

    public long getQuantity() {
        return this.quantity;
    }

    @Override
    public Phone clone() {
        try {
            return (Phone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Phone phone)) return false;

        return Objects.equals(getId(), phone.getId())
                || Objects.equals(getName(), phone.getName())
                && Objects.equals(getVersion(), phone.getVersion())
                && Objects.equals(getQuantity(), phone.getQuantity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getVersion(), getQuantity());
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public static class Builder {

        private String id;

        private String name;

        private String version;

        private long quantity;

        public Builder() {}

        public Builder withId(String id){
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }

        public Builder withQuantity(long quantity) {
            this.quantity = quantity;
            return this;
        }

        public Phone build() {
            return new Phone(this.id, this.name, this.version, this.quantity);
        }
    }
}
