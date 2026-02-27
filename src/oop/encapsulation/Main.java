package oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("kim", 25);

        // user1.age = -5; // 변수에 직접 접근하면 컴파일 오류 발생

        // 메서드를 통한 데이터 접근 및 수정
        System.out.println(user1.getUsername());

        // 유효하지 않은 값 입력 시도 (setter 메서드 내부 로직에 의해 차단됨)
        user1.setAge(-10);
    }
}
