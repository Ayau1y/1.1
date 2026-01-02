package fleet;

public abstract class Vehicle {

    protected int id;
    protected static int idGen = 1;
    protected String model;
    protected int year;
    protected double basePrice;

    public Vehicle(String model, int year, double basePrice) {
        this.id = idGen++;
        this.model = model;
        this.year = year;
        this.basePrice = basePrice;
    }

    public int getAge(int currentYear) {
        return currentYear - year;
    }

    public abstract double calculateInsuranceFee();

    @Override
    public String toString() {
        return "ID: " + id + ", Model: " + model +
                ", Year: " + year + ", Price: " + basePrice;
    }
}
