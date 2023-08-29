package br.com.diegocordeiro.patterns.behavior.command.file.impl;

import br.com.diegocordeiro.patterns.behavior.command.file.Command;

import java.io.File;

public class SaveFileTxt implements Command {

    private final String fileName;

    private static final String fileExtension = ".txt";

    public SaveFileTxt(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void execute() {

        try {
            File file = new File(this.fileName.concat(fileExtension));
            boolean hasCreated = file.createNewFile();

            if(hasCreated) {
                System.out.println("Successfully: File was created.");
            }
        } catch (Exception exception) {
            System.out.println("Error: Is not possible create the file .txt.");
        }
    }
}
