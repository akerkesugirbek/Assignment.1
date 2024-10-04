package task1;

public class FactoryMethod {
    public static void main(String[] args) {
        TransportFactory factory;


        factory = new WaterTransportFactory();
        Transport transport = factory.createTransport();
        transport.deliver();


        factory = new LandTransportFactory();
        transport = factory.createTransport();
        transport.deliver();


        factory = new AirTransportFactory();
        transport = factory.createTransport();
        transport.deliver();
    }
}