package scu.edu.csen160.lab1.test.exercise1;

public class Puppy {
    private String name;
    private int age;

    public Puppy(){
        this.name = "Name not given yet"; // default name
        this.age = 1; // default age
    }

    public Puppy(String name, int age){ // parameterized constructor
        this.name = name;
        this.age = age;
    }

    public String getName() { // getter for name
        return this.name;
    }

    public int getAge() { // getter for age
        return this.age;
    }

    public int getAgeDays() { // method to get age in days
        return this.age*365;
    }
}
