package ex06;

class Car {
    int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

class ElectricCar extends Car {
    int battery;

    public void charge(int amount) {
        battery += amount;
    }
}

public class ElectricCarTest {
    public static void main(String[] args) {
        ElectricCar obj = new ElectricCar();
        obj.speed = 10;
        System.out.println(obj.speed);
        obj.setSpeed(60);
        System.out.println(obj.speed);
        obj.charge(10);
        System.out.println(obj.battery);


    }
}
