# oop-practice
TDD(Test Driven Development)


테스트 코드를 작성하는 이유!? 
1. 문서화 역할
2. 코드에 결함을 발견하기 위함
3. 리팩토링 시 안정성 확보
4. 테스트 하기 쉬운 코드를 작성하다 보면 더 낮은 결합도를 가진 설계를 얻을 수 있음


TDD

Test Driven Development (테스트 주도 개발)
프로덕션 코드보다 테스트 코드를 먼저 작성하는 개발 방법 기능 동작을 검증 (메서드 단위)


BDD

Behavior Driven Development (행위 주도 개발) 행위에 대한 테스트 코드를 작성하는 개발 방법
유저 시나리오 동작을 검증 (시나리오 단위)
하나의 시나리오는 Given, When, Then 구조를 가짐!


-------------------------------------------------------------------------------------


# 객체 지향이란??

### 객체지향 패러다임
1. 적절한 객체에게 적절한 책임을 할당하여 서로 메세지를 주고 받으며 협력하도록 하는 것
2. 점점 증가하는 SW 복잡도를 낮추기 위해 객체지향 패러다임 대두
3. 개인적으로 생각하는 2가지 중요 포인트 - 클래스가 아닌 객체에 초점을 맞추는 것 - 객체들에게 얼마나 적절한 역할과 책임을 할당 하는지 


### 4가지 특징
1. 추상화(Abstraction) : 불필요한 부분을 제거 함으로 써 필요한, 핵심만 나타내는 것(일반화, 단순화)  - 복잡성을 낮추기 위해
2. 다형성(Polymorphism) : 다양한 형태  - 하나의 타입으로 여러 종류의 객체를 참조하는
3. 캡슐화(Encapsulation) : 객체 내부의 세부사항을 외부로부터 감추는 것  - 인터페이스만 공개해서 변경하기 쉬운 코드를 만들기 위해?
4. 상속(Inheritance) 부모로 부터 물려 받는것

### 객체지향의 5가지 설계 원칙(SOLID)
1. SRP : Single Responsibility Principle(단일 책임의 원칙)  - 하나의 책임을 가진다.
2. OCP : Open/Closed Principle(개방 폐쇄의 원칙) - 확장에는 열려있고, 변경에는 닫혀있다. 즉, 기존코드를 변경하지 않고 기능을 추가 할 수 있어야 함.
3. LSP : Leskov’s Substitution Principle(리스코프 치환의 원칙) - 상위 타입의 객체를 하위 타입의 객체로 치환해도 동작에 전혀 문제가 없어야 한다.
4. ISP : Interface Segregation Principle(인터페이스 분리의 원칙) - 많은 기능을 가진 인터페이스를 작은 단위로 분리 시킴으로써 클라이언트에게 필요한 인터페이스들만 구현하도록 한다는 개념.  - 즉, 이를 통해서 클라이언트가 사용하지 않는 기능에 의존하게 되면 예상하지 못한 문제가 발생할 수 있는데 이를 예방 할수 있다고 생각함.
5. DIP : Dependency Inversion Principle(의존성 역전의 원칙) - 의존 관계를 맺을 때 자주 변경되는 쪽이 아니라 변경이 거의 일어나지 않는 쪽에 의존하라라는 의미 - 자기보다 변하기 쉬운 것에 의존하게 되면 변화의 영향을 많이 받기 때문에 추상화된 인터페이스나 상위 클래스에게서 변화의 영항을 받지 않게 하기 위한 원칙.


### 절차지향 프로그래밍 VS 객체지향 프로그래밍 
- 책임이 한 곳에 집중되어 있는 방식(getter) - 책임이 여러 객체로 적절히 분산되어 있는 방식


### High cohesion, Loose coupling : 높은 응집도, 낮은 결합도 
 : 어떤한 변화가 생겼을 때 다른 곳에 영향을 끼치지 않는다.  
- 유지보수와 관련이 크다고 생각 유연하게 대응이 가능


### 객체지향적으로 설계 시 고려 사항
1. 도메인을 구성하는 객체에는 어떤 것들이 있는지 고민
2. 객체들 간의 관계를 고민
3. 동적인 객체를 정적인 타입으로 추상화해서 도멘인 모델일 하기
4. 협력을 설계
5. 객체들을 포괄하는 타입(클래스)에 적절한 책임을 할당
6. 구현하기


### 객체지향적 구현
 * 사칙연산 계산기 구현
 * 요구사항
 * 간단한 사칙연산을 할 수 있다.
 * 양수로만 계산할 수 있다.
 * 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.
 * MVC패턴(Model-View-Controller) 기반으로 구현한다.
