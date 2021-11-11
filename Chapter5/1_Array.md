## 1. 배열의 선언과 생성

### 배열의 생성
- 배열 선언: 생성된 배열을 다루기 위한 참조변수를 위한 공간이 만들어질 뿐
- 배열 생성: 값을 저장하기 위한 공간이 만들어진다.

```java
타입[] 변수이름; // 배열 선언
변수이름 = new 타입[길이]; // 배열 생성
```

### 생성 과정
```java
int[] score; // 1. 참조변수 선언
score = new int[5]; 
// 2. new에 의해 메모리의 빈 공간에 5개의 int형 데이터를 저장할 공간이 생김
// 3. 각 배열요소는 자동으로 int의 기본값인 0으로 초기화
// 4. '='에 의해 배열의 주소가 int형 배열 참조변수 score에 저장됨
```

### 길이
- 최대값은 int 타입의 최대값 약 20억
- 길이가 0인 배열도 생성 가능
- 변경하는 방법
    - 1. 더 큰 배열을 새로 생성한다.
    - 2. 기존 배열의 내용을 새로운 배열에 복사한다.

### 초기화
```java
int[] score = new int[]{50, 60, 70, 80, 90}; // 생성과 초기화를 동시에
int[] score = {50, 60, 70, 80, 90}; // new int[] 생략 가능

int[] score;
score = new int[]{50, 60, 70, 80, 90}; // OK
score = {50, 60, 70, 80, 90}; // 에러, 선언과 생성을 따로 하는 경우 생략할 수 없다.

int result = add(new int[]{50, 60, 70, 80, 90}); // OK
int result = add({50, 60, 70, 80, 90}); // 에러, new int[] 생략 x

int[] score = new int[0]; // 길이가 0인 배열
int[] score = new int[]{}; // 길이가 0인 배열
int[] score = {}; // 길이가 0인 배열
```

### 출력 
```java
int[] iArr = { 100, 95, 80, 70, 60 };
System.out.println(Arrays.toStirng(iArr)); // 배열의 모든 요소를 출력

char[] chArr = { 'a', 'b', 'c', 'd' };
System.out.println(chArr); // abcd 출력 -> println메소드로 char 배열을 출력하면 각 요소가 구분자 없이 그대로 출력된다.
```

### 복사
```java
    int[] arr = new int[]{ 100, 95, 80, 70, 60 };
    int[] tmp = new int[arr.length*2];

    for (int i = 0; i <arr.length; i++) {
        tmp[i] = arr[i];
    }
    arr = tmp; // 변수 tmp에 저장된 값을 변수  arr에 저장
    // 참조변수 arr과 tmp는 같은 배열을 가리키게 된다.
    // 전에 arr이 가리키던 배열은 더 이상 사용할 수 없다. -> JVM의 가비지 컬렉터에 의해 자동적으로 메모리에서 제거
```

- 복사는 for문보다 System.arraycopy()를 사용하는 것이 더 효율적
```java
System.arraycopy(num, 0, newNum, 0, num.length);
// num[0]에서 newNum[0]으로 num.length개의 데이터를 복사
```