package TextPDFAdapter;

public class DocumentTxt implements Document{

    @Override
    public void display() {
        abrirTxt();
        modificarTxt();
        guardarTxt();
    }

    public void abrirTxt() {
        System.out.println("Abriendo archivo txt");
    }

    public void guardarTxt() {
        System.out.println("Guardando archivo txt");
    }

    public void modificarTxt() {
        System.out.println("Modificando archivo txt");
    }
}
