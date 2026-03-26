public class Product {
    // 1. 속성
    // 상품명
    private String name;
    // 가격
    private int price;
    // 상품 설명
    private String description;
    // 재고 수량
    private int stock;

    // 2. 생성자
    public Product(String name, int price, String description, int stock) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }

    // 3. 기능
    // 상품 하나를 설명하는 메서드
    public void printInfo() {
        System.out.println("상품명: " + name);
        System.out.println("가격: " + price + "원");
        System.out.println("설명: " + description);
        System.out.println("재고 수량: " + stock);
        System.out.println("---------------------");
    }


    // 메뉴에 출력될 상품 한 줄 정보를 반환한다
    public String toMenuLine() {
        // 가격을 1,200,000원 형태로 보기 좋게 포맷
        String formattedPrice = String.format("%,d원", price);
        return name + " | " + formattedPrice + " | " + description;
    }

    }
