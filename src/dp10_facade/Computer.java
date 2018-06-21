package dp10_facade;

public class Computer {

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void start() {
        System.out.println("Computer starting ..");
        cpu.start();
        disk.start();
        memory.start();
        System.out.println("Computer success! ");
    }

    public void shutdown() {
        System.out.println("Computer  shutdown...");
        disk.shutdown();
        memory.shutdown();
        cpu.shutdown();

        System.out.println("Computer shutdown success !");

    }
}
