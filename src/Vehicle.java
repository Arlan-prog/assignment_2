public abstract class Vehicle {
    protected String brand;
    protected int year;
    private Driver driver;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void showinfo() {
        System.out.println("Марка: " + brand);
        System.out.println("Год: " + year);
        System.out.println();
    }

    public Driver getDriver() {
        return driver;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}