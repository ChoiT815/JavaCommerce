import java.util.List;
import java.util.Scanner;


public class CommerceSystem {
      // 속성
      // 시스템이 관리할 상품 목록 (main에서 주입받음)
      private final List<Category> categories;

      // CommerceSystem 생성자
      public CommerceSystem(List<Category> categories) {
        this.categories = categories;  // main에서 만든 리스트를 그대로 받는다.
    }

    // 기능
    public void start(Scanner scanner) {
        while (true) {
            printMenu();

            System.out.print("번호를 입력하세요: ");
            int choice = readInt(scanner, "번호를 입력하세요: ");

            // 0번 입력 시 프로그램 종료
            if (choice == 0) {
                System.out.println("커머스 플랫폼을 종료합니다. ");
                break;
            }

            // 잘못된 번호 입력 처리
            if (choice < 1 || choice > categories.size()) {
                System.out.println("잘못된 번호입니다. ");
                continue;
            }

            // 선택한 카테고리 조회
            Category selectedCategory = categories.get(choice - 1);
            System.out.println("[" + selectedCategory.getName() + "] 카테고리를 선택하셨습니다." );

            // 선택한 카테고리 내부 메뉴 실행
            runCategory(scanner, selectedCategory);
        }
    }

    // 카테고리 내부(상품 목록) 메뉴 실행
    private void runCategory(Scanner scanner, Category category) {
        while (true) {
            // 카테고리 내 상품 목록 출력
            category.printProductsMenu();

            int choice = readInt(scanner, "번호를 입력하세요: ");

            // 0번 입력 시 메인 메뉴로 복귀
            if (choice == 0) {
                // 뒤로가기 -> 메인 메뉴로 복귀
                return;
            }

            List<Product> products = category.getProducts();

            // 잘못된 상품 번호 입력 처리
            if(choice < 1 || choice > products.size()) {
                System.out.println("잘못된 번호입니다.");
                continue;
            }

            // 선택한 상품 조회
            Product selectedProduct = products.get(choice - 1);

            //선택한 상품 상세 정보 출력
            System.out.println("선택한 상품: " + selectedProduct.toDetailString());

            //상품 선택 후 카테고리 종료 -> 메인으로
            return;
        }
    }

    // 메인 메뉴 출력
    private void printMenu() {
        System.out.println();
        System.out.println("[ 실시간 커머스 플랫폼 메인]");

        for(int i = 0; i < categories.size(); i++) {
            System.out.println((i + 1) + ". " + categories.get(i).getName());
        }

        System.out.println("0. 종료     | 프로그램 종료");
    }

    // 숫자 입력 안전 처리(문자 입력해도 안 터짐)
    private int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);

            if(scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine(); //개행 제거
                return value;
            } else  {
                scanner.nextLine(); // 잘못 입력한 토근 버림
                System.out.println("숫자를 입력해주세요.");
            }
        }
    }

}


