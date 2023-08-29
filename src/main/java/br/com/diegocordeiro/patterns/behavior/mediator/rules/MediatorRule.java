package br.com.diegocordeiro.patterns.behavior.mediator.rules;

import br.com.diegocordeiro.patterns.behavior.command.file.impl.DeleteFileTxt;
import br.com.diegocordeiro.patterns.behavior.command.file.impl.SaveFileTxt;

public class MediatorRule {

    protected String fileName;

    private static final String PATH_SEPARATOR = "\\";

    public MediatorRule(String fileName) {
        this.fileName = System.getProperty("user.dir") + PATH_SEPARATOR + fileName;
    }

    public void save(){

        SaveFileTxt saveFileTxt = new SaveFileTxt(this.fileName);
        saveFileTxt.execute();
    }

    public void delete(){

        DeleteFileTxt deleteFileTxt = new DeleteFileTxt(this.fileName);
        deleteFileTxt.execute();
    }
}
