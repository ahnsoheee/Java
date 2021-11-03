## 2. 자바 개발환경

### 자바 개발도구 (JDK)
- JDK = JRE + 개발에 필요한 실행파일(javac.exe 등)
- JRE: 자바실행환경, 자바로 작성된 응용프로그램이 실행되기 위한 최소환경 = JVM + 클리스라이브러리(Java API)

- javac.exe: 자바 컴파일러, 자바소스코드를 바이트코드로 컴파일한다.
    ```java
    javac Hello.java
    ```
- java.exe: 자바 인터프리터, 컴파일러가 생성한 바이트코드를 해석하고 실행한다.
    ```java
    java Hello
    ```
- javap.exe: 역어셈블러, 컴파일된 클래스파일을 원래의 소스로 변환한다.
    ```java
    javap Hello
    // -c 옵션을 사용하면 바이트코ㅡ로 컴파일된 내용을 볼 수 있다.
    ```
- javadoc.exe: 자동문서생성기, 소스파일에 있는 주석을 이용해 자바 API문서와 같은 형식의 문서를 자동으로 생성한다.
    ```java
    javadoc Hello.java
    ```
- jar.exe: 압축프로그램, 클래스파일과 프로그램의 실행에 관련된 파일을 하나의 jar파일로 압축하거나 압축해제한다.
    ```java
    // 압축
    jar cvf Hello1.class Hello2.class
    // 압축해제
    jar xvf Hello.jar
    ```
 