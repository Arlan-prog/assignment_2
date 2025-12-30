public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand,int year,boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }
    @Override
    public void startEngine() {
        System.out.println("Мотоцикл рычит!");
    }
    @Override
    public void stopEngine() {
        System.out.println("Мотоцикл остывает");
    }
    @Override
    public void showinfo() {
        System.out.println("\nМОТОЦИКЛ ");
        super.showinfo();
        String t =hasSidecar ? "Да" : "Нет";
        System.out.println("Коляска: " + t);
        System.out.println();
    }
}