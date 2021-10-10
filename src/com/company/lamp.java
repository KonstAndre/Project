package com.company;

public class lamp extends Fiber{
    public lamp(int efficiency, String typeOfLaser, String gain, int pickPower){
        super(efficiency, typeOfLaser, gain, pickPower);
    }
    @Override
    public String description() {
        return super.description()  + ". Метод накачки: " +gain +" с максимальной пиковой мощностью - " +pickPower +" Вт.";
    }
}
