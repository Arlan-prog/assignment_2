public class Driver {
    private final String name;
    private final String licenseNumber;

    public Driver(String name, String licenseNumber) {
        if (name == null || name.isBlank() || licenseNumber == null || licenseNumber.isBlank()) {
            throw new IllegalArgumentException("Driver name and license number must not be empty.");
        }
        this.name = name.trim();
        this.licenseNumber = licenseNumber.trim();
    }

    public void showDriverInfo() {
        System.out.println("Водитель: " + name);
        System.out.println("Права: " + licenseNumber);
    }
}
