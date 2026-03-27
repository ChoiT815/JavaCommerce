
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Category> categories = new ArrayList<>();

        // 카테고리 생성
        Category electronics = new Category("전자제품");
        Category clothes = new Category("의류");
        Category food = new Category("음식");

        // 카테고리 리스트에 추가
        categories.add(electronics);
        categories.add(clothes);
        categories.add(food);

        // 사용자 입력 도구 (start()에서 반복 사용)
        Scanner scanner = new Scanner(System.in);

        // 전자제품
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

        // 의류
        Product jacket1 = new Product(
                "나이키 SB",
                159000,
                "나이키 SB",
                10
        );

        Product jacket2 = new Product(
                "조던",
                139000,
                "조던",
                10
        );

        // 음식
        Product meat = new Product(
                "소불고기",
                26000,
                "불고기",
                10
        );

        Product kimchi = new Product(
                "배추김치",
                19500,
                "배추김치",
                10
        );

        // 전자제품
        electronics.addProduct(laptop);
        electronics.addProduct(phone1);
        electronics.addProduct(phone2);
        electronics.addProduct(earphones1);
        electronics.addProduct(earphones2);
        electronics.addProduct(headset);

        // 의류
        clothes.addProduct(jacket1);
        clothes.addProduct(jacket2);

        // 음식
        food.addProduct(meat);
        food.addProduct(kimchi);

        CommerceSystem system = new CommerceSystem(categories);
        system.start(scanner);
        scanner.close();

    }

}
