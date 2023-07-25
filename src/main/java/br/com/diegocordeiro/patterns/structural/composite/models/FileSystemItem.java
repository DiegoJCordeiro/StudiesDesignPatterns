package br.com.diegocordeiro.patterns.structural.composite.models;

public abstract class FileSystemItem {

    private final String name;


    public FileSystemItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void print(String structure);
}
