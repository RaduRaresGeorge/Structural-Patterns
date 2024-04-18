package src.main.java.DataDecorator.decorators;

import src.main.java.DataDecorator.DataSource;
import src.main.java.DataDecorator.DataSourceDecorator;

import java.util.Base64;

/**
 * This class represents a DataSourceDecorator that adds encryption to a data source.
 * It extends the DataSourceDecorator class and overrides the writeData and readData methods.
 */
public class EncryptionDecorator extends DataSourceDecorator {

    /**
     * Constructs a new EncryptionDecorator with the specified data source.
     *
     * @param source the data source to be decorated
     */
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    /**
     * Writes data to the decorated data source with encryption.
     *
     * @param data the data to be written
     */
    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    /**
     * Reads data from the decorated data source with decryption.
     *
     * @return the decrypted data
     */
    @Override
    public String readData() {
        return decode(super.readData());
    }

    /**
     * Encodes the given data.
     *
     * @param data the data to be encoded
     * @return the encoded data
     */
    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    /**
     * Decodes the given data.
     *
     * @param data the data to be decoded
     * @return the decoded data
     */
    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}