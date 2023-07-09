public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Mazda", 4);
        Car car2 = new Car("Honda", 4);


        Truck truck = new Truck("Maz", 6);
        Truck truck2 = new Truck("Daff", 8);


        Bicycle bicycle = new Bicycle("Street", 2);
        Vehicle bicycle2 = new Bicycle("Steels", 2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(bicycle);
        station.check(truck);

    }
}
