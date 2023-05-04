package car;

public class AutoShop {
    public static void main(String[] args) {
        sedan sedan = new sedan(170, 20000, "red", 10);
        System.out.println(sedan.toString());

        Ford ford1 = new Ford(220, 30000, "blue", 2010, 5000);
        System.out.println(ford1.toString());

        Ford ford2 = new Ford(180, 25000, "silver", 2015,0);
        System.out.println(ford2.toString());

        Truck truck = new Truck(120, 40000, "black", 5000);
        System.out.println(truck.toString());
    }
}
