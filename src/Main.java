public class Main {
    public static void main(String[] args) {
        System.out.println("СИСТЕМА УПРАВЛЕНИЯ ТРАНСПОРТОМ\n");

        Driver driver1 = new Driver("Ardak Akyt", "700AFE016");
        Driver driver2 = new Driver("Naryn Kozha", "724AFE001");

        Vehicle[] fleet = {
                new Car("Toyota", 2023, 4, "Бензин"),
                new Motorcycle("YOKOHAMA", 2021, false),
                new Truck("Volvo", 2025, 19.2, 3)
        };
        fleet[0].setDriver(driver1);
        fleet[1].setDriver(driver1);
        fleet[2].setDriver(driver2);

        for (int i = 0; i < fleet.length; i++) {
            Vehicle vehicle = fleet[i];
            System.out.println("\nТранспорт " + (i + 1));
            vehicle.startEngine();
            vehicle.showInfo();
            Driver driver = vehicle.getDriver();
            if (driver != null) {
                driver.showDriverInfo();
            }
            vehicle.stopEngine();
        }
        System.out.println("\nСистема завершена.");
    }
}
