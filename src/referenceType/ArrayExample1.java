package referenceType;

public class ArrayExample1 {
    public static void main(String[] args) {
        // 배열 변수 선언과 배열 생성
        String[] season = {"Spring", "Summer", "Fall", "Winter"};

        for (int i = 0; i < season.length; i++) {
            System.out.println(season[i]);
        }
        int[] scores = {83, 90, 87};
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합: " + sum);
        System.out.println("평균: " + (double) sum / scores.length);

        // 중괄호 {}로 감싼 값의 목록을 배열 변수에 대입할 때 주의해야 한다.
        // 배열변수를 미리 선언한 후에는 값 목록을 변수에 대입할 수 없다.
        // 배열 변수를 선언한 시점과 값 목록이 대입되는 시점이 다르다면 new 타입[]을 {}앞에 붙여주면 된다.

        // 배열 변수 선언
        int[] scores1;
        // 배열 변수에 배열을 대입
        scores1 = new int[] {83, 90, 87};
        int sum1 = 0;
        for (int i = 0; i < scores1.length; i++) {
            sum1 += scores1[i];
        }
        System.out.println("총합: " + sum1);

        // 배열을 매개값으로 주고, printItem() 메소드 출력
        printItem(new int[] {50, 60, 70});
    }

    public static void printItem(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("score[" + i + "] = " + scores[i]);
        }
    }
}
