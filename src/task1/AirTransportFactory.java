package task1;

public class AirTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Drone();
    }
}
