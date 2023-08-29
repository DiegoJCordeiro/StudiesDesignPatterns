package br.com.diegocordeiro.patterns.behavior.command.file.impl;

import br.com.diegocordeiro.patterns.behavior.command.file.Command;

import java.io.File;
import java.io.IOException;

public class DeleteFileTxt implements Command {

    private final String fileName;

    private static final String fileExtension = ".txt";

    public DeleteFileTxt(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void execute() {

        File fileTxt = new File(this.fileName.concat(fileExtension));
        boolean exists = fileTxt.exists();

        if(exists) {
            boolean hasDeleted = fileTxt.delete();
            System.out.println(hasDeleted ? "Successfully: File was deleted.":  "Warning: File was not deleted.");
        }
    }
}
