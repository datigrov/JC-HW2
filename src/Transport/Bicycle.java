package Transport;

public class Bicycle extends Transport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public String getModelName() {
        return modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void test() {
        updateTyre();
    }
}

