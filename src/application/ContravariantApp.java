package application;

import hanif.hakim.generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("Hakim");
        objectMyData.setData(1000);

        MyData<? super String> myData = objectMyData;

        process(objectMyData);

        System.out.println(objectMyData.getData());
    }

    /**
     *
     * Contravariant is both can write or read from subclass or superclass
     */
    public static void process(MyData<? super String> myData) {

        // even Contravariant can do Read or Get Data
        // But it's must be aware of the superclass and subclass
        // So difference type problem / failed conversion type data is can be avoided.

//        String  value =(String) myData.getData(); // Will Cause an error
        Object value = myData.getData();
        System.out.println("Process Params : " + value);

        // To Write or Set data is safety
        myData.setData("Hanif Fauzi Hakim");
    }
}
