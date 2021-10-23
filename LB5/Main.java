package LB5;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите тип интересующего вас лазера: ");
        Scanner s1 = new Scanner(System.in);
        String laser = s1.nextLine();
        LaserMaker maker = getMakerByName(laser);
        Print l = maker.createLaser();
        System.out.println(l.print());
    }

    public static LaserMaker getMakerByName(String maker) {
        if (maker.equals("QSwitch")) {
            return new QSwitchLaserMaker();
        } else if (maker.equals("Pich")) {
            return new PichLaserMaker();
        } else if (maker.equals("Diode")) {
            return new DiodeLaserMaker();
        } else if (maker.equals("lamp")) {
            return new LampLaserMaker();
        }
        throw new RuntimeException("Не производится "+maker);
    }
}


class QSwitchLaserMaker implements LaserMaker{
    public Print createLaser(){
        return new QSwitch(10, "Твердотельный", "QSwitch", 100);
    }
}
class PichLaserMaker implements LaserMaker{
    public Print createLaser(){
        return new Pich(5, "Твердотельный", "Pich", 10);
    }
}

class  DiodeLaserMaker implements LaserMaker{
    public Print createLaser(){
        return new Diode(50, "Волоконный", "Ламповая", 20000);
    }
}
class  LampLaserMaker implements LaserMaker{
    public Print createLaser(){
        return new lamp(30, "Волоконный", "Диодная", 1500);
    }
}

