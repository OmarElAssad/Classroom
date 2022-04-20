public class Computer {
    private String operatingSystem;
    private float processTact;
    private float memory;
    private int hardDrive;


    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public float getProcessTact() {
        return this.processTact;
    }

    public void setProcessTact(float processTact) {
        this.processTact = processTact;
    }

    public float getMemory() {
        return this.memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    public int getHardDrive() {
        return this.hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void printInConsole() {
        System.out.println("Operating system: " + this.getOperatingSystem());
        System.out.println("Process tact: " + this.getProcessTact());
        System.out.println("Memory: " + this.getMemory());
        System.out.println("Hard drive: " + this.getHardDrive());
        System.out.println();
    }

}
