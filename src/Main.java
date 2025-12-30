public class Main {
    public static void main(String[] args) {
        System.out.println("СИСТЕМА УПРАВЛЕНИЕ ТРАНСПОРТОМ \n");

        Driver driver1 = new Driver("Ardak Akyt", "700AFE016");
        Driver driver2 = new Driver("Naryn Kozha", "724AFE001");

        Car car = new Car("Toyota", 2023, 4, "Бензин");
        Motorcycle bike = new Motorcycle("YOKOHAMA", 2021, false);
        Truck tracktor = new Truck("Volvo", 2025, 19.2, 3);

        car.setDriver(driver1);
        bike.setDriver(driver1);
        tracktor.setDriver(driver2);

        Vehicle[] fleet = {car, bike, tracktor};
        for (int i = 0; i < fleet.length; i++) {
            System.out.println("\nТранспорт " + (i + 1));
            fleet[i].startEngine();
            fleet[i].showinfo();
            Driver d = fleet[i].getDriver();
            if (d!= null) {
                d.showDriverInfo();
            }
            fleet[i].stopEngine();
        }
        System.out.println("\n КОНЕЦ системы ");
    }
}