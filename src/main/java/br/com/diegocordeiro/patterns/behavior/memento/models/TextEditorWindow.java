package br.com.diegocordeiro.patterns.behavior.memento.models;

import java.util.ArrayDeque;
import java.util.Deque;

public class TextEditorWindow {

    private final Deque<TextEditorMemory> textEditorsMemory = new ArrayDeque<>();

    public TextEditorWindow(){

    }

    public void addText(TextEditorMemory textEditorMemory){

        this.textEditorsMemory.add(textEditorMemory);
    }

    public TextEditorMemory undo(){

        return this.textEditorsMemory.removeLast();
    }
}
