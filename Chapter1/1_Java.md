## 1. 자바

### 특징

#### 1. 운영체제에 독립적이다.
- 자바 응용프로그램은 운영체제나 하드웨어가 아닌 자바가상머신(JVM)과만 통신하고 JVM이 자바 응용프로그램으로부터 전달받은 명령을 해당 운영채제가 이해할 수 있도록 변환해 전달한다.
- 작성된 프로그램은 운영체제에 독립적이지만 JVM은 운영체제에 종속적이어서 썬에서는 여러 운영체제에 설치할 수 있는 서로 다른 버전의 JVM을 제공한다.
- 자바로 작성된 프로그램은 운영체제와 하드웨어에 관계없이 실행 가능하며 '한번 작성하면, 어디서나 실행된다.(Write once, run anywhere)'라고 표현한다.

#### 2. 객체지향언어
- 상속, 캡슐화, 다형성이 잘 적용된 순수한 객체지향언어

#### 3. 비교적 배우기쉬움

#### 4. 자동 메모리 관리(Garbage Collection)
- 자바로 작성된 프로그램이 실행되면, 가비지컬렉터가 자동적으로 메모리를 관리하기 때문에 프로그래머는 메모리를 따로 관리하지 않아도 된다.

#### 5. 네트워크와 분산처리를 지원한다.
- 다양한 네트워크 프로그래밍 라이브러리(Java API)를 통해 비교적 짧은 시간에 네트워크 관련 프로그램을 쉽게 개발할 수 있도록 지원한다.

#### 6. 멀티스레드를 지원한다.
- 여러 스레드에 대한 스케줄링을 자바 인터프리터가 담당한다.

#### 7. 동적 로딩을 지원한다.
- 실행 시 모든 클래스가 로딩되지 않고 필요한 시점에 클래스를 로딩해 사용할 수 있다.
- 일부 클래스가 변경되어도 전체 애플리케이션을 다시 컴파일 하지 않아도 된다.
- 애플리케이션의 변경사항이 발생해도 비교적 적은 작업만으로도 처리할 수 있는 유연한 애플리케이션을 작성할 수 있다.

### JVM (Java Virtual Machine)
- 자바를 실행하기 위한 가상 기계 -> 실제 컴퓨터(하드웨어)가 아닌 소프트웨어로 구현된 컴퓨터 -> 컴퓨터 속의 컴퓨터
- 자바로 작성된 애플리케이션은 모두 JVM에서만 실행되기 때문에 반드시 필요하다
- 일반 애플리케이션에 비해 JVM을 한번 더 커치기 때문에 하드웨어에 맞게 완전히 컴파일된 상태가 아니고 시행 시에 해석되기 대문에 속도가 느리다는 단점이 있다. -> 바이트코드를 하드웨어 기계어로 바로 변환해주는 JIT 컴파일러와 향상된 최적화 기술 적용으로 속도의 격차를 많이 줄였다.
- 자바 애플리케이션은 JVM하고만 상호작용을 하기 때문에 OS와 하드웨어에 독립적이라 다른 oS에서도 프로그램의 변경없이 실행이 가능하다.
- 단, JVM은 OS에 종속적이기 때문에 해당 OS에서 실행가능한 JVM이 필요하다. -> Windows용 / Linux용 JVM 제공