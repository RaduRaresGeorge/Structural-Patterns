package src.main.java.DataDecorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}
