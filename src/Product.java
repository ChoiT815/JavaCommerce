import java.text.DecimalFormat;

public class Product {
    // 1. 속성
    // 가격을 표시할때 1,200,000 형식으로 출력하는 포맷
    private static final DecimalFormat PRICE_FORMAT = new DecimalFormat("#,###");
    // 상품명
    private final String name;
    // 가격
    private final int price;
    // 상품 설명
    private final String description;
    // 재고 수량
    private final int stock;

    // 2. 생성자
    public Product(String name, int price, String description, int stock) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getStock() {
        return stock;
    }


    // 3. 기능
    // 상품 목록에서 간단히 보여주는 메서드
    public String toMenuString() {
        return name + " | " + PRICE_FORMAT.format(price) + "원 | " + description;
    }

    // 상품을 선택했을 때 상세 정보로 보여주는 메서드
    public String toDetailString() {
        return name + " | " + PRICE_FORMAT.format(price) + "원 | " + description + " | 재고: " + stock + "개";
    }
}
