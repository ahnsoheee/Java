## 다차원 배열

### 배열 생성

```java
int [][] score = new int[4][3];
```

### 가변 배열
- 다차원 배열을 생성할 때 전체 배열 차수 중 마지막 차수의 길이를 지정하지 않고, 추후에 각기 다른 배열을 생성함으로써 보다 유동적인 가변 배열로 구성할 수 있다.

```java
int [][] score = new int[5][];
score[0] = new int[4];
score[1] = new int[2];
score[2] = new int[3];
score[3] = new int[3];
score[4] = new int[2];

```

-[예제 1](https://github.com/ahnsoheee/Java/blob/main/Chapter5/MultiArrEx1.java)
-[예제 2](https://github.com/ahnsoheee/Java/blob/main/Chapter5/MultiArrEx2.java)
-[예제 3](https://github.com/ahnsoheee/Java/blob/main/Chapter5/MultiArrEx3.java)
-[예제 4](https://github.com/ahnsoheee/Java/blob/main/Chapter5/MultiArrEx4.java)