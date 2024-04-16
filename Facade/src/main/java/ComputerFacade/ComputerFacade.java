package src.main.java.ComputerFacade;

public class ComputerFacade {
    private static final long BOOT_ADDRESS = 0;
    private static final long BOOT_SECTOR = 0;
    private static final int SECTOR_SIZE = 1024;

    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        byte[] bootData = hd.read(BOOT_SECTOR, SECTOR_SIZE);
        ram.load(BOOT_ADDRESS, bootData);
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
