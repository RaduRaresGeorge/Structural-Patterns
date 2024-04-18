package src.main.java.ComputerFacade;

/**
 * This class represents a Computer Facade.
 * It provides a simplified interface to a complex subsystem of a computer.
 * The subsystems in this case are the CPU, Memory and Hard Drive.
 */
public class ComputerFacade {
    private static final long BOOT_ADDRESS = 0;
    private static final long BOOT_SECTOR = 0;
    private static final int SECTOR_SIZE = 1024;

    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;

    /**
     * Constructs a new ComputerFacade object.
     * Initializes the CPU, Memory and Hard Drive.
     */
    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    /**
     * Starts the computer.
     * The process includes freezing the processor, reading the boot sector from the hard drive,
     * loading the boot data into memory, jumping to the boot address in the processor and executing.
     */
    public void start() {
        processor.freeze();
        byte[] bootData = hd.read(BOOT_SECTOR, SECTOR_SIZE);
        ram.load(BOOT_ADDRESS, bootData);
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}