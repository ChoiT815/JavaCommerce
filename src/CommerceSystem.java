
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {

    // 1. 속성
    // 시스템이 관리하는 전체 카테고리 목록
    private final List<Category> categories;

    // 사용자로부터 입력을 받기 위한 Scanner
    private final Scanner scanner;

    // 2. 생성자
    public CommerceSystem(List<Category> categories, Scanner scanner) {
        this.categories = categories;
        this.scanner = scanner;
    }

    // 3. 기능
    // 프로그램 시작 메서드
    public void start() {
        while (true) {
            boolean exit = runShop();
            if (exit) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                return;
            }
        }
    }

    // 쇼핑 흐름을 담당하는 메서드
    private boolean runShop() {
        Category selectedCategory = selectCategory();
        if (selectedCategory == null) {
            return true; // 종료
        }

        runProductMenu(selectedCategory);
        return false; // 다시 메인
    }


    // CATEGORY (카테고리 담당 메서드 묶음)
    // 출력 + 입력 + 선택을 하나의 메서드로 결합
    private Category selectCategory() {
        while (true) {
            System.out.println();
            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");

            int index = 1;
            for (Category c : categories) {
                System.out.println(index++ + ". " + c.getName());
            }
            System.out.println("0. 종료     | 프로그램 종료");

            int choice = readInt("번호를 입력하세요: ");

            // 0번 → 프로그램 종료 신호
            if (choice == 0) {
                return null; // 종료
            }

            // 출력한 순서 그대로 선택
            int i = 1;
            for (Category c : categories) {
                if (i++ == choice) {
                    return c;
                }
            }

            System.out.println("잘못된 번호입니다.");
        }
    }


    // PRODUCT (상품 담당 메서드 묶음)
    // 출력 + 입력 + 선택을 하나의 흐름으로 처리
    private void runProductMenu(Category category) {
        while (true) {
            System.out.println();
            System.out.println("[ " + category.getName() + " 상품 목록 ]");

            category.printProducts();

            int choice = readInt("번호를 입력하세요: ");

            // 0번 → 카테고리 메뉴로 복귀
            if (choice == 0) {
                return; // 카테고리로 복귀
            }
            Product selected = category.selectProduct(choice);
            // 출력한 순서 그대로 상품 선택

            if (selected == null) {
                System.out.println("잘못된 번호입니다.");
                continue;
            }

            printProductDetail(selected);
        }
    }

    // 상품 상세 정보 출력
    private void printProductDetail(Product product) {
        System.out.println();
        System.out.println("[상품 상세]");
        System.out.println(product.toDetailString());
        pressEnter("엔터를 누르면 목록으로 돌아갑니다...");
    }

    //INPUT (입력 처리 공통 기능)
    private int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();

            try {
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
            }
        }
    }


    // 엔터 입력을 대기하는 메서드
    private void pressEnter(String prompt) {
        System.out.print(prompt);
        scanner.nextLine();
    }
}