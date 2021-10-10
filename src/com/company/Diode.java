package com.company;

public class Diode extends Fiber{
    public Diode(int efficiency, String typeOfLaser, String gain, int pickPower){
        super(efficiency, typeOfLaser, gain, pickPower);
    }
    @Override
    public String description() {
        return super.description()  + ". Метод накачки: " +gain +" с максимальной пиковой мощностью - " +pickPower +" Вт.";
    }
}
