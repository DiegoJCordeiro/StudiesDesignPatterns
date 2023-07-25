package br.com.diegocordeiro.patterns.structural.composite;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.structural.composite.models.FileItem;
import br.com.diegocordeiro.patterns.structural.composite.models.FileSystemItem;
import br.com.diegocordeiro.patterns.structural.composite.models.FolderItem;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ExecutorComposite implements ExecutorPatterns {

    private static final String INTELLIJ_DIRECTORY = ".idea";
    private static final String GIT_DIRECTORY = ".git";
    private static final String TARGET_DIRECTORY = "target";

    @Override
    public void execute() {

        System.out.println("----- Start - Using Composite Pattern. -----");

        String directory = System.getProperty("user.dir");

        File file = new File(directory);

        createStructureProject(file).print("");

        System.out.println("----- End - Using Composite Pattern. -----");
    }

    public FileSystemItem createStructureProject(File file) {

        List<String> forbiddenDirectory =  Arrays.asList(INTELLIJ_DIRECTORY, GIT_DIRECTORY, TARGET_DIRECTORY);

        if(!file.isDirectory()) return new FileItem(file.getName());

        if((forbiddenDirectory.contains(file.getName()))) return new FileItem(null);

        List<FileSystemItem> files = new ArrayList<>();

        for (File projectFile: Objects.requireNonNull(file.listFiles())){
            files.add(createStructureProject(projectFile));
        }

        return new FolderItem(file.getName(), files);
    }
}
