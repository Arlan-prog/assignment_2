public class Truck extends Vehicle {
    private double capacity;
    private int numAxles;

    public Truck(String brand, int year, double capacity, int numAxles) {
        super(brand, year);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    @Override
    public void startEngine() {
        System.out.println("Грузовик заводится");
    }

    @Override
    public void stopEngine() {
        System.out.println("Грузовик глушится с шипением тормозов.");
    }

    @Override
    public void showinfo() {
        System.out.println("\nГРУЗОВИК ");
        super.showinfo();
        System.out.println("Грузоподъемность: " + capacity + " тонн");
        System.out.println("Осей: " + numAxles);
    }
}
