import java.util.Objects;

public abstract class WheeledTransport implements Vehicle {
    private String modelName;
    private int wheelsCount;
    public WheeledTransport (String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre () {
        System.out.println("Меняем покрышку");
    }
}
