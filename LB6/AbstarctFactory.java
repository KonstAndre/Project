package LB6;

import java.util.Scanner;

public class AbstarctFactory {
    public static void main(String[] args){
        System.out.println("Введите тип лазера: ");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
LaserFactory factory = getFactoryByType(type);
Pump p = factory.getPump();
Substance s = factory.getSubstance();

System.out.println("Тип лазера - "+type);
p.efficiency();
p.method();
s.impurity();
s.substance();
    }
    private static LaserFactory getFactoryByType(String lang){
        switch(lang){
            case "Solid":
                return new SolidFactory();
            case "Fiber":
                return new FiberFactory();
            default:
                throw new RuntimeException("Unsupported laser type: "+lang);
        }
    }
}
