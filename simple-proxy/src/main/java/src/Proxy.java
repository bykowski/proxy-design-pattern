package src;

public class Proxy implements Service {

    Service service;

    @Override
    public void method() {
        System.out.println("Before");
        if (service == null)
            service = new ServiceImpl();
        service.method();
        System.out.println("After");
    }
}
