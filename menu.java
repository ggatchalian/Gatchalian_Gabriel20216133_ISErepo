import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ISE Assignment user input menu:");
        System.out.print("Choose Category (1 or 2): ");
        String menuOption = sc.nextLine();
        System.out.println(menuOption);
        if ("1".equals(menuOption)) {
            System.out.println("Category 1:");
            System.out.println("(a) Convert a string to upper case");
            System.out.println("(b) Convert a string to lower case");
            System.out.println("(c) Identify whether numeric values are in a string");
            System.out.println("(d) Identify whether a given string is a valid number");
            System.out.println("(e) Remove any numeric values in a string and convert to upper case");
            System.out.println("(f) Remove any numeric values in a string and convert to lower case");
            String cat1Option = sc.nextLine();

            if ("a".equals(cat1Option)){
                System.out.print("Input:");
                String input = sc.nextLine();
                System.out.println(Code.uppercaseConv(input));
            } else if ("b".equals(cat1Option)){
                System.out.print("Input:");
                String input = sc.nextLine();
                System.out.println(Code.lowercaseConv(input));
            } else if ("c".equals(cat1Option)){
                System.out.print("Input:");
                String input = sc.nextLine();
                System.out.println(Code.containsNumber(input));
            } else if ("d".equals(cat1Option)){
                System.out.print("Input:");
                String input = sc.nextLine();
                System.out.println(Code.validNumber(input));
            } else if ("e".equals(cat1Option)){
                System.out.print("Input:");
                String input = sc.nextLine();
                System.out.println(Code.removeNumberUppercase(input));
            } else if ("f".equals(cat1Option)){
                System.out.print("Input:");
                String input = sc.nextLine();
                System.out.println(Code.removeNumberLowercase(input));
            } else {
                System.out.println("ERROR: Input not valid");
            }

        } else if ("2".equals(menuOption)) {
            System.out.println("Category 2:");
            System.out.println("(a) Meter to Feet");
            System.out.println("(b) Feet to Meter");
            System.out.println("(c) Centimeter to Inch");
            System.out.println("(d) Inch to Centimeter");
            System.out.println("(e) Kilogram to Pound");
            System.out.println("(f) Pound to Kilogram");
            System.out.println("(g) Miligram to Ounce");
            System.out.println("(h) Ounce to Miligram");
            System.out.println("(i) Hour to Minutes");
            System.out.println("(j) Minutes to Hour");
            System.out.println("(k) Minute to Seconds");
            System.out.println("(l) Seconds to Minute");
            String cat2Option = sc.nextLine();

            if ("a".equals(cat2Option)){
                System.out.print("Input:");
                double input = sc.nextDouble();
                System.out.println(Code.convertMetertoFeet(input));
            } else if ("b".equals(cat2Option)){
                System.out.print("Input:");
                double input = sc.nextDouble();
                System.out.println(Code.convertFeettoMeter(input));
            } else if ("c".equals(cat2Option)){
                System.out.print("Input:");
                double input = sc.nextDouble();
                System.out.println(Code.convertCentimetertoInch(input));
            } else if ("d".equals(cat2Option)){
                System.out.print("Input:");
                double input = sc.nextDouble();
                System.out.println(Code.convertInchtoCentimeter(input));
            } else if ("e".equals(cat2Option)){
                System.out.print("Input:");
                double input = sc.nextDouble();
                System.out.println(Code.convertKilogramtoPound(input));
            } else if ("f".equals(cat2Option)){
                System.out.print("Input:");
                double input = sc.nextDouble();
                System.out.println(Code.convertPoundtoKilogram(input));
            } else if ("g".equals(cat2Option)){
                System.out.print("Input:");
                double input = sc.nextDouble();
                System.out.println(Code.convertMiligramtoOunce(input));
            } else if ("h".equals(cat2Option)){
                System.out.print("Input:");
                double input = sc.nextDouble();
                System.out.println(Code.convertOuncetoMiligram(input));
            } else if ("i".equals(cat2Option)){
                System.out.print("Input:");
                double input = sc.nextDouble();
                System.out.println(Code.convertHourtoMinute(input));
            } else if ("j".equals(cat2Option)){
                System.out.print("Input:");
                double input = sc.nextDouble();
                System.out.println(Code.convertMinutetoHour(input));
            } else if ("k".equals(cat2Option)){
                System.out.print("Input:");
                double input = sc.nextDouble();
                System.out.println(Code.convertMinutetoSecond(input));
            } else if ("l".equals(cat2Option)){
                System.out.print("Input:");
                double input = sc.nextDouble();
                System.out.println(Code.convertSecondtoMinute(input));
            } else {
                System.out.println("ERROR: Input not valid");
            }
            
            
        } else {
            System.out.println("ERROR: Input not valid");
        }
    }

}