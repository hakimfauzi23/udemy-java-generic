package application;

import hanif.hakim.generic.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {

        /**
         * When program is compiled to binary file
         * The Generic Information will be changed and lost
         * So if the data that has <String> cannot be converted to <Integer>
         * Must be carefully, because this error don't detected while compiling.
         */

        MyData myData = new MyData("Hakim");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();

    }
}
