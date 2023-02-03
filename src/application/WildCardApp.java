package application;

import hanif.hakim.generic.MyData;

public class WildCardApp {

    /**
     *
     * Wildcard is when generic parameter type on object is not so important to know
     * So whatever the type of data can be print with this wildcard way.
     */
    public static void main(String[] args) {
        print(new MyData<Integer>(100));
        print(new MyData<String>("Test 1 2 3"));
        print(new MyData<MultipleConstraintApp>(new MultipleConstraintApp()));

    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
