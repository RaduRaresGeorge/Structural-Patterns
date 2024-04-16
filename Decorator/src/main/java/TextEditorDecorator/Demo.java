package TextEditorDecorator;

public class Demo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor = new SpellCheckDecorator(editor);
        editor = new AutoSaveDecorator(editor);

        editor.write("Hello, w0rld!");
        System.out.println(editor.read()); // Outputs: "Hello, world!"
    }
}
