import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // 사용자 입력 도구 (start()에서 반복 사용)
        Scanner scanner = new Scanner(System.in);

        Product laptop = new Product(
                "LG그램 17 윈도우11 애로우레이크 엘지 노트북",
                2333000,
                "LG그램 17 윈도우11 애로우레이크 엘지 노트북",
                10
        );
        Product phone1 = new Product(
                "Galaxy S26 Ultra 1TB",
                2260000,
                "Galaxy S26 Ultra 1TB",
                10
        );
        Product phone2 = new Product(
                "Iphone 16 ProMax",
                2479500,
                "Iphone 16 ProMax",
                10
        );
        Product earphones1 = new Product(
                "Galaxy Buds4 Pro",
                359000,
                "Galaxy Buds4 Pro",
                10
        );
        Product earphones2 = new Product(
                "AirPods Pro 3",
                369000,
                "AirPods Pro 3",
                10
        );
        Product headset = new Product(
                "Apple 2024 AirPods Headphones",
                613490,
                "Apple 2024 AirPods Headphones",
                10
        );

        products.add(laptop);
        products.add(phone1);
        products.add(phone2);
        products.add(earphones1);
        products.add(earphones2);
        products.add(headset);

        CommerceSystem system = new CommerceSystem(products);
        system.start(scanner);
        scanner.close();

    }

}
