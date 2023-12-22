package ex06;

class Employee2 {
    public int baseSalary = 300000; // 기본급

    int getSalary() {
        return baseSalary;
    }
}

class Manager extends Employee2 {
    @Override
    int getSalary() {
        return (baseSalary + 200000);
    }
}

class Programmer extends Employee2 {
    @Override
    int getSalary() {
        return (baseSalary + 300000);
    }
}

public class Employee2Test {
    public static void main(String[] args) {
        Manager obj1 = new Manager();
        System.out.println("관리자 월급: " + obj1.getSalary());

        Programmer obj2 = new Programmer();
        System.out.println("프로그래머 월급: " + obj2.getSalary());
    }
}
