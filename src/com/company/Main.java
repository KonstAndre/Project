package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Laser l1 = new QSwitch(10, "Твердотельный", "QSwitch", 100);
        Laser l2 = new Pich(10, "Твердотельный", "Pich", 100);
        Laser l3 = new Diode(10, "Волоконный", "Ламповая", 1500);
        Laser l4 = new lamp(10, "Волоконный", "Диодная", 20000);
        Scanner s1 = new Scanner(System.in);
        int length = s1.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
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
                System.out.println(l1.description());
            } else if (array[i]==2){
                System.out.println(l2.description());
            } else if (array[i]==3){
                System.out.println(l3.description());
            } else {
                System.out.println(l4.description());
            }
        }
    }
}
