package src.main.java.DataDecorator;

import src.main.java.DataDecorator.decorators.CompressionDecorator;
import src.main.java.DataDecorator.decorators.EncryptionDecorator;

/**
 * This class demonstrates the use of decorators to add compression and encryption to a data source.
 * The main method writes data to a file, reads the encoded data from the file, and then reads the decoded data.
 */
public class Demo {
    public static void main(String[] args) {
        // The data to be written to the file
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        // Create a data source decorator that adds compression and encryption to a file data source
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));

        // Write the data to the file
        encoded.writeData(salaryRecords);

        // Create a plain file data source
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        // Print the original data
        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);

        // Print the encoded data read from the file
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());

        // Print the decoded data read from the decorated data source
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}