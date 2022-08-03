public class SmartDevices {

    String model;
    String screenModel;
    double batteryCapacity;
    double price;

    public SmartDevices(){

    }

    public SmartDevices(String model, String screenModel, double batteryCapacity, double price){
        this.model = model;
        this.screenModel = screenModel;
        this.batteryCapacity = batteryCapacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "SmartDevices{" +
                "Model='" + model + '\'' +
                ", screenModel='" + screenModel + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", price=" + price +
                '}';
    }
}

