package referenceType;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args) {
        // 2차원 배열 생성
        int[][] scores = {
                {80, 90, 96}, // 첫번째 반 성적
                {76, 88}, // 두번째 반 성적
        };

        // 배열의 길이 (반의 수)
        System.out.println("1차원 배열의 길이(반의 수): " + scores.length);
        System.out.println("2차원 배열의 길이(첫번째 반의 학생 수): " + scores[0].length);
        System.out.println("2차원 배열 길이(두번째 반의 학생 수): " + scores[1].length);

        // 첫번째 반의 세번째 학생 점수 읽기
        System.out.println("scores[0][2]: " + scores[0][2]);
        // 두번째 반의 두번째 학생의 점수 읽기
        System.out.println("scores[1][1]: " + scores[1][1]);

        // 첫번째 반의 평균 점수 구하기
        int class1Sum = 0;
        for (int i = 0; i < scores[0].length; i++) {
            class1Sum += scores[0][i];
        }
        double class1Av = (double) class1Sum / scores[0].length;
        System.out.println("첫번째 반의 평균 점수: " + class1Av);

        // 두번째 반의 평균 점수 구하기
        int class2Sum = 0;
        for (int i = 0; i < scores[1].length; i++) {
            class2Sum += scores[1][i];
        }
        double class2Avg = (double) class2Sum / scores[1].length;
        System.out.println("두번째 반의 평균 점수: " + class2Avg);

        // 전체 학생의 평균 점수 구하기
        int classSum = 0;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                classSum += scores[i][j];
            }
        }
        double classAvg = (double) classSum / (scores[0].length + scores[1].length);
        System.out.println("전체 학생의 평균 점수: " + classAvg);
    }
}
