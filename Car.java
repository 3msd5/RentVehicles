public class Car extends Vehicle implements Rentable{
    private boolean isRented;

    public Car(String brand, String model, String color, int year, int speed, boolean transmission){
        super(brand, model, color, year, speed, transmission);
        this.isRented = false;
    }
    @Override
    public void displayInfo(){
        System.out.println("Car: " + brand + " " + model + " " + color + " " + year + " " + speed + " " + transmission);

    }
    @Override
    public void rent(){
        if(!isRented){
            System.out.println(brand+" "+model+ " has been rented.");
            isRented = true;
        } else {
            System.out.println(brand+" "+model+ " has already rented.");
        }
    }
    @Override
    public void returnVehicle(){
        if(isRented){
            System.out.println(brand+" "+model+ " has been returned.");
            isRented = false;
        } else {
            System.out.println(brand+" "+model+ "  is not rented.");
        }
    }
}
