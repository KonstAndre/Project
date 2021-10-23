package LB5;

public class Fiber extends Laser {
    String gain;
    int pickPower;
    public Fiber(int efficiency, String typeOfLaser, String gain, int pickPower){
        super(efficiency, typeOfLaser);
        this.gain = gain;
        this.pickPower = pickPower;
    }
}
