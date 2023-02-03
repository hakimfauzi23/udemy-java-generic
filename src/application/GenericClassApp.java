package application;

import hanif.hakim.generic.MyData;
import hanif.hakim.generic.Pair;

public class GenericClassApp {
    public static void main(String[] args) {

        /** Auto know the data type from the object instance */
        MyData<String> stringMyData = new MyData<String>("Hanif");
        MyData<Integer> integerMyData = new MyData<Integer>(100);

        System.out.println(stringMyData.getData());
        System.out.println(integerMyData.getData());

        /** Generic Class that has two types parameters */
        Pair<String, String> stringPair = new Pair<String, String>("First String", "Second String");

        System.out.println(stringPair.getFirstData());
        System.out.println(stringPair.getSecondData());

    }
}
