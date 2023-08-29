package br.com.diegocordeiro.patterns.behavior.memento.models;

public class TextEditor {

    private String text;

    private Integer quantity;

    public TextEditor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getQuantity() {

        this.quantity = this.getText().length();

        return quantity;
    }

    public TextEditorMemory saveInMemory(){

        return new TextEditorMemory(this.getText(), this.getQuantity());
    }

    public void undo(TextEditorMemory textEditorMemory){

        this.text = textEditorMemory.getText();
        this.quantity = textEditorMemory.getQuantity();
    }
}
