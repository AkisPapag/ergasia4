import java.lang.reflect.Field;

public class AirCondition extends Device
    {


        private float length = 100;
        private float height = 40;
        private float depth = 30;
        private String companyName = "Pitsos";
        private String deviceName = "PSI09VW3";
        private String deviceType = "untitled.src.AirCondition";
        private float energyConsumption = 100;


        private boolean hasControl = true;
        private float minTemperature = 10;
        private float maxTemperature = 40;
        private float weight = 50;
        private char energyClass = 'A';

        public AirCondition()
        {
            homeappliancesstore.deviceCounter ++;
        }

        public AirCondition(String companyName)
        {
            this.PowerOff();
            homeappliancesstore.deviceCounter ++;
        }

        void periodicMaintenance()
        {

        }

        void PrintDetails()
        {
            Field[] fields = AirCondition.class.getDeclaredFields();

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

        public boolean isHasControl() {
            return hasControl;
        }

        public void setHasControl(boolean hasControl) {
            this.hasControl = hasControl;
        }

        public float getMinTemperature() {
            return minTemperature;
        }

        public void setMinTemperature(float minTemperature) {
            this.minTemperature = minTemperature;
        }

        public float getMaxTemperature() {
            return maxTemperature;
        }

        public void setMaxTemperature(float maxTemperature) {
            this.maxTemperature = maxTemperature;
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
