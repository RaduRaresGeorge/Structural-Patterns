package src.main.java.ComputerFacade;

/**
 * This class represents a Memory.
 * It provides a method to simulate the loading of data into a specific position in memory.
 */
public class Memory {

    /**
     * Simulates the loading of data into a specific position in memory.
     * Prints a message to the console indicating the position in memory where the data is being loaded.
     *
     * @param position the position in memory where the data is being loaded
     * @param data the data being loaded into memory
     */
    public void load(long position, byte[] data) {
        System.out.println("Loading data into position " + position + ".");
    }
}