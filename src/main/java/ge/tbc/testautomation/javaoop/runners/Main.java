package ge.tbc.testautomation.javaoop.runners;


import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.javaoop.figures.Circle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        try{
            Circle circle = new Circle(-3.7);
        }catch (RadiusException e){
            System.out.println(e.getMessage());
        }

        try {
            Circle circle1 = new Circle(2.1);
            Circle circle2 = new Circle(2.4);
            Circle circle3 = new Circle(2.5);
            Circle circle4 = new Circle(2.6);
            Circle circle5 = new Circle(2.7);

        }catch (LimitException e){
            System.out.println(e.getMessage());
        }

        String text = "Test Automation Bootcamp 12, 2025";
        System.out.println(text.substring(text.indexOf("Automation"),
                text.indexOf("Automation") + "Automation".length()));

        String[] textWords =  text.split(" ");
        for(String word : textWords){
            System.out.println(word);
        }

        String replacedText = text.replace(" ","-");
        System.out.println(replacedText);

        String[] phoneNumbers = {
                "555-32-54-57",
                "595-66-66-66",
                "592-11-22-332",
                "599-99-88-77",
                "123-45-67-89",
                "505-123-45",
                "555-1234567"
        };

        for(String phoneNumber : phoneNumbers){
            System.out.println(phoneNumber + " : " +  phoneNumberValidation(phoneNumber));
        }
    }
    private static boolean phoneNumberValidation(String phoneNumber){

        String cleanPhoneNumber = phoneNumber.replaceAll("-","");
        String phoneNumberPattern = "^(555|595|592|599)\\d{6}$";
        Pattern p  = Pattern.compile(phoneNumberPattern);
        Matcher m = p.matcher(cleanPhoneNumber);
        return m.matches();
    }
}
