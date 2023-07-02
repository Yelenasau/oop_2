import java.util.Objects;

public class Bicycle extends WheeledTransport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void servise() {
        updateTyre ();
    }
}

