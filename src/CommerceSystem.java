import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
      // 시스템이 관리할 상품 목록 (main에서 주입받음)
      private final List<Product> products;

      // 사용자 입력 도구 (start()에서 반복 사용)
      private final Scanner scanner;


    public CommerceSystem(List<Product> products) {
        this.products = products;  // main에서 만든 리스트를 그대로 받는다.
        this.scanner = new Scanner(System.in);

    }

    void start() {
        while (true) {
            printMenu();

            System.out.print("번호를 입력하세요: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (choice < 1 || choice > products.size()) {
                System.out.println("잘못된 번호입니다.");
                continue;
            }

            Product selected = products.get(choice - 1);
            selected.printInfo();

        }
        scanner.close();
    }

    private void printMenu() {

    }

}


