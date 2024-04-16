package src.main.java.TextEditorDecorator;

public class SpellCheckDecorator extends TextEditorDecorator {
    public SpellCheckDecorator(TextEditor decoratedTextEditor) {
        super(decoratedTextEditor);
    }

    @Override
    public void write(String newText) {
        super.write(checkSpelling(newText));
    }

    private String checkSpelling(String text) {
        // Implement your spell checking logic here
        // For simplicity, let's just return the original text
        return text;
    }
}