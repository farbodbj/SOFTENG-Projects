package model;

public abstract class Person {
    final private String Name;

    public Person(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }
}
