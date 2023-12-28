package ex07.miniProject;

public class MyQueue implements Queue {
    public static void main(String[] args) {
        Queue q1 = new MyQueue();
        q1.isEmpty();
        q1.enqueue("red");
        q1.enqueue("orange");
        q1.enqueue("yellow");
        q1.enqueue("green");
        q1.enqueue("blue");
        q1.enqueue("navy");
        q1.enqueue("purple");

        q1.dequeue();
        System.out.println(qArr.size());
        q1.dequeue();
        q1.dequeue();
        q1.isEmpty();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.isEmpty();
        q1.dequeue();
        q1.isEmpty();
    }
}
