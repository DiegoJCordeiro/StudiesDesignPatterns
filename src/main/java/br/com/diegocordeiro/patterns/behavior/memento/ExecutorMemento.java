package br.com.diegocordeiro.patterns.behavior.memento;

import br.com.diegocordeiro.patterns.ExecutorPatterns;
import br.com.diegocordeiro.patterns.behavior.memento.models.TextEditor;
import br.com.diegocordeiro.patterns.behavior.memento.models.TextEditorMemory;
import br.com.diegocordeiro.patterns.behavior.memento.models.TextEditorWindow;

public class ExecutorMemento implements ExecutorPatterns {

    @Override
    public void execute() {

        System.out.println("----- Start - Using Memento Pattern. -----");

        TextEditor firstTextEditor = new TextEditor("Olá Memento 1");
        TextEditorMemory firstTextEditorMemory = firstTextEditor.saveInMemory();

        TextEditorWindow textEditorWindow = new TextEditorWindow();
        textEditorWindow.addText(firstTextEditorMemory);

        TextEditor secondTextEditor = new TextEditor("Olá Memento 22");
        TextEditorMemory secondTextEditorMemory = secondTextEditor.saveInMemory();
        textEditorWindow .addText(secondTextEditorMemory);

        TextEditor thirdTextEditor = new TextEditor("Olá Memento 333");
        TextEditorMemory thirdTextEditorMemory = thirdTextEditor.saveInMemory();
        textEditorWindow .addText(thirdTextEditorMemory);

        System.out.println("----- -----");

        TextEditor fourTextEditor = new TextEditor("Olá Memento 4444");
        TextEditorMemory fourTextEditorMemory = fourTextEditor.saveInMemory();
        textEditorWindow .addText(fourTextEditorMemory);

        System.out.println("Current text: " + textEditorWindow.undo().toString());
        System.out.println("Past text: " + textEditorWindow.undo().toString());
        System.out.println("Past text: " + textEditorWindow.undo().toString());
        System.out.println("Past text: " + textEditorWindow.undo().toString());

        System.out.println("----- -----");

        System.out.println("----- End - Using Memento Pattern. -----");
    }
}
