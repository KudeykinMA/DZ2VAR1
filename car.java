
///Kudeykin Maxim Alexandrovich RIBO-04-21
package com.mycompany.car;

import java.util.Scanner;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int speed;

    public Car(String brand, String model, String color, int speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public void accelerate(int amount) {
        this.speed += amount;
    }

    public void brake(int amount) {
        this.speed -= amount;
    }
    
    public void printDetails() {
        System.out.println(brand + ", " + model + ", " + color + ", " + speed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter car model: ");
        String model = scanner.nextLine();

        System.out.print("Enter car color: ");
        String color = scanner.nextLine();

        System.out.print("Enter car speed: ");
        int speed = scanner.nextInt();
        
        System.out.print("Enter car Type: 0 - standart 1 - Elec 2 - Gas");
        int type = scanner.nextInt();
        
        Car car = new Car(brand, model, color, speed);
        
        if (type < 1) { 
        car.printDetails();}
        if (type == 2) { 
        ;}
}


class ElectricCar extends Car {
    private int batteryLevel; 


    public ElectricCar(String brand, String model, String color, int speed, int batteryLevel) {
        super(brand, model, color, speed);
        this.batteryLevel = batteryLevel;
       
        
    }
}

class GasolineCar extends Car {
    private int fuelLevel;

    public GasolineCar(String brand, String model, String color, int speed, int fuelLevel) {
        super(brand, model, color, speed);
        this.fuelLevel = fuelLevel;}
}
}
