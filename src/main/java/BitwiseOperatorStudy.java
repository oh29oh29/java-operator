/**
 * 해당 클래스는 비트 연산을 확인하기 위하여 작성되었다.
 * */
public class BitwiseOperatorStudy {

    public static void main(String[] args) {
        BitwiseOperatorStudy bitwiseOperatorStudy = new BitwiseOperatorStudy();
        bitwiseOperatorStudy.or();
        bitwiseOperatorStudy.and();
        bitwiseOperatorStudy.xor();
        bitwiseOperatorStudy.complement();
    }

    /**
     * OR 연산
     * */
    private void or() {
        int operand1 = 5;
        int operand2 = 7;

        int or = operand1 | operand2;
        System.out.println("5 | 7 = " + or);
    }

    /**
     * AND 연산
     * */
    private void and() {
        int operand1 = 5;
        int operand2 = 7;

        int or = operand1 & operand2;
        System.out.println("5 & 7 = " + or);
    }

    /**
     * XOR 연산
     * */
    private void xor() {
        int operand1 = 5;
        int operand2 = 7;

        int or = operand1 ^ operand2;
        System.out.println("5 ^ 7 = " + or);

    }

    /**
     * 비트 보수
     * */
    private void complement() {
        int operand = 5;

        int complement = ~operand;
        System.out.println("~5 = " + complement);
    }

}
