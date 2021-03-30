/**
 * 해당 클래스는 쉬프트 연산을 확인하기 위하여 작성되었다.
 * */
public class ShiftOperatorStudy {

    public static void main(String[] args) {
        int operand = 10;
        System.out.println(operand >> 1);   // 5
        System.out.println(operand >> 2);   // 2
        System.out.println(operand >>> 1);  // 5
        System.out.println(operand >>> 2);  // 2
        System.out.println(operand << 1);   // 20
        System.out.println(operand << 2);   // 40

        int operand2 = -10;
        System.out.println(operand2 >> 1);   // -5
        System.out.println(operand2 >> 2);   // -3
        System.out.println(operand2 >>> 1);  // 2147483643
        System.out.println(operand2 >>> 2);  // 1073741821
        System.out.println(operand2 << 1);   // -20
        System.out.println(operand2 << 2);   // -40
    }
}
