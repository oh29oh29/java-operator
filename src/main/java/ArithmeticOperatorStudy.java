/**
 * 해당 클래스는 산술 연산을 확인하기 위하여 작성되었다.
 * */
public class ArithmeticOperatorStudy {

    public static void main(String[] args) {
        ArithmeticOperatorStudy arithmeticOperatorStudy = new ArithmeticOperatorStudy();

        arithmeticOperatorStudy.preIncrement();
        arithmeticOperatorStudy.byteAndShort();
        arithmeticOperatorStudy.byteAndFloat();

        try {
            arithmeticOperatorStudy.division();
        } catch (Exception e) {
            e.printStackTrace();
        }

        arithmeticOperatorStudy.중간값_구하기();
    }

    /**
     * ++i 와 i=i+1 의 비교로 바이트코드를 확인해보면 ++i 가 더 적은 명령만으로 수행하기 때문에 더 빠르다
     * */
    private void preIncrement() {
        int normalIncrement = 0;
        int preIncrement = 0;

        System.out.println(normalIncrement + 1);
        System.out.println(++preIncrement);
    }

    /**
     * int 형(4 byte)보다 크기가 작은 피연산자들 간의 연산은 int 형으로 변환 후에 연산을 수행한다.
     * */
    private void byteAndShort() {
        byte byteOperand = 10;
        short shortOperand = 10;

        Object result = byteOperand + shortOperand;

        System.out.println("result is Byte: " + (result instanceof Byte));
        System.out.println("result is Short: " + (result instanceof Short));
        System.out.println("result is Integer: " + (result instanceof Integer));
    }

    /**
     * 두 개의 피연산자 중 표현 범위가 큰 쪽에 맞춰서 형 변환 된 후 연산을 수행한다.
     * */
    private void byteAndFloat() {
        byte byteOperand = 10;
        float floatOperand = 10f;

        Object result = byteOperand + floatOperand;

        System.out.println("result is Byte: " + (result instanceof Byte));
        System.out.println("result is Short: " + (result instanceof Short));
        System.out.println("result is Integer: " + (result instanceof Integer));
        System.out.println("result is Float: " + (result instanceof Float));
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

    private void 중간값_구하기() {
        int begin = 2_100_000_000;
        int end = 2_000_000_000;

        int result = (begin + end) / 2;
        System.out.println("잘못된 중간값 구하기: " + result);

        int result2 = begin + (end - begin) / 2;
        System.out.println("올바른 중간값 구하기 1: " + result2);

        int result3 = (begin + end) >>> 1;
        System.out.println("올바른 중간값 구하기 2: " + result3);
    }
}
