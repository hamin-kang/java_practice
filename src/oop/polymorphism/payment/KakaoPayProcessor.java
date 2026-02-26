package oop.polymorphism.payment;

// 카카오페이 결제 구현체
public class KakaoPayProcessor implements PaymentProcessor {
    @Override
    public void processPayment(int amount) {
        System.out.println("카카오페이 API를 호출하여 " + amount + "원을 결제합니다.");
        // 실제 카카오페이 서버와 통신하는 로직이 들어갈 자리
    }
}
