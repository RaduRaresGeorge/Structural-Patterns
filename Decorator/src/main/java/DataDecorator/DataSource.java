package src.main.java.DataDecorator;

/**
 * This interface represents a data source.
 * It provides methods for writing data to and reading data from the data source.
 */
public interface DataSource {
    /**
     * Writes the specified data to the data source.
     *
     * @param data the data to be written
     */
    void writeData(String data);

    /**
     * Reads data from the data source.
     *
     * @return the data read from the data source
     */
    String readData();
}