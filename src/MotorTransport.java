public abstract class MotorTransport extends WheeledTransport {
    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void servise() {

    }
}

