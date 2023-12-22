package ex06;

class Person {
    String name;

    public Person() {
        System.out.println("Person");
    }

    public Person(String name) {
        System.out.println("Person name");
        this.name = name;
    }
}

class Employee extends Person {
    String id;

    public Employee() {
        super(); // 이건 안 적어줘도 되나? 아래에 생성자를 만들 때는 자동으로 수퍼가 적히는데 이건 아니여.
        System.out.println("Employee");
    }

    public Employee(String name) {
        super(name);
        System.out.println("Employee name");

    }

    public Employee(String name, String id) {
        super(name);
        this.id = id;
        System.out.println("Employee name id");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee("Kim", "20210001");
        System.out.println(e);
    }
}
