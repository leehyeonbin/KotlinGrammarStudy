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

fun main(Array:String) {

    // 설명서를 통해서 실체를 만드는 방법
    // -> 인스턴스화 -> 인스턴스(객체)
    Car("V8 engine","Big")
    val bigCar = Car("V8 engine","Big")
    val bigCar1 :Car = Car("V8 engine","Big")

    var number : Int = 10
    var number1 = 20

    val superCar : SuperCar = SuperCar("good engine"," body","white")

}
