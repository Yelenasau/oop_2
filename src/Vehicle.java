public class Vehicle {

    private String modelName;
    private int wheelsCount;
    public Vehicle(String modelName, int wheelsCount) {
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

    public void service(){

        System.out.println("Обслуживаем " + this.getModelName());

        for (int i = 0; i < this.getWheelsCount(); i++) {

            this.updateTyre();

        }

    }


}

