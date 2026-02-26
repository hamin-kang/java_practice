package oop.polymorphism.payment;

// 결제를 수행하는 비즈니스 로직
public class OrderService {
    // 구체적인 클래스 (Kakao, Toss)가 아닌 인터페이스에 의존
    private final PaymentProcessor paymentProcessor;

    // 생성자를 통한 의존성(Dependency) 주입
    public OrderService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(int amount) {
        // 실제 어떤 결제 수단인지 몰라도 processPayment만 호출하면 됨
        paymentProcessor.processPayment(amount);
    }
}
