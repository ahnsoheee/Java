## 2. 변수의 타입

### 기본형과 참조형
- 자료형은 크게 기본형과 참조형으로 나뉜다.
- 기본형 변수: 실제 값을 저장한다.
- 참조형 변수: 어떤 값이 저장되어 있는 주소를 값을 갖는다.

#### 1. 기본형 (Primitive type)
- 논리형: boolean -> true/false
- 문자형: char 
- 정수형: byte, short, int, long 

    -> int가 가장 CPU를 효율적으로 처리할 수 있는 타입

    -> 효율적인 실행보다 메모리를 절약하려면, byte나 short 선택
- 실수형: float, double

|종류/크기|1byte|2byte|4byte|8byte|
|---|---|---|---|---|
|논리형|boolean||||
|문자형||char|||
|정수형|byte|short|int|long|
|실수형|||float|double|

|자료형|저장 가능한 값의 범위|
|---|---|
|boolean|true, false|
|char|\u0000 ~ \uffff (0~65535)|
|byte|-128 ~ 127|
|short|-32768 ~ 32767|
|int|-2^31 ~ 2^31 -1 (약 +- 20억)|
|long|-2^63 ~ 2^63 -1|
|float|1.4E-45 ~ 3.4E38 (양의 범위, 음의 범위는 -만 붙이면 됨)|
|double|4.9E-324 ~ 1.8E308 (양의 범위, 음의 범위는 -만 붙이면 됨)|

#### 2. 참조형 변수
- 8개의 기본형 변수 외 나머지 타입
- 참조형 변수(또는 참조변수)를 선언할 때 변수의 타입으로 클래스의 이름을 사용하므로 클래스의 이름이 참조변수의 타입이 된다.

### 상수와 리터럴 (constant & literal)
#### 1. 상수
- 값을 한번만 저장할 수 있는 공간
- 선언과 동시에 초기화해야 한다.
- 다른 값으로 변경할 수 없다.
    ```java
    final int MAX_SPEED = 10;
    ```

#### 2. 리터럴
- 그 자체로 값을 의미하는 것
    ```java
    int year = 2021; // -> year: 변수, 2021: 리터럴
    final int MAX_VALUE = 100; // -> MAX_VALUE: 상수
    ```

#### 3. 리터럴의 타입과 접미사
- 정수형
    - long타입의 리터럴에 접미사 'l' 또는 'L'을 붙인다. 
    - 접미사가 없는 경우 int 타입의 리터럴
    - byte나 short 타입의 리터럴은 별도로 존재하지 않고 int 타입의 리터럴을 사용
    - 16진수: 리터럴 앞에 '0x' 또는 '0X'
    - 8진수: 리터럴 앞에 '0'
    - 2진수: 리터럴 앞에 '0b' 또는 '0B'
- 실수형
    - float: 'f' 또는 'F'
        ```java
        float pi = 3.14 // -> 에러, float 타입 변수에 double 타입 리터럴 저장 불가
        ```
    - double: 'd' 또는 'D' -> 생략 가능

- 리터럴에 소수점이나 E/e, f/F/d/D를 포함하고 있으면 실수형 리터럴로 간주
- p를 이용해 실수 리터럴을 16진수 형태로 표현 가능 -> p = 2의 제곱
    ```java
    0x1p1 = (1*16^0) * 2*1
    0x12p3 = (1*16^1 + 2*16^0) * 2^3 
    0x0.2p-1 = (2*16^-1) * 2^-1
    ```

#### 4. 타입의 불일치
- 타입이 달라도 저장범위가 넓은 타입에 좁은 타입의 값을 저장하는 것은 허용
    ```java
    int i = 'A'; // OK, 'A'의 유니코드인 65가 변수 i에 저장
    long l = 123; // OK, int보다 long 타입이 더 범위가 넓음
    
    int i = 0x123456789 // 에러, int 타입의 범위를 넘는 값을 저장
    float f = 3.14;  // 에러, float 타입보다 double의 범위가 넓다.

    byte b = 65; // OK, byte 타입에 저장 가능한 범위의 int 타입 리터럴
    short s = 0x1234; // OK, short 타입에 저장 가능한 범위의 int 타입 리터럴
    ```

#### 5. 문자 리터럴과 문자열 리터럴
- 문자 리터럴: 작은 따옴표롤 문자 하나를 감싼 것
- 문자열 리터럴: 두 문자 이상은 큰따옴표로 감싸야 함

    ```java
    char ch = 'J' // char ch = 'Java' -> x
    String name = "Java" // OK
    ```
- 문자열 리터럴은 빈 문자열 허용, 문자 리터럴은 허용하지 않음
    ```java
    String str = ""; // OK 
    char ch = ''; // 에러
    char ch = ' '; // OK, 공백 문자로 초기화
- 원래 String은 클래스이므로 new 연산자를 사용해야 하지만 위 표현도 허용
    ```java
    String name = new String("Java");
    ```
- 문자열 결합
    ```java
    String name = "Ja" + "va"; // name = "Java"
    String str = name + 8.0 // str = "Java8.0"
    // 덧셈 연산자는 피연산자가 모두 숫자일 때는 두수를 더하지만, 
    // 어느 한 쪽이 String이면 나머지 한 쪽을 String으로 변환한 다음 두 String을 결합
    // 문자열 + any type -> 문자열 + 문자열 -> 문자열
    // any type + 문자열 -> 문자열 + 문자열 -> 문자열
    ```

### 형식화된 출력 - printf()

|||
|---|---|
|%b|boolean|
|%d|10진수 integer|
|%o|8진수|
|%x, S|16진수|
|%f|10진수 float|
|%e, %E|지수형태표현|
|%g|실수형 -  값을 간단하게 표현할 때|
|%c|문자|
|%s|문자열|


### 화면에서 입력받기 - Scanner

```java
import java.util.*;

Scanner scanner = new Scanner(System.in);
```
- 문자열 입력: nextLine()
- 정수 입력: nextInt()
- 실수 입력: nextFloat()
-> nextLine()으로 입력받아서 변환하는 것이 더 낫다.