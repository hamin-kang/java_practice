package referenceType;

public class GarbageObjectExample {
    public static void main(String[] args) {
        // 어떤 변수에서도 객체를 참조하지 않으면 해당 객체는 프로그램에서 사용할 수 없는 객체가 된다.
        // 즉, 힙 영역에는 있지만 위치 정보를 모르기 때문에 사용할 수 없게 된다.
        // 자바는 이러한 객체를 쓰레기로 취급하고, GC(Garbage Collector)를 실행시켜 자동으로 제거한다.
        String hobby = "Travel";
        hobby = null; // "toyota"에 해당하는 String 객체를 쓰레기로 만듦
        
        String car1 = "Hyundai";
        String car2 = car1; // car1 변수에 저장되어 있는 번지를 car2 변수에 대입
        car1 = null; // "Hyundai"에 해당하는 String 객체는 쓰레기가 아님
        // 그 이유는 car2 변수가 여전히 참조하고 있기 때문.
        System.out.println("car2: " + car2);

    }
}
