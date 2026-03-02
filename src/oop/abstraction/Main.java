package oop.abstraction;

public class Main {
    public static void main(String[] args) {
        // 추상 클래스는 직접 객체 생성이 불가능함
        // Shape shape = new Shape(); // 컴파일 에러 발생

        // 구체 클래스를 통한 객체 생성 및 다형성 활용
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // 공통 메서드 호출
        circle.printShapeType();
        // 자식 클래스에서 구현된 메서드 호출
        System.out.println("원의 넓이: " + circle.calculateArea());

        System.out.println("---");

        rectangle.printShapeType();
        System.out.println("사각형의 넓이: " + rectangle.calculateArea());
    }
}
