package br.com.diegocordeiro.patterns.creational.abstractfactory.models;

public class PhoneProperties {

    private final String memory;

    private final String cpu;

    public PhoneProperties(String memory, String cpu) {

        this.memory = memory;
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public String getCpu() {
        return cpu;
    }

    @Override
    public String toString() {
        return "PhoneProperties{" +
                "memory='" + memory + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }

    public static class Builder {

        private String memory;

        private String cpu;

        public Builder(){}

        public Builder withMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder withCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public PhoneProperties build() {
            return new PhoneProperties(this.memory, this.cpu);
        }
    }
}
