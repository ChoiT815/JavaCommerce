import java.util.ArrayList;
import java.util.List;

public class Category {
    // 속성
    // 카테고리 이름(예: "전자제품", "의류", "음식" ...)
    private final String name;
    //해당 카테고리에 속한 상품(Product) 목록
    private final List<Product> products = new ArrayList<>();

    // 생성자
    public Category(String name) {
        this.name = name;
    }

    // 기능
    // 카테고리 이름 반환 메서드
    public String getName() {
        return name;
    }
    // 카테고리에 상품을 추가하는 메서드
    public void addProduct(Product product) {
        products.add(product);
    }
    // 카테고리에 속한 상품 목록을 반환하는 메서드
    public List<Product> getProducts() {

        return products;
    }

    }

