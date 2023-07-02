public class Car extends MotorTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void servise() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
            checkEngine();
        }
    }
}