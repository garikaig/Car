package com.ggwaradzimba;

class Car {
    private String name;
    private boolean engine;
    private int cyclinders;
    private int wheels;
    private int doors;

    public Car(String name, int cyclinders) {
        this.name = name;
        this.cyclinders = cyclinders;
        this.wheels = 4;
        this.doors = 5;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCyclinders() {
        return cyclinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void startEngine() {
        System.out.println("Engine starting.....");
    }

    public void accelerate() {
        System.out.println("Car accelerating");
    }

    public void brake() {
        System.out.println("Car breaking");
    }
}

class Mercedes extends Car {
    private String model;
    public Mercedes(String model) {
        super("Mercedes Benz", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Mercedes Benz engine is now starting....");
    }

    @Override
    public void accelerate() {
        System.out.println("Mercedes Benz is accelerating ...");
    }

    @Override
    public void brake() {
        System.out.println("Mercedes Benz is braking...");
    }
}

class Toyota extends Car {
    private String model;
    public Toyota(String model) {
        super("Toyota Landcruiuser", 8);
    }

    // deliberately left out methods in this class to demonstrate polymorphism
}

class BMW extends Car {
    private String model;
    public BMW(String model) {
        super("BMW X5", 8);
    }

    public void startEngine() {
        System.out.println("BMW X5 engine is now starting....");
    }

    public void accelerate() {
        System.out.println("BMW X5 is accelerating ...");
    }

    public void brake() {
        System.out.println("BMW X5 is braking...");
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Base",4);
        car.startEngine();
        car.accelerate();
        car.brake();

        Mercedes mercedes = new Mercedes("C-Class");
        mercedes.startEngine();
        mercedes.accelerate();
        mercedes.brake();

        Toyota toyota = new Toyota("Landcruiser VX 200");
        // remember in this class, the methods of the base class were not overriden
        toyota.startEngine();
        toyota.accelerate();
        toyota.brake();

        BMW bmw = new BMW("X5 50DM");
        bmw.startEngine();
        bmw.accelerate();
        bmw.brake();

    }
}
