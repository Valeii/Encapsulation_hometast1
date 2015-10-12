/**
 * Created by Администратор on 01.10.2015.
 */
public class App {
    public static void main(String[] args) {
        Motorcycle awp = new Motorcycle();
        awp.setBrand("suzuki");
        awp.setColour("orange");
        awp.setNumberOfWheels(2);
        awp.setSpeed(150);
        awp.setWeight(280);
        awp.setActivity(true);
        awp.setHorsepower(120);
        awp.setTime(8);
        awp.CalculateDistance(56,35);

    }
}
