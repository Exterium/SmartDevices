public class SmartPhone extends SmartDevices{


    String cameraModel;
    double storageCapacity;
    public SmartPhone(){

    }

    public SmartPhone(String cameraModel, double storageCapacity){
        this.cameraModel = cameraModel;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "Model='" + model + '\'' +
                ", cameraModel='" + cameraModel + '\'' +
                ", storageCapacity=" + storageCapacity +
                ", screenModel='" + screenModel + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", price=" + price +
                '}';
    }
}
