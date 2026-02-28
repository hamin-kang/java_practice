package oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // 부모 클래스인 Animal의 필드와 메서드에 접근 가능
        myDog.name = "바둑이";
        myDog.eat();

        // 자식 클래스인 Dog 자신의 메서드 호출
        myDog.bark();
    }
}
