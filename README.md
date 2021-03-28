# Java Operator

자바는 필요에 따라 사용할 수 있는 다양한 유형의 연산자를 제공한다.

## 산술 연산자, Arithmetic Operators

기본형의 간단한 산술 연산을 수행하는데 사용된다.  

#### Addition `+`

이항 연산자이며 두 개의 피연산자를 더하는 데 사용된다.  

#### Subtraction `-`

이항 연산자이며 두 피연산자를 빼는 데 사용된다.

#### Multiplication `*`

이항 연산자이며 두 피연산자를 곱하는 데 사용된다.

#### Division `/`

이항 연산자이며 첫 번째 피연산자(dividend)를 두 번째 피연산자(divisor)로 나누고 그 결과로 몫을 구하는 데 사용된다.  

#### Modulus `%`

이항 연산자이며 첫 번째 피연산자(dividend)를 두 번째 피연산자(divisor)로 나누고 그 결과로 나머지를 구하는 데 사용된다.

이상 이항 연산자에 대해서 알아보았다.  
모든 이항 연산자는 연산 수행을 할 때 다음과 같은 특징이 있다.  

1. int 형(4 byte)보다 크기가 작은 피연산자들 간의 연산은 int 형으로 변환 후에 연산을 수행한다.  

```java
public class ArithmeticOperatorStudy {

    public static void main(String[] args) {
        byte byteOperand = 10;
        short shortOperand = 10;

        Object result = byteOperand + shortOperand;

        System.out.println("result is Byte: " + (result instanceof Byte)));
        System.out.println("result is Short: " + (result instanceof Short));
        System.out.println("result is Integer: " + (result instanceof Integer));
    }
}
```

![byte 와 short 연산](images/IMG_arithmetic_02.png)

2. 두 개의 피연산자 중 표현 범위가 큰 쪽에 맞춰서 형 변환 된 후 연산을 수행한다.  

```java
public class ArithmeticOperatorStudy {

    public static void main(String[] args) {
        byte byteOperand = 10;
        float floatOperand = 10f;

        Object result = byteOperand + floatOperand;

        System.out.println("result is Byte: " + (result instanceof Byte));
        System.out.println("result is Short: " + (result instanceof Short));
        System.out.println("result is Integer: " + (result instanceof Integer));
        System.out.println("result is Float: " + (result instanceof Float));
    }
}
```

![byte 와 float 연산](images/IMG_arithmetic_03.png)

3. 정수형 간의 나눗셈에서 0으로 나누는 것은 불가능하다.

```java
public class ArithmeticOperatorStudy {

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        int result = dividend / divisor;
        System.out.println(result);
    }
}
```

위와 같이 0으로 나눌 경우, java.lang.ArithmeticException 예외가 발생하는 것을 확인할 수 있다.

![division](images/IMG_arithmetic_01.png)

#### Increment `++`

단항 연산자이며 피연산자의 정수 값을 증가시키는 데 사용된다.  
해당 연산자를 사용하는 방법에는 두 가지가 있다.  

- Post-increment  
해당 명령문이 실행될 때까지는 피연산자의 값이 일시적으로 유지되고 다음 명령문 실행 전에 증가한다.
  
- Pre-increment  
해당 명령문이 실행될 때 피연산자의 값이 즉시 증가한다.  

  - ++i 와 i=i+1 의 비교  
  '++i' 와 'i=i+1' 의 결과는 서로 같지만 실제로 연산이 수행되는 과정은 다르다.  
  '++i' 가 'i=i+1' 보다 더 적은 명령만으로 연산을 수행하기 때문에 더 빠르다.  
    ```java
    public static void main(String[] args) {
        int i = 0;
        i = i + 1;
    }
    ```
    ![i=i+1](images/IMG_arithmetic_04.png)
    ```java
    public static void main(String[] args) {
        int i = 0;
        ++i;
    }
    ```
    ![++i](images/IMG_arithmetic_05.png)  
#### Decrement `--`

단항 연산자이며 피연산자의 정수 값을 감소시키는 데 사용된다.
해당 연산자를 사용하는 방법에는 두 가지가 있다.  

- Post-decrement  
해당 명령문이 실행될 때까지는 피연산자의 값이 일시적으로 유지되고 다음 명령문 실행 전에 감소한다.
  
- Pre-decrement  
해당 명령문이 실행될 때 피연산자의 값이 즉시 감소한다.


<hr>

#### References

> 웹 문서
> - [geeksforgeeks | Operators in Java](https://www.geeksforgeeks.org/operators-in-java/)
> - [geeksforgeeks | Java Arithmetic Operators with Examples](https://www.geeksforgeeks.org/java-arithmetic-operators-with-examples/)
> 
> 도서
> - JAVA의 정석(2ND EDITION) 중 '3장 연산자'