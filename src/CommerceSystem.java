import java.util.List;
import java.util.Scanner;


public class CommerceSystem {
      // 시스템이 관리할 상품 목록 (main에서 주입받음)
      private final List<Category> categories;

    public CommerceSystem(List<Category> categories) {
        this.categories = categories;  // main에서 만든 리스트를 그대로 받는다.
    }

    public void start(Scanner scanner) {
        while (true) {
            printMenu();

            System.out.print("번호를 입력하세요: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("커머스 플랫폼을 종료합니다. ");
                break;
            }

            if (choice < 1 || choice > categories.size()) {
                System.out.println("잘못된 번호입니다. ");
                continue;
            }

            Category selectedCategory = categories.get(choice - 1);
            System.out.println("[" + selectedCategory.getName() + "] 카테고리를 선택하셨습니다." );
            runCategory(scanner, selectedCategory);
        }
    }

    // 카테고리 내부(상품 목록) 메뉴 루프
    private void runCategory(Scanner scanner, Category category) {
        while (true) {
            category.printProductsMenu();

            int choice = readInt(scanner, "번호를 입력하세요: ");

            if (choice == 0) {
                // 뒤로가기 -> 메인 메뉴로 복귀
                return;
            }

            List<Product> products = category.getProducts();

            if(choice < 1 || choice > products.size()) {
                System.out.println("잘못된 번호입니다.");
                continue;
            }

            Product selectedProduct = products.get(choice - 1);

            //선택한 상품 상세 출력
            System.out.println("선택한 상품: " + selectedProduct.toDetailString());

            //상품 선택 후 카테고리 종료 -> 메인으로
            return;
        }
    }

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


