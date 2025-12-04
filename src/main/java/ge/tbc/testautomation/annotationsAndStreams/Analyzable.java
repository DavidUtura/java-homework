package ge.tbc.testautomation.annotationsAndStreams;

import java.util.ArrayList;
import java.util.Map;

public class Analyzable {

    @VariableNameAnnotation(name = "Score")
    private int score;

    @VariableNameAnnotation(name = "Name")
    private String name;

    @VariableNameAnnotation
    private double radius;

    @VariableNameAnnotation(name = "Mass")
    private double height;

    @VariableNameAnnotation(name = "Grades")
    private int[] grades;

    @VariableNameAnnotation(name = "ASDASD")
    private ArrayList<String> emails;

    @VariableNameAnnotation(name = "Stats")
    private Map<String, Integer> stats;

    @VariableNameAnnotation
    private boolean isBeautiful;

    @VariableNameAnnotation(name = "Count")
    private short count;

    @VariableNameAnnotation(name = "Temperature")
    private float temperature;


}
