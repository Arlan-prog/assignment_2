public class Motorcycle extends Vehicle {
    private final boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() { System.out.println("Мотоцикл заводится."); }

    @Override
    public void stopEngine() { System.out.println("Мотоцикл заглушен."); }

    @Override
    public void showInfo() {
        System.out.println("\nМОТОЦИКЛ");
        super.showInfo();
        System.out.println("Коляска: " + (hasSidecar ? "Да" : "Нет"));
    }
}
