package com.company;

public class Main {
    public static int add(int x, int y){
        return x + y;
    }
    public static int subtract(int x, int y){
        return x - y;
    }

    public static void main(String[] args) {
        int addition = add(7, 11);
        int addition1 = add(3, 2);
        int addition2 = add(6, 1);
        int addition3 = add(5, 4);
        int subtraction = subtract(9, 3);
        int subtraction1 = subtract(11, 2);
        int subtraction2 = subtract(6, 1);
        int subtraction3 = subtract(10, 4);
        int[] additionResults = {addition,addition1, addition2, addition3};
        int[] subtractionResults = {subtraction, subtraction1, subtraction2, subtraction3};
        int[] bothArray = {addition,addition1, addition2, addition3,
                subtraction, subtraction1, subtraction2, subtraction3};
        for (int additionResult : additionResults) {
            if (additionResult % 2 == 0)
                System.out.println("even " + additionResult);
            else
                System.out.println("odd " + additionResult);
        }
        System.out.println("\n");
        for (int subtractionResult : subtractionResults) {
            if (subtractionResult % 2 == 0)
                System.out.println("even " + subtractionResult);
            else
                System.out.println("odd " + subtractionResult);
        }
        System.out.println("\n");
        int cnt = 0;
        while (cnt < bothArray.length){
            if (bothArray[cnt] % 2 == 0)
                System.out.print("even " + bothArray[cnt] + " ");
            else
                System.out.print("odd " + bothArray[cnt] + " ");
            cnt++;
        }

    }
}
