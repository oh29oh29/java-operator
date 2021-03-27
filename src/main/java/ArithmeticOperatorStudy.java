/**
 * 해당 클래스는 산술 연산을 확인하기 위하여 작성되었다.
 * */
public class ArithmeticOperatorStudy {

    public static void main(String[] args) {
        ArithmeticOperatorStudy arithmeticOperatorStudy = new ArithmeticOperatorStudy();

        arithmeticOperatorStudy.byteAndShort();
        arithmeticOperatorStudy.byteAndFloat();
        arithmeticOperatorStudy.division();
    }

    /**
     * int 형(4 byte)보다 크기가 작은 피연산자들 간의 연산은 int 형으로 변환 후에 연산을 수행한다.
     * */
    private void byteAndShort() {
        byte byteOperand = 10;
        short shortOperand = 10;

        Object result = byteOperand + shortOperand;

        System.out.println("result is Byte: " + Byte.class.isInstance(result));
        System.out.println("result is Short: " + Short.class.isInstance(result));
        System.out.println("result is Integer: " + Integer.class.isInstance(result));
    }

    /**
     * 두 개의 피연산자 중 표현 범위가 큰 쪽에 맞춰서 형 변환 된 후 연산을 수행한다.
     * */
    private void byteAndFloat() {
        byte byteOperand = 10;
        float floatOperand = 10f;

        Object result = byteOperand + floatOperand;

        System.out.println("result is Byte: " + Byte.class.isInstance(result));
        System.out.println("result is Short: " + Short.class.isInstance(result));
        System.out.println("result is Integer: " + Integer.class.isInstance(result));
        System.out.println("result is Float: " + Float.class.isInstance(result));
    }

    /**
     * 정수형 간의 나눗셈에서 0으로 나누는 것은 불가능하다.
     * */
    private void division() {
        int dividend = 10;
        int divisor = 0;

        int result = dividend / divisor;
        System.out.println(result);
    }
}
