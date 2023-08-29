package br.com.diegocordeiro.patterns.behavior.command;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.behavior.command.file.Command;
import br.com.diegocordeiro.patterns.behavior.command.file.impl.DeleteFileTxt;
import br.com.diegocordeiro.patterns.behavior.command.file.impl.SaveFileTxt;

public class ExecutorCommand implements ExecutorPatterns {

    private static final Integer TEN_SECONDS = 10000;

    private static final String PATH_SEPARATOR = "\\";

    @Override
    public void execute() {

        System.out.println("----- Start - Using Command Pattern. -----");
        System.out.println("----- -----");

        try {

            String fileName = System.getProperty("user.dir") + PATH_SEPARATOR + "design-pattern-command-example";

            Command saveFileCommand = new SaveFileTxt(fileName);
            saveFileCommand.execute();

            Thread.sleep(TEN_SECONDS);

            Command deleteFileCommand = new DeleteFileTxt(fileName);
            deleteFileCommand.execute();
        } catch (Exception exception) {
            System.out.println("Error in execution Command Pattern.");
        }

        System.out.println("----- -----");
        System.out.println("----- End - Using Command Pattern. -----");
    }
}
