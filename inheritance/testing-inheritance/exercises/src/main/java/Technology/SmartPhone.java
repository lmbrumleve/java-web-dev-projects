package Technology;

public class SmartPhone extends Computer {
    private Double dataUsage;

    public SmartPhone (Double aDataUsage, String aProcessor, String anOperatingSystem, String aBrand, int aNumInStock, int aWarranty) {
        super(aProcessor, anOperatingSystem, aBrand, aNumInStock, aWarranty);
        dataUsage = aDataUsage;
    }

    public Double calculateDataUsage() {
        return dataUsage;
    }

}
