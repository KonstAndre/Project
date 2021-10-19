package Expression;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LB4 {

    public static void main(String[] args) throws FileNotFoundException {

        File file1 = new File("Exp");

        Scanner scanner1 = new Scanner(file1);

        while (scanner1.hasNextLine()) {
            String s = scanner1.nextLine();
            Pattern p = Pattern.compile("\\d*\\d");
            Pattern p1 = Pattern.compile("[-+*/-]*[-+*/]");
            Matcher m = p.matcher(s);
            Matcher m1 = p1.matcher(s);

            ArrayList<Float> numbers = new ArrayList<>();
            ArrayList<String> sign = new ArrayList<>();


            while (m.find()) {
                    numbers.add(Float.parseFloat(m.group()));
            }

            while (m1.find()) {
                    sign.add(m1.group());
            }

            float a = numbers.get(0);
            float b = numbers.get(1);
            float res = 0;

                if ("+".equals(sign.get(0))) {
                    res = a + b;
                } else if ("-".equals(sign.get(0))) {
                    res = a - b;
                } else if ("*".equals(sign.get(0))) {
                    res = a * b;
                } else {
                    res = a / b;
                }
                System.out.println("Результат вычисления выражения: " + res);
            }
        }
    }

