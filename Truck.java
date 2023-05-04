package car;

public class Truck extends Car implements Purchase {
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice() * 0.9;
        } else {
            return super.getSalePrice();
        }
    }

    public String getPurchaseInfo() {
        return "TRUCK: ";
    }

    @Override
    public String toString() {
        return "Truck: " + getSalePrice() + ",\n";
    }
}
