package application;

import hanif.hakim.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Hanif");
        process(stringMyData);
    }

    // Covariant only read-only
    // So it's only can called getter.
    public static void process(MyData<? extends Object> myData){
        System.out.println(myData.getData());

//        myData.setData("test"); // this is will cause error.
    }
}
