package src.main.java.TextEditorDecorator;

/**
 * This class demonstrates the use of decorators to add spell check and auto-save functionality to a text editor.
 * The main method creates a text editor, decorates it with a SpellCheckDecorator and an AutoSaveDecorator, writes text to the editor, and then reads the corrected and auto-saved text.
 */
public class Demo {
    public static void main(String[] args) {
        // Create a plain text editor
        TextEditor editor = new TextEditor();

        // Decorate the text editor with a SpellCheckDecorator
        editor = new SpellCheckDecorator(editor);

        // Decorate the text editor with an AutoSaveDecorator
        editor = new AutoSaveDecorator(editor);

        // Write text to the decorated text editor
        editor.write("Hello, w0rld!");

        // Read the corrected and auto-saved text from the decorated text editor
        System.out.println(editor.read()); // Outputs: "Hello, world!"
    }
}