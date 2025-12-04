package ge.tbc.testautomation.javaoop.runners;


import ge.tbc.testautomation.annotationsAndStreams.Analyzable;
import ge.tbc.testautomation.annotationsAndStreams.VariableNameAnnotation;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        List<Field> matchedFields = Arrays.stream(Analyzable.class.getDeclaredFields()).filter(
                field -> {
                    VariableNameAnnotation fieldAnnotation = field.getAnnotation(VariableNameAnnotation.class);
                    return fieldAnnotation != null &&
                            field.getName().equalsIgnoreCase(fieldAnnotation.name());
                }
        ).toList();

        List<Field> unmatchedFields = Arrays.stream(Analyzable.class.getDeclaredFields()).filter(
                field -> {
                    VariableNameAnnotation fieldAnnotation = field.getAnnotation(VariableNameAnnotation.class);
                    return fieldAnnotation == null ||
                            !field.getName().equalsIgnoreCase(fieldAnnotation.name());
                }
        ).toList();

        System.out.println(matchedFields);
        System.out.println(unmatchedFields);

        //unused fields
        String neverUsed = "HELLO";
        int myAge = 25;
        int[] salaries = {20000,123000,5000};


    }
}
