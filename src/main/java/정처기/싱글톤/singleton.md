# static public 메서드의 예시
```java
//Math.random(); 이랑 

class Math {
    .....
               
	static public double random(){
		난수를 뽑아줌;
    
		return 실수;
	}
//이상의 코드랑 같다 사실 math 뒤에 static public double가 숨겨져있다 봐도 무방
// 이걸 이해하고 그다음
}
```



변수 선언과 초기화의 이해
```java
int a = 10;

int a;
a = 10;
```
사실 저 두 코드가 같다

```java
Parent parent = new Parent();

Parent parent = null;
parent = new Parent();
```
이게 뒤에 나올 코드랑 같은 맥락임


변수 선언과 초기화의 이해를 활용한 early singleton의 구현
```java
private static Connection _inst = new Connection();

// 언제든 있고, 어디서든 쓸 수 있는, Connection type의 객체를 반환하는, get()이라는 이름의 method
static public Connection get() {
    if(_inst != null)
        return _inst;
}
```















