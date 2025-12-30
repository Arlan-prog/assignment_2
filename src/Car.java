public class Car extends Vehicle {
    private int doors;
    private String fuelType;

    public Car(String brand, int year, int doors, String fuelType) {
        super(brand, year);
        this.doors = doors;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine() {
        System.out.println("Машина заводится на " + fuelType);
    }
    @Override
    public void stopEngine() {
        System.out.println("Машина глушится  все нормально");
    }
    @Override
    public void showinfo() {
        System.out.println("\nМАШИНА ");
        super.showinfo();
        System.out.println("Дверей: " + doors);
        System.out.println("Топливо: " + fuelType);
    }
}