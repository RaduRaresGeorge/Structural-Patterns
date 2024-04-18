package src.main.java.ComputerFacade;

/**
 * This class represents a Client that uses the ComputerFacade.
 * It creates a ComputerFacade object and starts the computer.
 */
public class Client {
    /**
     * The main method which serves as the entry point for the program.
     * It creates a ComputerFacade object and starts the computer.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // Create a new ComputerFacade object
        ComputerFacade computer = new ComputerFacade();
        // Start the computer
        computer.start();
    }
}