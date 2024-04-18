package src.main.java.TextEditorDecorator;

/**
 * This class represents a TextEditorDecorator that adds auto-save functionality to a text editor.
 * It extends the TextEditorDecorator class and overrides the write method.
 */
public class AutoSaveDecorator extends TextEditorDecorator {
    /**
     * Constructs a new AutoSaveDecorator with the specified text editor.
     *
     * @param decoratedTextEditor the text editor to be decorated
     */
    public AutoSaveDecorator(TextEditor decoratedTextEditor) {
        super(decoratedTextEditor);
    }

    /**
     * Writes the specified text to the decorated text editor and auto-saves.
     *
     * @param newText the text to be written
     */
    @Override
    public void write(String newText) {
        super.write(newText);
        save();
    }

    /**
     * Auto-saves the text.
     * Implement your saving logic here.
     */
    private void save() {
        System.out.println("Auto-saved text");
    }
}