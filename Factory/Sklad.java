package Factory;

import java.util.Scanner;
public class Sklad {
    volatile static int amount = 0;
    static int n = 10;

    public static void main(String[] args) {
        new Manufacturer().start();
        new Consumer().start();
    }

    static class Consumer extends Thread{
        @Override
        public void run(){
            while(true){
                if(amount<n){
                    amount++;
                    System.out.println("Произведён продукт. В Наличие: " +amount);

                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }
    static class Manufacturer extends Thread{
        @Override
        public void run(){
            while(true){
                if(amount>0){
                    amount--;
                    System.out.println("Потреблён продукт. Остаток: " +amount);

                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}



