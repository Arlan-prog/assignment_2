public abstract class Vehicle {
    private final String brand;
    private final int year;
    private Driver driver;

    public Vehicle(String brand, int year) {
        if (brand == null || brand.isBlank()) {
            throw new IllegalArgumentException("Brand must not be empty.");
        }
        if (year < 1886) {
            throw new IllegalArgumentException("Year must be 1886 or later.");
        }
        this.brand = brand.trim();
        this.year = year;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void showInfo() {
        System.out.println("Марка: " + brand);
        System.out.println("Год: " + year);
    }

    public Driver getDriver() { return driver; }
    public void setDriver(Driver driver) { this.driver = driver; }
}
