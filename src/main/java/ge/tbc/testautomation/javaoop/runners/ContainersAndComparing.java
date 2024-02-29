package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.RectangleCompare;

import java.util.*;

public class ContainersAndComparing {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("555-542-231");
        listOfStrings.add("555-887-987");
        listOfStrings.add("555-161-143");
        listOfStrings.add("555-189-6667");
        Iterator<String> iterator = listOfStrings.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Giorgi", "555-542-231");
        hashMap.put("Kosta", "555-887-987");
        hashMap.put("Sandro", "555-161-143");
        hashMap.put("Tornike", "555-189-6667");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (entry.getValue().contains("8")) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println("_____________");
        TreeSet<Circle> treeSet = new TreeSet<>();
        treeSet.add(new Circle(5));
        treeSet.add(new Circle(2));
        treeSet.add(new Circle(4));
        treeSet.add(new Circle(4));
        treeSet.add(new Circle(4));
        treeSet.add(new Circle(7));
        treeSet.add(new Circle(9));
        treeSet.add(new Circle(2));
        treeSet.add(new Circle(1));
        treeSet.add(new Circle(8));
        System.out.println(treeSet);
        System.out.println("_____________");
        HashSet<Circle> hashSet = new HashSet<>();
        hashSet.add(new Circle(5));
        hashSet.add(new Circle(2));
        hashSet.add(new Circle(4));
        hashSet.add(new Circle(4));
        hashSet.add(new Circle(4));
        hashSet.add(new Circle(7));
        hashSet.add(new Circle(9));
        hashSet.add(new Circle(2));
        hashSet.add(new Circle(1));
        hashSet.add(new Circle(8));
        System.out.println(hashSet);
        System.out.println("_____________");
        List<Rectangle> lst = new ArrayList<>();
        lst.add(new Rectangle(5,9));
        lst.add(new Rectangle(52,91));
        lst.add(new Rectangle(33,67));
        lst.add(new Rectangle(25,59));
        lst.add(new Rectangle(51,29));
        lst.add(new Rectangle(85,19));
        lst.sort(new RectangleCompare());
        System.out.println(lst);


        }

    }



