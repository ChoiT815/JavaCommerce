import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        Product laptop = new Product(
                "LG그램 17 윈도우11 애로우레이크 엘지 노트북",
                2333000,
                "LG 그램 17은 “17인치 대화면인데도 1.3kg대 초경량”을 실현한 노트북",
                10
        );
        Product Phone = new Product(
                "Galaxy S26 Ultra 1TB",
                2260000,
                "갤럭시 S26 울트라는 ‘프라이버시 디스플레이 + AI 성능 강화 + 200MP 카메라’를 핵심으로 한 삼성의 2026년형 최상위 플래그십 스마트폰",
                10
        );
        Product Earphones = new Product(
                "Galaxy Buds4 Pro",
                359000,
                "갤럭시 버즈 시리즈의 프로급 무선 이어폰으로, ANC(적응형 액티브 노이즈 캔슬링) 성능과 음질, 방수 등급이 기본형 버즈4보다 강화된 모델",
                10
        );
        Product Headset = new Product(
                "Apple 2024 AirPods Max Noise Cancelling Bluetooth Headphones",
                613490,
                "Apple이 출시한 액티브 노이즈 캔슬링을 지원하는 블루투스 헤드폰",
                10
        );

        products.add(laptop);
        products.add(Phone);
        products.add(Earphones);
        products.add(Headset);


        System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");

    while (true) {
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i).toMenuLine());
        }

        System.out.println("0. 종료 | 프로그램 종료");

        System.out.print("번호를 입력하세요: ");
        int choice = scanner.nextInt();

        if (choice == 0) {
            System.out.println("프로그램을 종료합니다.");
            break;
        } else {
            Product selected = products.get(choice - 1);
            selected.printInfo();
        }

    }
        scanner.close();
    }

}
