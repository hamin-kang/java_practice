package oop.polymorphism.payment;
/*
    다형성: 하나의 타입이나 메서드 이름이 상황에 따라 여러 가지 형태로 동작하는 성질. 상속과 오버라이딩을 통해 구현하며,
    코드의 유연성과 확장성을 확보하는 데 핵심적인 역할을 함.
 */
public class Main {
    public static void main(String[] args) {
        // 카카오페이 선택
        PaymentProcessor kakaoPay = new KakaoPayProcessor();
        OrderService orderWithKakao = new OrderService(kakaoPay);
        orderWithKakao.checkout(15000);

        // 토스페이 선택
        PaymentProcessor tossPay = new TossPayProcessor();
        OrderService orderWithToss = new OrderService(tossPay);
        orderWithToss.checkout(30000);
    }
}