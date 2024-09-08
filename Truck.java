public class Truck extends Vehicle implements Rentable {
    private boolean isRented;

    public Truck(String brand, String model, String color, int year, int speed, boolean transmission) {
        super(brand, model, color, year, speed, transmission);
        this.isRented = false;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck: " + brand + " " + model + " " + color + " " + year + " " + speed + " " + transmission);
    }

    @Override
    public void rent() {
        if (!isRented) {
            System.out.println(brand + " " + model + " truck has been rented.");
            isRented = true;
        } else {
            System.out.println(brand + " " + model + " truck is already rented.");
        }
    }

    @Override
    public void returnVehicle() {
        if (isRented) {
            System.out.println(brand + " " + model + " truck has been returned.");
            isRented = false;
        } else {
            System.out.println(brand + " " + model + " truck is not rented.");
        }
    }
}
