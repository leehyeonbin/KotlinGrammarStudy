package com.example.kotlinsgrammar.grammar



// Class

// OOP -> Object Oriented Programing (객체지향 프로그래밍)
// 객체란?
// - 이름이 있는 모든 것

// 절차지향 프로그래밍
// -> 코드를 위에서부터 아래로 실행하면 문제가 해결된다.

// 객체지향 프로그래밍의 해결 방법
// -> 객체를 생성하여 객체에게 일을 시켜서 해결한다.
// - 선수, 심판, 관중, 경기장 -> 축구 게임

// 객체를 생성하는 방법
// - 설명서가 있어야 한다


// 클래스(설명서) 만드는 방법(1)

class Car(var engine : String, var body : String) {

}

// 클래스(설명서) 만드는 방법(2)
class SuperCar {
    var engine : String
    var body : String
    var door : String

    constructor (engine: String, body: String, door : String) {
        this.engine = engine
        this.body = body
        this.door = door
    }

}

// 클래스(설명서) 만드는 방법(3) -> 1번 방법의 확장
class Car1 (var engine: String, var body: String) {
    var door : String = ""

    // 생성자
    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법(4) -> 2번 방법의 확장
class Car2 {
    var engine :String = ""
    var body : String = ""
    var door : String = ""

    constructor(engine: String, body: String){
        this.engine = engine
        this.body = body
    }
    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunableCar (engine: String, body: String) {

    fun ride() {
        println("탑승")
    }

    fun drive() {
        println("달립니다.")
    }

    fun navigation(destination : String) {
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

class RunableCar2 {
    var engine : String
    var body : String

    // 객체 생성 시 가장 먼저 만들어지는 부분 (초기 세팅과 같은 부분에서 사용)
    init {
        println("RunableCar2 가 생성되었습니다.")
    }
    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }
    fun ride() {
        println("탑승")
    }

    fun drive() {
        println("달립니다.")
    }

    fun navigation(destination : String) {
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

// 오버로딩
class TestCalls() {

    fun test(a : Int) {
        println("up")
    }
    fun test(a : Int, b : Int) {
        println("down")
    }
}

fun main() {

    // 설명서를 통해서 실체를 만드는 방법
    // -> 인스턴스화 -> 인스턴스(객체)
    Car("V8 engine","Big")
    val bigCar = Car("V8 engine","Big")
    val bigCar1 :Car = Car("V8 engine","Big")

    var number : Int = 10
    var number1 = 20

    val superCar : SuperCar = SuperCar("good engine"," body","white")

    val runableCar : RunableCar = RunableCar("Simple engine", "small body")

    // 인스턴스가 가지고 있는 기능을 사용하는 방법
    runableCar.ride()
    runableCar.navigation("부산")
    runableCar.drive()

    // 인스턴스의 멤버 변수에 접근하는 방법

    val runableCar2 : RunableCar2 = RunableCar2("nice engine", "long body")
    println(runableCar2.engine)
    println(runableCar2.body)

    val testCalls : TestCalls = TestCalls()

    // 오버로딩
    // -> 이름이 같지만 받는 파라미터가 다른 함수
    testCalls.test(1)
    testCalls.test(1,2)
}
