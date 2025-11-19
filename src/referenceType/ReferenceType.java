package referenceType;

public class ReferenceType {
    public static void main(String[] args) {
        // 배열 변수 arr1, 2, 3 선언
        int[] arr1;
        int[] arr2;
        int[] arr3;

        // 배열은 참조 타입이므로 객체의 번지를 값으로 갖는다.
        arr1 = new int[] {1, 2, 3, 4, 5};
        arr2 = new int[] {1, 2, 3, 4, 5};
        arr3 = arr2;

        // arr1과 arr2 변수가 같은 배열을 참조하는지 검사
        System.out.println(arr1 == arr2); // 배열의 값들이 같지만 다른 객체를 참조하고 있다. false
        // arr2와 arr3 변수가 같은 배열을 참조하는지 검사
        System.out.println(arr2 == arr3); // 같은 객체를 참조하고 있다. true

        // 참조 타입 변수는 아직 번지를 저장하고 있지 않으므로 null(널) 값을 가질 수 있다.
        String refVar1 = "자바"; // 객체가 힙 영역에 생성되어 있고 변수에 번지가 저장되어 있음.
        String refVar2 = null; // 번지가 저장되어 있지 않음.

        System.out.println(refVar1 == null); // false
        System.out.println(refVar2 == null); // true

        // 변수가 null인 상태에서 객체의 데이터나 메소드를 사용하려 할 때 NullPointerException이 발생한다.
        int[] intArray = null;
//        intArray[0] = 10; // 참조하려는 배열 객체가 없기 때문
        String str = null;
//        System.out.println("총 문자 수: " + str.length());
    }
}