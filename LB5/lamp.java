package LB5;

public class lamp extends Fiber{
    public lamp(int efficiency, String typeOfLaser, String gain, int pickPower){
        super(efficiency, typeOfLaser, gain, pickPower);
    }
    @Override
    public String print() {
        return super.print()  + ". Метод накачки: " +gain +" с максимальной пиковой мощностью - " +pickPower +" Вт.";
    }
}
