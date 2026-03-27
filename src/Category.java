import java.util.ArrayList;
import java.util.List;

public class Category {
    // 속성
    // 상위 개념(전자제품/의류/식품 등) 이름
    private final String name;
    // Product 목록은 이제 Category가 관리
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


}
