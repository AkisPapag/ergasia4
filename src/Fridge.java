import java.lang.reflect.Field;

public class Fridge {

    private float length = 186;
    private float height = 60;
    private float depth = 66;
    private String companyName = "Bosch";
    private String deviceName = "KGN36ELEA";
    private String deviceType = "untitled.src.Fridge";
    private float energyConsumption = 100;


    private int shelveAmount = 3;
    private boolean waterSupply = false;
    private float minTemperature = -20;
    private float weight = 70;
    private char energyClass = 'E';

    public Fridge()
    {
        homeappliancesstore.deviceCounter ++;
    }

    public Fridge(String companyName)
    {
        homeappliancesstore.deviceCounter ++;
    }

    void periodicMaintenance()
    {

    }

    void PrintDetails()
    {
        Field[] fields = Fridge.class.getDeclaredFields();

        for (Field f : fields)
        {
            try
            {
                System.out.println(f.get(this));
            }
            catch (IllegalAccessException e)
            {
                throw new RuntimeException(e);
            }
        }
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public float getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(float energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public int getShelveAmount() {
        return shelveAmount;
    }

    public void setShelveAmount(int shelveAmount) {
        this.shelveAmount = shelveAmount;
    }

    public boolean isWaterSupply() {
        return waterSupply;
    }

    public void setWaterSupply(boolean waterSupply) {
        this.waterSupply = waterSupply;
    }

    public float getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(float minTemperature) {
        this.minTemperature = minTemperature;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public char getEnergyClass() {
        return energyClass;
    }

    public void setEnergyClass(char energyClass) {
        this.energyClass = energyClass;
    }
}

