package task1;

public class LandTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
