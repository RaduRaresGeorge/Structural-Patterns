package TextEditorDecorator;

public class TextEditor {
    private String text;

    public void write(String newText) {
        text = newText;
    }

    public String read() {
        return text;
    }
}
