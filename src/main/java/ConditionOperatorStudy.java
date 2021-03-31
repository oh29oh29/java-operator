import java.util.concurrent.ThreadLocalRandom;

public class ConditionOperatorStudy {

    public static void main(String[] args) {
        int random = ThreadLocalRandom.current().nextInt();
        String result1;

        if (random > 10) result1 = "if true";
        else result1 = "else";
        System.out.println("if else 문 결과: " + result1);

        String result2 = random > 10 ? "조건문 true" : "조건문 false";
        System.out.println("3항 연산자 결과: " + result2);
    }
}
