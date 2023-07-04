public class ServiceStation implements Service{

    public void check(Vehicle transport) {
        System.out.println("Начинаем сервис");
        transport.service();
        System.out.println("сервис окончен");
    }
}


