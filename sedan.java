package car;


public class sedan extends Car implements Purchase {
    private int length;

    public sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public double getSalePrice() {
        if (length > 20) {
            return super.getSalePrice() * 0.95;
        } else {
            return super.getSalePrice() * 0.9;
        }
    }

    public String getPurchaseInfo() {
        return "SEDAN: ";
    }

    @Override
    public String toString() {
        return "Sedan: " + getSalePrice() + ",\n";
    }

}
