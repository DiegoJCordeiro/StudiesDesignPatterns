package br.com.diegocordeiro.patterns.behavior.memento.models;

public class TextEditorMemory {

    private final String text;

    private final Integer quantity;

    public TextEditorMemory(String text, Integer quantity) {
        this.text = text;
        this.quantity = quantity;
    }

    public String getText() {
        return text;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "TextEditorMemory{" +
                "text='" + text + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
