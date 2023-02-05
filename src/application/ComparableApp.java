package application;

import util.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Hanif", "Indonesia"),
                new Person("Fauzi", "Indonesia"),
                new Person("Hakim", "Indonesia")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));

    }
}
