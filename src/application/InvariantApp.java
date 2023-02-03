package application;

import hanif.hakim.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Hanif");

        // Will Cause Error, cause The params should be Object.
//        doIt(stringMyData);

        // Will Cause Error, cause The params should be Object.
//        MyData<Object> objectMyData = stringMyData;
    }

    public static void doIt(MyData<Object> objectMyData) {
        // Do Whatever
    }
}
