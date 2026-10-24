public class Car extends Vehicle {
    private final int doors;
    private final String fuelType;

    public Car(String brand, int year, int doors, String fuelType) {
        super(brand, year);
        if (doors <= 0) {
            throw new IllegalArgumentException("A car must have at least one door.");
        }
        if (fuelType == null || fuelType.isBlank()) {
            throw new IllegalArgumentException("Fuel type must not be empty.");
        }
        this.doors = doors;
        this.fuelType = fuelType.trim();
    }

    @Override
    public void startEngine() { System.out.println("Машина заводится на " + fuelType); }

    @Override
    public void stopEngine() { System.out.println("Машина заглушена."); }

    @Override
    public void showInfo() {
        System.out.println("\nМАШИНА");
        super.showInfo();
        System.out.println("Дверей: " + doors);
        System.out.println("Топливо: " + fuelType);
    }
}
