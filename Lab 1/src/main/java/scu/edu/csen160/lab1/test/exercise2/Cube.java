package scu.edu.csen160.lab1.test.exercise2;

public class Cube {
    private double height; // height of the cube

    public Cube(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.height * this.height * this.height; // finding the volume using the formula V = h^3
    }
}
