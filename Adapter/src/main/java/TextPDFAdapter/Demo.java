package TextPDFAdapter;

public class Demo {
    public static void main(String[] args) {
        Document document = new DocumentPdf();
        DocAdapter docAdapter = new DocAdapter(document);
        docAdapter.display();

    }
}
