package oop.polymorphism.payment;

// 공통 결제 규격을 정의하는 인터페이스
public interface PaymentProcessor {
    void processPayment(int amount);
}
