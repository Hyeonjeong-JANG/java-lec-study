package ex14.miniproject;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}

public class ProductTest {
    public static void main(String[] args) {

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "삼성 노트북", 1000000));
        productList.add(new Product(2, "엘지 노트북", 2000000));
        productList.add(new Product(3, "현대 노트북", 3000000));
        productList.add(new Product(4, "기아 노트북", 4000000));
        productList.add(new Product(5, "롯데 노트북", 5000000));
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 상품을 검색하세요.");
        System.out.println("상품의 이름(*은 모든 상품을 의미): ");
        String p1 = sc.nextLine();
        System.out.println("상품 가격의 상한: ");
        int p2 = sc.nextInt();
        productList.stream().filter(product -> (product.getName().contains(p1)) && (product.getPrice() <= p2)).forEach(product -> System.out.print(product.getId() + " " + product.getName() + " " + product.getPrice() + "\n"));
    }
}
