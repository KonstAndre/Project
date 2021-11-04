package LB7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class LB7 {
    public static void main(String[] args) {
        Room type1 = new Room( 1,"living", 10);
        Room type2 = new Room( 2,"working", 25);
        Room type3 = new Room( 3,"rest", 15);

        Room[] floor1 = new Room[9];
        ArrayList<Room> floor2 = new ArrayList();
        ArrayList<Room> floor3 = new ArrayList();

for(int i = 0; i<floor1.length; i++){
    switch (1+(int)Math.round(Math.random()*2)) {
        case 1:
            floor1[i] = type1;
            break;
        case 2:
            floor1[i] = type2;
            break;
        case 3:
            floor1[i] = type3;
            break;
    }
}

for (int i =0; i<3;i++){
    switch (1+(int)Math.round(Math.random()*2)) {
        case 1:
            floor2.add(type1);
            break;
        case 2:
            floor2.add(type2);
            break;
        case 3:
            floor2.add(type3);
            break;
    }
}

        for (int i =0; i<3; i++){
            switch (1+(int)Math.round(Math.random()*2)) {
                case 1:
                    floor3.add(type1);
                    break;
                case 2:
                    floor3.add(type2);
                    break;
                case 3:
                    floor3.add(type3);
                    break;
            }
        }

        int fullSquare = 0;
        int[] floorSquare = new int[3];
        int[] floorType1 = new int[3];
        int[] floorType2 = new int[3];
        int[] floorType3 = new int[3];
        int fullSquareType1=0;
        int fullSquareType2=0;
        int fullSquareType3=0;

        for(Iterator<Room> iterator = Arrays.stream(floor1).iterator(); iterator.hasNext();){
            floorSquare[0] += iterator.next().getSquare();
            if(iterator.next().getType().equalsIgnoreCase("living")){
                floorType1[0] += iterator.next().getSquare();
            }
            else if (iterator.next().getType().equalsIgnoreCase("working")) {
                floorType2[0] += iterator.next().getSquare();
            } else {
                floorType3[0] += iterator.next().getSquare();
            }
        }

        for(Iterator<Room> iterator = floor2.iterator(); iterator.hasNext();){
            floorSquare[1] += iterator.next().getSquare();
            if(iterator.next().getType().equalsIgnoreCase("living")){
                floorType1[1] += iterator.next().getSquare();
            }
            else if (iterator.next().getType().equalsIgnoreCase("working")){
                floorType2[1] += iterator.next().getSquare();
            }
            else {
                floorType3[1] += iterator.next().getSquare();
            }
        }

        for(Iterator<Room> iterator = floor3.iterator(); iterator.hasNext();){
            floorSquare[2] += iterator.next().getSquare();
            if(iterator.next().getType().equalsIgnoreCase("living")){
                floorType1[2] += iterator.next().getSquare();
            }
            else if (iterator.next().getType().equalsIgnoreCase("working")){
                floorType2[2] += iterator.next().getSquare();
            }
            else {
                floorType3[2] += iterator.next().getSquare();
            }
        }

        for(int i = 0; i<3; i++){
            fullSquare += floorSquare[i];
            fullSquareType1 += floorType1[i];
            fullSquareType2 += floorType2[i];
            fullSquareType3 += floorType3[i];
        }

        System.out.println("Общая площадь здания: " +fullSquare);
        System.out.println("Общая площадь жилых помещений: " +fullSquareType1);
        System.out.println("Общая площадь рабочих помещений: " +fullSquareType2);
        System.out.println("Общая площадь помещений для отдыха: " +fullSquareType3);

    }
}


