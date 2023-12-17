package Transport;

public abstract class Transport implements Testable{
    public String modelName;
    public int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public String getModelName() {
        return modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Обслуживаем " + modelName);
        System.out.println("Замена покрышек: " + wheelsCount);
        System.out.println("Меняем покрышку");
    }

}
