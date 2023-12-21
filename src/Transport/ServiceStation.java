package Transport;

public class ServiceStation extends Transport {
    public ServiceStation(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check(Car car, Bicycle bicycle, Truck truck) {
        Transport[] transports = new Transport[]{bicycle, car, truck};
        for (Transport transport : transports) {
            transport.test();
        }

    }

    @Override
    public void test() {

    }
}

