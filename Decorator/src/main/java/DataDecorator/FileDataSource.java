package src.main.java.DataDecorator;

import java.io.*;

/**
 * This class represents a file data source.
 * It implements the DataSource interface and provides methods for writing data to and reading data from a file.
 */
public class FileDataSource implements DataSource {
    private String name;

    /**
     * Constructs a new FileDataSource with the specified file name.
     *
     * @param name the name of the file
     */
    public FileDataSource(String name) {
        this.name = name;
    }

    /**
     * Writes the specified data to the file.
     *
     * @param data the data to be written
     */
    @Override
    public void writeData(String data) {
        File file = new File(name);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Reads data from the file.
     *
     * @return the data read from the file
     */
    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}