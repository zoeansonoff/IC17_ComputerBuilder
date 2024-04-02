public class Computer {
    private CPU cpu;
    private RAM ram;
    private Storage storage;
    private VideoCard videoCard;
    //Nested inner classes
    class CPU {
        private String manufacturer;
        private String core;
        private double speed;
        private double price;

        //constructor
        public CPU(String manufacturer, String core, double speed, double price) {
            this.manufacturer = manufacturer;
            this.core = core;
            this.speed = speed;
            this.price = price;
            //initialize cpu field of computer class
            Computer.this.cpu = this;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getCore() {
            return core;
        }

        public void setCore(String core) {
            this.core = core;
        }

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "CPU{" +
                    "manufacturer='" + manufacturer + '\'' +
                    ", core='" + core + '\'' +
                    ", speed=" + speed +
                    ", price=" + price +
                    '}';
        }

    }
    class RAM {
            private double price;
            private String manufacturer;
            private double capacity;
            private double speed;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public double getCapacity() {
            return capacity;
        }

        public void setCapacity(double capacity) {
            this.capacity = capacity;
        }

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        @Override
        public String toString() {
            return "RAM{" +
                    "price=" + price +
                    ", manufacturer='" + manufacturer + '\'' +
                    ", capacity=" + capacity +
                    ", speed=" + speed +
                    '}';
        }
    }
    class Storage {
        private double price;
        private String manufacturer;
        private double capacity;
        private double type;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public double getCapacity() {
            return capacity;
        }

        public void setCapacity(double capacity) {
            this.capacity = capacity;
        }

        public double getType() {
            return type;
        }

        public void setType(double type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Storage{" +
                    "price=" + price +
                    ", manufacturer='" + manufacturer + '\'' +
                    ", capacity=" + capacity +
                    ", type=" + type +
                    '}';
        }
    }
    class VideoCard {
        private double price;
        private String manufacturer;
        private double capacity;
        private String maxRes;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public double getCapacity() {
            return capacity;
        }

        public void setCapacity(double capacity) {
            this.capacity = capacity;
        }

        public String getMaxRes() {
            return maxRes;
        }

        public void setMaxRes(String maxRes) {
            this.maxRes = maxRes;
        }

        @Override
        public String toString() {
            return "VideoCard{" +
                    "price=" + price +
                    ", manufacturer='" + manufacturer + '\'' +
                    ", capacity=" + capacity +
                    ", maxRes='" + maxRes + '\'' +
                    '}';
        }
    }
}
