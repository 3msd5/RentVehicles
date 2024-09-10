public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", "red", 2020,185,true);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", "orange", 2015,240,false);
        Truck truck = new Truck("Ford", "F-150", "red", 1999,140,false);

        car.displayInfo();
        motorcycle.displayInfo();
        truck.displayInfo();
        System.out.println("------------------------");
        car.rent();
        motorcycle.rent();
        truck.rent();
        System.out.println("------------------------");
        car.returnVehicle();
        motorcycle.returnVehicle();
        truck.returnVehicle();
    }

}
