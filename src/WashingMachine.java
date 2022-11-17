import java.lang.reflect.Field;

public class WashingMachine
    {


        private float length = 75;
        private float height = 70;
        private float depth = 50;
        private String companyName = "Bosch";
        private String deviceName = "WAN28208GR";
        private String deviceType = "untitled.src.WashingMachine";
        private float energyConsumption = 100;


        private int programNumber = 15;
        private int maxTurns = 1400;
        private float storageInKilograms = 8;
        private float weight = 30;
        private char energyClass = 'C';

        public WashingMachine()
        {
            homeappliancesstore.deviceCounter ++;
        }

        public WashingMachine(String companyName)
        {
            homeappliancesstore.deviceCounter ++;
        }

        void periodicMaintenance()
        {

        }

        void PrintDetails()
        {
            Field[] fields = WashingMachine.class.getDeclaredFields();

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

        public int getProgramNumber() {
            return programNumber;
        }

        public void setProgramNumber(int programNumber) {
            this.programNumber = programNumber;
        }

        public int getMaxTurns() {
            return maxTurns;
        }

        public void setMaxTurns(int maxTurns) {
            this.maxTurns = maxTurns;
        }

        public float getStorageInKilograms() {
            return storageInKilograms;
        }

        public void setStorageInKilograms(float storageInKilograms) {
            this.storageInKilograms = storageInKilograms;
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
