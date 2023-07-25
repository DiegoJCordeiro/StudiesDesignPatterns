package br.com.diegocordeiro.patterns.structural.composite.models;

import java.util.List;

public class FolderItem extends FileSystemItem {

    private final List<FileSystemItem> children;

    public FolderItem(String name, List<FileSystemItem> children) {

        super(name);
        this.children = children;
    }

    @Override
    public void print(String structure) {

        System.out.println(structure + getName());

        for(FileSystemItem child: children){
            child.print(structure + " | ");
        }
    }


}
