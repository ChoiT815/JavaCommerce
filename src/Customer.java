public class Customer {
    // 속성
    // 고객 이름
    private final String name;

    // 고객 이메일
    private final String email;

    // 고객 등급
    private final String grade;

    // 생성자
    public Customer(String name, String email, String grade) {
        this.name = name;
        this.email = email;
        this.grade = grade;
    }

    // 기능
    // 고객 이름을 반환하는 메서드
    public String getName() {
        return name;
    }

    // 고객 이메일을 반환하는 메서드
    public String getEmail() {

        return email;
    }

    // 고객 등급(VIP, 일반 등)을 반환하는 메서드
    public  String getGrade() {

        return grade;
    }

}
