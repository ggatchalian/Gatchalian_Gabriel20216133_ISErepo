import java.io.*;
import java.util.*;

public class Code
{
    //Category 1

    public static String uppercaseConv(String input)
    {
        String result = input.toUpperCase();
        return result;
    }

    public static String lowercaseConv(String input)
    {
        String result = input.toLowerCase();
        return result;
    }

    public static Boolean containsNumber(String input)
    {
        String array[] = input.split("");

        for(int x=0;x<input.length();x++) {
            Boolean test = Character.isDigit(input.charAt(x));
            if (test) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    public static Boolean validNumber(String input)
    {
        try {
            Integer.parseInt(input); 
        } catch(NumberFormatException e) { 
            return false; 
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }

    public static String removeNumberUppercase(String input)
    {
        String array[] = input.split("");
        String noNumber = "";

        for(int x=0;x<input.length();x++) {
            Boolean test = Character.isDigit(input.charAt(x));
            if (test) {
                continue;
            } else {
                noNumber = noNumber.concat(array[x]);
            }
        }
        String result = uppercaseConv(noNumber);
        return result;
    }

    public static String removeNumberLowercase(String input)
    {
        String array[] = input.split("");
        String noNumber = "";

        for(int x=0;x<input.length();x++) {
            Boolean test = Character.isDigit(input.charAt(x));
            if (test) {
                continue;
            } else {
                noNumber = noNumber.concat(array[x]);
            }
        }
        String result = lowercaseConv(noNumber);
        return result;
    }

    //Category 2
    
    public static double convertMetertoFeet(double input)
    {
        double result;
        if(input>0) {
            result = input*3.280839895;
        } else {
            result = 0;
        }
        return result;
    }

    public static double convertFeettoMeter(double input)
    {
        double result;
        if(input>0) {
            result = input/3.280839895;
        } else {
            result = 0;
        }
        return result;
    }

    public static double convertCentimetertoInch(double input)
    {
        double result;
        if(input>0) {
            result = input/2.54;
        } else {
            result = 0;
        }
        return result;
    }

    public static double convertInchtoCentimeter(double input)
    {
        double result;
        if(input>0) {
            result = input*2.54;
        } else {
            result = 0;
        }
        return result;
    }

    public static double convertKilogramtoPound(double input)
    {
        double result;
        if(input>0) {
            result = input/0.45359237;
        } else {
            result = 0;
        }
        return result;
    }

    public static double convertPoundtoKilogram(double input)
    {
        double result;
        if(input>0) {
            result = input*0.45359237;
        } else {
            result = 0;
        }
        return result;
    }

    public static double convertMiligramtoOunce(double input)
    {
        double result;
        if(input>0) {
            result = input/28350;
        } else {
            result = 0;
        }
        return result;
    }

    public static double convertOuncetoMiligram(double input)
    {
        double result;
        if(input>0) {
            result = input*28350;
        } else {
            result = 0;
        }
        return result;
    }

    public static double convertHourtoMinute(double input)
    {
        double result;
        if(input>0) {
            result = input*60;
        } else {
            result = 0;
        }
        return result;
    }

    public static double convertMinutetoHour(double input)
    {
        double result;
        if(input>0) {
            result = input/60;
        } else {
            result = 0;
        }
        return result;
    }

    public static double convertMinutetoSecond(double input)
    {
        double result;
        if(input>0) {
            result = input*60;
        } else {
            result = 0;
        }
        return result;
    }

    public static double convertSecondtoMinute(double input)
    {
        double result;
        if(input>0) {
            result = input/60;
        } else {
            result = 0;
        }
        return result;
    }

    // File reader / writter

    public static Boolean fileHourtoMinute(String input, String output)
    {
        boolean success = true;
        String valueString = "";
        try {
            Scanner sc = new Scanner(new File(input));
            valueString = sc.nextLine();
        } catch(IOException e) {
            success = false;
        }

        String array[]=valueString.split(" ");

        try(PrintWriter writer = new PrintWriter(output)) {  
            for(int x=0;x<array.length;x++) {
                double valueNumber = Double.parseDouble(array[x]);
                writer.println(convertHourtoMinute(valueNumber));
            }
        } catch(IOException e) {
                success = false;
            }
        
        return success;
    }

    public static Boolean fileMinutetoHour(String input, String output)
    {
        boolean success = true;
        String valueString = "";
        try {
            Scanner sc = new Scanner(new File(input));
            valueString = sc.nextLine();
        } catch(IOException e) {
            success = false;
        }

        String array[]=valueString.split(" ");

        try(PrintWriter writer = new PrintWriter(output)) {  
            for(int x=0;x<array.length;x++) {
                double valueNumber = Double.parseDouble(array[x]);
                writer.println(convertMinutetoHour(valueNumber));
            }
        } catch(IOException e) {
                success = false;
            }
        
        return success;
    }

    public static Boolean fileMinutetoSecond(String input, String output)
    {
        boolean success = true;
        String valueString = "";
        try {
            Scanner sc = new Scanner(new File(input));
            valueString = sc.nextLine();
        } catch(IOException e) {
            success = false;
        }

        String array[]=valueString.split(" ");

        try(PrintWriter writer = new PrintWriter(output)) {  
            for(int x=0;x<array.length;x++) {
                double valueNumber = Double.parseDouble(array[x]);
                writer.println(convertMinutetoSecond(valueNumber));
            }
        } catch(IOException e) {
                success = false;
            }
        
        return success;
    }

    public static Boolean fileSecondtoMinute(String input, String output)
    {
        boolean success = true;
        String valueString = "";
        try {
            Scanner sc = new Scanner(new File(input));
            valueString = sc.nextLine();
        } catch(IOException e) {
            success = false;
        }

        String array[]=valueString.split(" ");

        try(PrintWriter writer = new PrintWriter(output)) {  
            for(int x=0;x<array.length;x++) {
                double valueNumber = Double.parseDouble(array[x]);
                writer.println(convertSecondtoMinute(valueNumber));
            }
        } catch(IOException e) {
                success = false;
            }
        
        return success;
    }
}
