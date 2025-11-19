package referenceType;

public class StringEqualsExample {
    public static void main(String[] args) {
        // 자바는 문자열 리터럴이 동일하다면 String 객체를 공유하도록 설계되어있다.
        // 문자열 리터럴을 'String Constant Pool' 이라는 특별한 공간에 저장한다.
        // 코드가 실행될 때 "Java"라는 리터럴이 나오면 먼저 Pool에 "Java"가 있는지 확인한다.
        // 있다면 새로 메모리를 할당하지 않고 기존의 것을 재사용한다.
        String str1 = "Hello World!";
        String str2 = "Hello World!";
        
        if (str1 == str2) { // 변수에 담긴 주소(참조) 비교
            System.out.println("str1과 str2는 참조가 같음");
        } else {
            System.out.println("str1과 str2는 참조가 다름");
        }

        if (str1.equals(str2)) { // str1과 str2의 문자열 자체를 비교
            System.out.println("str1과 str2의 문자열이 같음");
        }

        // new 연산자로 객체 생성, 문자열은 같지만 다른 객체(변수의 참조가 다름)
        String str3 = new String("Hello World!");
        String str4 = new String("Hello World!");
        
        if (str3 == str4) {
            System.out.println("str3과 st4의 참조가 같음");
        } else {
            System.out.println("str3과 st4의 참조가 다름");
        }
        
        if (str3.equals(str4)) { // 문자열 자체는 같음
            System.out.println("str3와 str4의 문자열이 같음");
        }
    }
}
