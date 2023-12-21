package Technology;

public class Laptop extends Computer {
    Double screenSize;

    public Laptop(Double aScreenSize, String aProcessor, String anOperatingSystem, String aBrand, int aNumInStock, int aWarranty) {
        super(aProcessor, anOperatingSystem, aBrand, aNumInStock, aWarranty);
        screenSize = aScreenSize;
    }
    public boolean readyToShip() {
        return (this.getNumInStock() > 0);
    }
}
