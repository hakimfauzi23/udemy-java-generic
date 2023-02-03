package application;

import util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Hanif", "Fauzi","Hakim"};
        Integer[] numbers = {1,2,3,4,5};

        System.out.println(
                ArrayHelper.<String>count(names)
        );

        System.out.println(
                ArrayHelper.<Integer>count(numbers)
        );
    }
}
