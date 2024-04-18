package src.main.java.ComputerFacade;

/**
 * This class represents a Hard Drive.
 * It provides a method to simulate the reading of data from a specific location on the hard drive.
 */
public class HardDrive {

    /**
     * Simulates the reading of data from a specific location on the hard drive.
     * Prints a message to the console indicating the size of the data and the location being read from.
     *
     * @param lba the location on the hard drive to read from
     * @param size the size of the data to read
     * @return a byte array representing the data read
     */
    public byte[] read(long lba, int size) {
        System.out.println("Reading " + size + " bytes from LBA " + lba + ".");
        return new byte[size];
    }
}