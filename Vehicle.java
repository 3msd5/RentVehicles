public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String color;
    protected int year;
    protected int speed;
    protected boolean transmission;

    public Vehicle(String brand, String model, String color, int year, int speed, boolean transmission) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.speed = speed;
        this.transmission = transmission;

    }

    public void start(){
        System.out.println(brand+" "+ model + " is starting.");
    }
    public void stop(){
        System.out.println(brand+" "+ model + " is stopping.");
    }

    public abstract void displayInfo();

}
