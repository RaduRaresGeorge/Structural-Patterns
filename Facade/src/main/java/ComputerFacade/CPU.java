package src.main.java.ComputerFacade;

/**
 * This class represents a Central Processing Unit (CPU).
 * It provides methods to simulate the operations of a CPU such as freezing, jumping to a position, and executing an operation.
 */
public class CPU {

    /**
     * Simulates the freezing of the processor.
     * Prints a message to the console indicating that the processor is freezing.
     */
    public void freeze() {
        System.out.println("Freezing processor.");
    }

    /**
     * Simulates the jumping of the processor to a specific position.
     * Prints a message to the console indicating the position the processor is jumping to.
     *
     * @param position the position the processor is jumping to
     */
    public void jump(long position) {
        System.out.println("Jumping to position " + position + ".");
    }

    /**
     * Simulates the execution of an operation by the processor.
     * Prints a message to the console indicating that the processor is executing an operation.
     */
    public void execute() {
        System.out.println("Executing operation.");
    }
}