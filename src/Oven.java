import java.lang.reflect.Field;

public class Oven extends Device

{


        private float length = 50;
        private float height = 30;
        private float depth = 40;
        private String companyName = "NEFF";
        private String deviceName = "C17FS22G0";
        private String deviceType = "untitled.src.Oven";
        private float energyConsumption = 100;


        private boolean hasGrill = true;
        private boolean hasHotPlates = false;
        private float maxTemperature = 300;
        private float weight = 30;
        private char energyClass = 'A';

        public Oven()
        {
            this.PowerOn();
            homeappliancesstore.deviceCounter ++;
        }

        public Oven(String companyName)
        {
            homeappliancesstore.deviceCounter ++;
        }

        void periodicMaintenance()
        {

        }

        /**
         * Prints this class's fields.
         */
        void PrintDetails()
        {
            Field[] fields = Oven.class.getDeclaredFields();

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

        public boolean isHasGrill() {
            return hasGrill;
        }

        public void setHasGrill(boolean hasGrill) {
            this.hasGrill = hasGrill;
        }

        public boolean isHasHotPlates() {
            return hasHotPlates;
        }

        public void setHasHotPlates(boolean hasHotPlates) {
            this.hasHotPlates = hasHotPlates;
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
