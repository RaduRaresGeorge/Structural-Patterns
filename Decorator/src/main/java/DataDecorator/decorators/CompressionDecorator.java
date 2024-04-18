package src.main.java.DataDecorator.decorators;

import src.main.java.DataDecorator.DataSource;
import src.main.java.DataDecorator.DataSourceDecorator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/**
 * This class represents a DataSourceDecorator that adds compression to a data source.
 * It extends the DataSourceDecorator class and overrides the writeData and readData methods.
 */
public class CompressionDecorator extends DataSourceDecorator {
    private int compLevel = 6;

    /**
     * Constructs a new CompressionDecorator with the specified data source.
     *
     * @param source the data source to be decorated
     */
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    /**
     * Returns the compression level of the decorated data source.
     *
     * @return the compression level of the decorated data source
     */
    public int getCompressionLevel() {
        return compLevel;
    }

    /**
     * Sets the compression level of the decorated data source.
     *
     * @param value the new compression level
     */
    public void setCompressionLevel(int value) {
        compLevel = value;
    }

    /**
     * Writes data to the decorated data source with compression.
     *
     * @param data the data to be written
     */
    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    /**
     * Reads data from the decorated data source with decompression.
     *
     * @return the decompressed data
     */
    @Override
    public String readData() {
        return decompress(super.readData());
    }

    /**
     * Compresses the given data.
     *
     * @param stringData the data to be compressed
     * @return the compressed data
     */
    private String compress(String stringData) {
        byte[] data = stringData.getBytes();
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater(compLevel));
            dos.write(data);
            dos.close();
            bout.close();
            return Base64.getEncoder().encodeToString(bout.toByteArray());
        } catch (IOException ex) {
            return null;
        }
    }

    /**
     * Decompresses the given data.
     *
     * @param stringData the data to be decompressed
     * @return the decompressed data
     */
    private String decompress(String stringData) {
        byte[] data = Base64.getDecoder().decode(stringData);
        try {
            InputStream in = new ByteArrayInputStream(data);
            InflaterInputStream iin = new InflaterInputStream(in);
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            int b;
            while ((b = iin.read()) != -1) {
                bout.write(b);
            }
            in.close();
            iin.close();
            bout.close();
            return new String(bout.toByteArray());
        } catch (IOException ex) {
            return null;
        }
    }
}
