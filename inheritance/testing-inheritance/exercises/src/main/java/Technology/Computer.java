package Technology;

public class Computer {
    private String brand;
    private String processor;
    private String operatingSystem;
    private int numInStock;
    private int warranty;


    public Computer(String aBrand, String aProcessor, String anOperatingSystem, int aNumInStock, int aWarranty) {
        brand = aBrand;
        processor = aProcessor;
        operatingSystem =anOperatingSystem;
        numInStock = aNumInStock;
        warranty = aWarranty;
    }

    public int extendWarranty() {
        return this.warranty + 30;
    }

    public int checkInventory() {
        return this.numInStock;
    }

    public String getBrand() {
        return brand;
    }

    public String getProcessor() {
        return processor;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getNumInStock() {
        return numInStock;
    }

    public int getWarranty() {
        return warranty;
    }
}
