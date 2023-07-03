public abstract class MotorTransport extends Vehicle_{
    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
     void service () {
        super.service();
        checkEngine();

    }
}

