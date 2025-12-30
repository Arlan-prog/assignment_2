public class Driver {
    private String name;
    private String licenseNumber;
    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }
    public void showDriverInfo() {
        System.out.println("Водитель:  " + name);
        System.out.println("Права:  " + licenseNumber);
    }
}