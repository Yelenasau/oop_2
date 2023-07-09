public abstract class MotorTransport extends Vehicle {
    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    void checkEngine() {
        System.out.println("Проверяем двигатель");
    }


    @Override
    public void service() {
        super.service();
        checkEngine();
    }
}

