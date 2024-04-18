package src.main.java.DataDecorator;

/**
 * This class represents a decorator for a data source.
 * It implements the DataSource interface and delegates the writeData and readData methods to the decorated data source.
 */
public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    /**
     * Constructs a new DataSourceDecorator with the specified data source.
     *
     * @param source the data source to be decorated
     */
    public DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    /**
     * Writes the specified data to the decorated data source.
     *
     * @param data the data to be written
     */
    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    /**
     * Reads data from the decorated data source.
     *
     * @return the data read from the decorated data source
     */
    @Override
    public String readData() {
        return wrappee.readData();
    }
}