/**
 * Created by Администратор on 01.10.2015.
 */
public class Motorcycle extends Bicycle {

    private static String frame;
    private static boolean activity;
    private static int horsepower;

    public Motorcycle(int weight, String brand, String colour, int NumberOfWheels, int speed, int time) {
        super(weight, brand, colour, NumberOfWheels, speed, time);
    }

    public static String getFrame() {

        return frame;
    }

    public static void setFrame(String frame) {
        Motorcycle.frame = frame;
    }

    public static boolean isActivity() {
        return activity;
    }

    public static void setActivity(boolean activity) {
        Motorcycle.activity = activity;
    }

    public static int getHorsepower() {
        return horsepower;
    }

    public static void setHorsepower(int horsepower) {
        Motorcycle.horsepower = horsepower;
    }
}
