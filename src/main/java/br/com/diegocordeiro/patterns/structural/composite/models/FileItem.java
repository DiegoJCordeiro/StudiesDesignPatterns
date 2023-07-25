package br.com.diegocordeiro.patterns.structural.composite.models;

public class FileItem extends FileSystemItem {

    public FileItem(String name) {
        super(name);
    }

    @Override
    public void print(String structure) {
        if(getName() == null) return;
        System.out.println(structure + getName());
    }
}
