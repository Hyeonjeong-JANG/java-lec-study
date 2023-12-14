package ex03;

public class PizzaTopping {
    public static void main(String[] args) {

        String[] toppings = {"Pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon"};

        // for-each
        for (String s : toppings) {
            System.out.print(s + " ");
        }
        System.out.println();

        //for
        for (int i = 0; i < toppings.length; i++) {
            System.out.print(toppings[i] + " ");
        }

        // 10개의 실수를 저장할 수 있는 배열을 생성하고. 여기에 0.0, 0.1, ..., 0.9를 저장하고 저장된 값들을 배열에서 꺼내어서 화면에 출력하자

        double[] arrD = {0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9};

        for (int i = 0; i < 10; i++) {
            System.out.println(arrD[i]);
        }
    }
}
