package fleet;

public class Bus extends Vehicle implements Servicable {

    private int capacity;

    public Bus(String model, int year, double basePrice, int capacity) {
        super(model, year, basePrice);
        this.capacity = capacity;
    }

    @Override
    public double calculateInsuranceFee() {
        return basePrice * 0.08;
    }

    @Override
    public void performService() {
        System.out.println("Bus service done");
    }

    @Override
    public int getServiceIntervalKm() {
        return 15000;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacity: " + capacity;
    }
}
