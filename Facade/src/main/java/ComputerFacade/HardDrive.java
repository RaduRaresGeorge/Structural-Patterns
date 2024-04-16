package ComputerFacade;

public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("Reading " + size + " bytes from LBA " + lba + ".");
        return new byte[size];
    }
}
