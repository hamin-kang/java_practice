package oop.polymorphism.payment;

// 토스페이 결제 구현체
public class TossPayProcessor implements PaymentProcessor {
    @Override
    public void processPayment(int amount) {
        System.out.println("토스페이 API를 호출하여 " + amount + "원을 결제합니다.");
        // 실제 토스페이 서버와 통신하는 로직이 들어갈 자리
    }
}
