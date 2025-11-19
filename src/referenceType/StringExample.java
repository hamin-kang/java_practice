package referenceType;

public class StringExample {
    public static void main(String[] args) {
        String oldStr = "자바 문자열은 불변합니다. 자바 문자열은 String 입니다.";
        String newStr = oldStr.replace("자바", "JAVA");
        System.out.println(oldStr);
        System.out.println(newStr);
        // 문자열 잘라내기 메소드 substring()
        String ssn = "880815-1234567";

        // 주민등록번호 앞자리
        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);

        // 주민등록번호 뒷자리
        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
        
        // 특정 문자열의 위치를 찾을 때 indexOf() 메소드를 사용함
        // 문자열이 시작되는 인덱스를 리턴함
        // 만약 주어진 문자열이 포함되어 있지 않다면 -1을 리턴함
        // 단순히 주어진 문자열이 포함되어 있는지만 조사하고 싶다면 contains()를 사용
        String subject = "자바 프로그래밍";
        int location = subject.indexOf("프로그래밍"); // 3
        System.out.println(location);


    }
}
