package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.util.RectangleReverseComparator;

import java.util.*;


public class ContainersAndComparing {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>(){
            {
                add("555-542-231");
                add("555-887-987");
                add("555-161-143");
                add("555-189-6667");
            }
        };

        for(String numb : numbers){
            System.out.println(numb);
        }

        HashMap<String,String> hashMap = new HashMap<>(){
            {
                put("giorgi",numbers.get(0));
                put("sandro",numbers.get(1));
                put("daviti",numbers.get(2));
                put("ani",numbers.get(3));

            }
        };

        for(String name : hashMap.keySet()){
            String value = hashMap.get(name);
            if(value.contains("8")){
                System.out.println(name);
            }

        }

        TreeSet<Circle> circlesTreeSet = new TreeSet<>();
        circlesTreeSet.add(new Circle(3));
        circlesTreeSet.add(new Circle(5));
        circlesTreeSet.add(new Circle(3));
        circlesTreeSet.add(new Circle(9));
        circlesTreeSet.add(new Circle(31));
        circlesTreeSet.add(new Circle(13));
        circlesTreeSet.add(new Circle(10));
        circlesTreeSet.add(new Circle(15));
        circlesTreeSet.add(new Circle(11));
        circlesTreeSet.add(new Circle(11));
        System.out.println(circlesTreeSet);

        HashSet<Circle> circleHashSet = new HashSet<>();
        circleHashSet.add(new Circle(6));
        circleHashSet.add(new Circle(2));
        circleHashSet.add(new Circle(3));
        circleHashSet.add(new Circle(6));
        circleHashSet.add(new Circle(5));
        circleHashSet.add(new Circle(8));
        circleHashSet.add(new Circle(11));
        circleHashSet.add(new Circle(33));
        circleHashSet.add(new Circle(22));
        circleHashSet.add(new Circle(4));
        System.out.println(circleHashSet);


        ArrayList<Rectangle> rectangleList = new ArrayList<>();
        rectangleList.add(new Rectangle(5,5));
        rectangleList.add(new Rectangle(3,3));
        rectangleList.add(new Rectangle(3,2));
        rectangleList.add(new Rectangle(3,4));
        rectangleList.add(new Rectangle(3,5));
        rectangleList.add(new Rectangle(3,6));

        rectangleList.sort(new RectangleReverseComparator());
        System.out.println(rectangleList);


    }

}
