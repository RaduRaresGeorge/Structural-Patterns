package TextPDFAdapter;

public class DocAdapter implements Document{

    private Document document;

    public DocAdapter(Document document) {
        this.document = document;
    }

    public void display() {
        this.document.display();
    }
}
