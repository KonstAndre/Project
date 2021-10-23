package LB4;

public class Solid extends Laser{
    String mode;
    int energy;
    public Solid(int efficiency, String typeOfLaser, String mode, int energy){
        super(efficiency, typeOfLaser);
        this.mode = mode;
        this.energy = energy;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

}
