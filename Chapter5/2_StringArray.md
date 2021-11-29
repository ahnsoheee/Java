## 2. String 배열

### char 배열과 String 클래스
- String 클래스는 char 배열에 기능을 추가한 것
- String 객체(문자열)는 읽을 수 만 있을 뿐 내용을 변경할 수 없다. -> 불변(immutable) 객체

### String이 불변 객체인 이유
#### 1) String Pool
- Java에서는 String Pool이라는 공간에 String을 포함시켜, 같은 String이 있으면 String Pool에 있는 객체를 재사용하도록, 없으면 String Pool에 새로운 객체를 생성하도록 구현되어있다.
- 즉, 같은 값을 가지고 있으면 같은 String 객체를 참조하고,  이후 값이 바뀌게 되면 다른 String 객체를 참조하게 된다.

#### 2) 동기화
- 객체가 불변이면 멀티 스레드 환경에서 값이 바뀔 위험이 없다.
- 따라서 thread-safe하게 되고, 동기화와 관련된 위험에서 벗어날 수 있다. 여러 스레드에서 동시에 접근해도 별다른 문제가 없다.
- String의 값이 바뀌면 그 값을 갖는 객체를 참조하거나 새로운 객체를 String Pool에 생성하기 때문에 thread-safe 하다고 볼 수 있다.

### String 클래스의 주요 메서드
- char carAt(int index): 문자열에서 해당 위치에 있는 문자를 반환한다.
- int length(): 문자열의 길이를 반환한다.
- String substring(int from, int to): 문자열에서 해당 범위에 있는 문자열을 반환한다. (to는 포함되지 않는다.)
- boolean equals(String str): 문자열의 내용이 같은지 확인한다. 같으면 true, 다르면 false를 반환한다.
- char[] toCharArray(): 문자열을 문자배열로 변환해서 반환한다.

### 커맨드 라인으로 입력받기
```java
> java MainTest abc 123
```
- nextLine()외에 화면을 통해 값을 입력받을 수 있는 방법이다.
- 프로그램을 실행할 때 클래스 이름 뒤에 공백문자로 구분해 여러 개의 문자열을 전달할 수 있다.
- 입력된 문자열은 String 배열에 담겨 클래스의 main메서드의 매개변수(args)에 전달된다.
- main 메서드 내에서 args[0], args[1]과 같이 접근할 수 있다. -> args[0] = abc, args[1] = 123
- 커맨드라인에서 숫자를 입력해도 문자열로 처리된다.
- 커맨드라인에 매개변수를 입력하지 않으면 크기가 0인 배열이 생성된다.
- JVM이 입력된 매개변수가 없을 때, null 대신 크기가 0인 배열을 생성해서 args에 전달하도록 구현되어있다.
- 만약 그렇지 않다면 args는 null이 될 것이고,  args를 사용하는 모드 코드에서 에러가 발생하기 때문에 예외 처리를 해줘야 할 것이다.


<details>
<summary>참조</summary>

- [Java에서 String은 왜 불변일까?](https://starkying.tistory.com/entry/why-java-string-is-immutable)

</details>