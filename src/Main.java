import Transport.Bicycle;
import Transport.Car;
import Transport.Transport;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Forward", 2);
        Car car = new Car("Audi RS6", 4);
        Truck truck = new Truck("MAN", 6);

        truck.test();
        bicycle.test();
        car.test();


    }
}