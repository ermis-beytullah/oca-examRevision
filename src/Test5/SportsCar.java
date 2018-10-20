package Test5;

class Car {

    public int gearRatio = 8;
    public String accelerate() {

        return "Accelerate : Car";
    }
}

public class SportsCar extends Car {

    public int gearRatio = 9;
    public String accelerate() {

        return "Accelerate : SportCar";
    }

    public static void main(String[] args) {

        Car car1 = new SportsCar();
        System.out.println(car1.gearRatio + " " + car1.accelerate());

        Car car2 = new Car();
        System.out.println(car2.gearRatio + " " + car2.accelerate());

        SportsCar sportsCar = new SportsCar();
        System.out.println(sportsCar.gearRatio + " " + sportsCar.accelerate());
    }
}
