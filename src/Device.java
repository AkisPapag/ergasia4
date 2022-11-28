public class Device {
    public float length ;
    public float height ;
    public float depth ;
    public String companyName ;
    public String deviceName ;
    public String deviceType ;
    public float energyConsumption;
    boolean status;

    public Device()
    {

    }

    public Device(float length, float height , float depth , String companyName,String deviceName, String deviceType, float energyConsumption) {
        this.length = length;
        this.height = height;
        this.depth = depth;
        this.companyName = companyName;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.energyConsumption = energyConsumption;
    }
    public java.lang.String toString() {
        return  length + ", " + height + ", " + depth + ", " + companyName + ", " + deviceName + ", " + deviceType + ", " + energyConsumption + '\n';
    }

    public void PowerOn(){
        status = true;
        System.out.println("status device ine true");
    }

    public void PowerOff(){
        status = false;
        System.out.println("status device ine false");
    }

    public boolean status() {
        return status;
    }
}
