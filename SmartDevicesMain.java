public class SmartDevicesMain {

    public static void main(String[] args) {

        SmartPhone google = new SmartPhone("Google Camera 64MP", 64);
        google.model = "Google Pixel 2XL";
        google.screenModel = "Google Led 1";
        google.batteryCapacity = 3520.0;
        google.price = 987.99;

        SmartWatch xiaomi = new SmartWatch("34cm Black", true);
        xiaomi.model = "Xiaomi Redmi watch 2";
        xiaomi.screenModel = "Xiaomi Led 1";
        xiaomi.batteryCapacity = 262.0;
        xiaomi.price = 79.99;

        System.out.println(google);
        System.out.println(xiaomi);
    }
}
