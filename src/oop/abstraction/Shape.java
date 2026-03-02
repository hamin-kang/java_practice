package oop.abstraction;

// 추상 클래스 정의
public abstract class Shape {
    // 추상 메서드: 하위 클래스에서 반드시 구현해야 함
    abstract double calculateArea();

    // 일반 메서드: 공통 기능 제공
    void printShapeType() {
        System.out.println("이것은 도형이다.");
    }
}
