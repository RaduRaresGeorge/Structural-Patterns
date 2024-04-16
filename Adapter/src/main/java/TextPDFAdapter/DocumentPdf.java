package src.main.java.TextPDFAdapter;

public class DocumentPdf implements Document {

    public void display() {
        abrirPdf();
        modificarPdf();
        guardarPdf();
    }

    public void abrirPdf() {
        System.out.println("Abriendo archivo pdf");
    }

    public void guardarPdf() {
        System.out.println("Guardando archivo pdf");
    }

    public void modificarPdf() {
        System.out.println("Modificando archivo pdf");
    }
}
