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
        super(); // super();은 형식적으로라도 해주는 것이 가독성이 올라가고 유지보수할 때 좋음
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
