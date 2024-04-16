package src.main.java.TextEditorDecorator;

public class AutoSaveDecorator extends TextEditorDecorator {
    public AutoSaveDecorator(TextEditor decoratedTextEditor) {
        super(decoratedTextEditor);
    }

    @Override
    public void write(String newText) {
        super.write(newText);
        save();
    }

    private void save() {
        // Implement your saving logic here
        System.out.println("Auto-saved text");
    }
}