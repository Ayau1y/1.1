package fleet;

public class Car extends Vehicle implements Servicable {

    private int doors;

    public Car(String model, int year, double basePrice, int doors) {
        super(model, year, basePrice);
        this.doors = doors;
    }

    @Override
    public double calculateInsuranceFee() {
        return basePrice * 0.05;
    }

    @Override
    public void performService() {
        System.out.println("Car service done");
    }

    @Override
    public int getServiceIntervalKm() {
        return 10000;
    }

    @Override
    public String toString() {
        return super.toString() + ", Doors: " + doors;
    }
}
