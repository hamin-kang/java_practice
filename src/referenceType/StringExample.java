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
        String substring = subject.substring(location);
        System.out.println(substring);
        
        location = subject.indexOf("자바");
        if (location != -1) {
            System.out.println("자바와 관련된 책입니다");
        } else { // 주어진 문자열이 포함되어 있지 않으면 -1 리턴
            System.out.println("자바와 관련 없는 책");
        }

        boolean result = subject.contains("자바"); // true
        if (result) {
            System.out.println("자바와 관련된 책입니다.");
        } else {
            System.out.println("자바와 관련 없는 책입니다.");
        }
        System.out.println("========================================");
        // 문자열 분리 메소드 split()

        String song = "동해물과,백두산이,마르고,닳도록,하느님이,보우하사,우리나라,만세";
        String[] SongArr = song.split(",");
        for (int i = 0; i < SongArr.length; i++) {
            System.out.println(SongArr[i]);
        }
    }
}
