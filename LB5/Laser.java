package LB5;

public abstract class Laser implements Print{

    private int efficiency;
    private String typeOfLaser;

    public Laser( int efficiency, String typeOfLaser)
    {
        this.typeOfLaser = typeOfLaser;
        this.efficiency = efficiency;
    }

    public String getTypeOfLaser() {
        return typeOfLaser;
    }

    public void setTypeOfLaser(String typeOfLaser) {
        this.typeOfLaser = typeOfLaser;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

    public String print(){
        return "Тип лазера: " +typeOfLaser +" с максимальным КПД от розетки - " +efficiency;
    }

}
