package LB3;

public class Pich extends Solid {

    public Pich(int efficiency, String typeOfLaser, String mode, int energy){
        super(efficiency, typeOfLaser, mode, energy);
    }
    @Override
    public String print() {
        return super.print()  + ". Режим работы лазера: " +getMode() +" с максимальной энергией в пике - " +getEnergy() +" Дж.";
    }
}
