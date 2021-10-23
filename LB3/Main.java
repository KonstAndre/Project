package LB3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Print l1 = new LeftBracketDecorator(new QSwitch(10, "Твердотельный", "QSwitch", 100));
        Print l2 = new LeftBracketDecorator(new Pich(10, "Твердотельный", "Pich", 100));
        Print l3 = new LeftBracketDecorator(new Diode(10, "Волоконный", "Ламповая", 1500));
        Print l4 = new LeftBracketDecorator(new lamp(10, "Волоконный", "Диодная", 20000));
        Scanner s1 = new Scanner(System.in);
        int length = s1.nextInt();
        int[] array = new int[length];

        for (int i:array) {
            double rnd = Math.random();
            if (rnd <= 0.25) {
                array[i] = 1;;
            } else if (rnd > 0.25 && rnd <= 0.5) {
                array[i] = 2;
            } else if (rnd > 0.5 && rnd <= 0.75) {
                array[i] = 3;
            } else {
                array[i] = 4;
            }
        }

        for (int i=0; i< array.length; i++){
            if (array[i]==1){
                System.out.println(l1.print());
            } else if (array[i]==2){
                System.out.println(l2.print());
            } else if (array[i]==3){
                System.out.println(l3.print());
            } else {
                System.out.println(l4.print());
            }
        }
    }
}

class LeftBracketDecorator implements Print{
    Print laser;
    public LeftBracketDecorator(Print laser) {
        this.laser = laser;
    }
    public String print() {
        return "Иерархия лазеров: [" +laser.print() +"]";
    }
}
