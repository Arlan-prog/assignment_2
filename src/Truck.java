public class Truck extends Vehicle {
    private final double capacity;
    private final int numAxles;

    public Truck(String brand, int year, double capacity, int numAxles) {
        super(brand, year);
        if (!Double.isFinite(capacity) || capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be a positive number.");
        }
        if (numAxles <= 0) {
            throw new IllegalArgumentException("Number of axles must be positive.");
        }
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    @Override
    public void startEngine() { System.out.println("Грузовик заводится."); }

    @Override
    public void stopEngine() { System.out.println("Грузовик заглушен."); }

    @Override
    public void showInfo() {
        System.out.println("\nГРУЗОВИК");
        super.showInfo();
        System.out.println("Грузоподъёмность: " + capacity + " тонн");
        System.out.println("Осей: " + numAxles);
    }
}
