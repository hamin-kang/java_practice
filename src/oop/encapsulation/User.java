package oop.encapsulation;

public class User {
    // 변수를 private으로 선언하여 외부 접근 차단
    private String username;
    private int age;

    // 생성자
    public User(String username, int age) {
        this.username = username;
        setAge(age);
    }

    // username의 값을 반환하는 getter 메서드
    public String getUsername() {
        return username;
    }

    // age의 값을 반환하는 getter 메서드
    public int getAge() {
        return age;
    }

    // age의 값을 수정하는 setter 메서드 (데이터 유효성 검증 포함)
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("오류: 나이는 음수가 될 수 없어.");
        }
    }
}
