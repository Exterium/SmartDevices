public class SmartWatch extends SmartDevices{

    String watchbandModel;
    boolean bloodOxygenMeasurement;

    public SmartWatch() {

    }

    public SmartWatch(String watchbandModel, boolean bloodOxygenMeasurement) {
        this.watchbandModel = watchbandModel;
        this.bloodOxygenMeasurement = bloodOxygenMeasurement;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "Model='" + model + '\'' +
                ", watchbandModel='" + watchbandModel + '\'' +
                ", bloodOxygenMeasurement=" + bloodOxygenMeasurement +
                ", screenModel='" + screenModel + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", price=" + price +
                '}';
    }
}
