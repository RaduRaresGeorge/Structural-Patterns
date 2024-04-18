package src.main.java.TextEditorDecorator;

/**
 * This class represents a TextEditorDecorator that adds spell check functionality to a text editor.
 * It extends the TextEditorDecorator class and overrides the write method.
 */
public class SpellCheckDecorator extends TextEditorDecorator {
    /**
     * Constructs a new SpellCheckDecorator with the specified text editor.
     *
     * @param decoratedTextEditor the text editor to be decorated
     */
    public SpellCheckDecorator(TextEditor decoratedTextEditor) {
        super(decoratedTextEditor);
    }

    /**
     * Writes the specified text to the decorated text editor after checking its spelling.
     *
     * @param newText the text to be written
     */
    @Override
    public void write(String newText) {
        super.write(checkSpelling(newText));
    }

    /**
     * Checks the spelling of the specified text.
     * Implement your spell checking logic here.
     * For simplicity, this method currently just returns the original text.
     *
     * @param text the text whose spelling is to be checked
     * @return the text after checking its spelling
     */
    private String checkSpelling(String text) {
        // Implement your spell checking logic here
        // For simplicity, let's just return the original text
        return text;
    }
}