package src.main.java.TextEditorDecorator;

public abstract class TextEditorDecorator extends TextEditor {
    protected TextEditor decoratedTextEditor;

    public TextEditorDecorator(TextEditor decoratedTextEditor) {
        this.decoratedTextEditor = decoratedTextEditor;
    }

    @Override
    public void write(String newText) {
        decoratedTextEditor.write(newText);
    }

    @Override
    public String read() {
        return decoratedTextEditor.read();
    }
}
