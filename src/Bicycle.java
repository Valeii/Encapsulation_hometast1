/**
 * Created by Администратор on 01.10.2015.
 */
public class Bicycle {

    private static int weight;
    private static String brand;
    private static String colour;
    private static int NumberOfWheels;
    private static int speed;
    private static int time;


    public static int getSpeed() {
        return speed;
    }

    public static void setSpeed(int speed) {
        Bicycle.speed = speed;
    }

    public static int getTime() {
        return time;
    }

    public static void setTime(int time) {
        Bicycle.time = time;
    }



    public void CalculateDistance(int speed,int time){
        int d;
        d = speed*time;
        System.out.println("скорость транспорта =" + d + "м");

    }

    public static int getWeight() {
        return weight;
    }

    public static void setWeight(int weight) {
        Bicycle.weight = weight;
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        Bicycle.brand = brand;
    }

    public static String getColour() {
        return colour;
    }

    public static void setColour(String colour) {
        Bicycle.colour = colour;
    }

    public static int getNumberOfWheels() {
        return NumberOfWheels;
    }

    public static void setNumberOfWheels(int numberOfWheels) {
        NumberOfWheels = numberOfWheels;
    }
}
