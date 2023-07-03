import com.sun.jdi.connect.Transport;

 class ServiceStation implements Service{

    public void check(Vehicle_ transport) {
        System.out.println("Начинаем сервис");
        transport.service();
        System.out.println("сервис окончен");
    }
}


