package com.example.kotlinsgrammar.grammar


// Interface
// - 인터페이스는 약속이다 -> 니가 이것을 구현하면 너도 이 타입이다.
// - 생성자가 없다 -> 인스턴스화 시킬 수 없다 -> 설명서가 아니다.
// - 지침서 -> 인터페이스를 구현하고 싶다면 반드시 아래 기능을 구현해야한다.
// - 서로 다른 개발자가 개발할 때 협업이 편하다

// 상속이 만들어낸 특징
// - 자식 클래스는 부모 클래스의 타입이다
// - 부모 클래스는 자식 클래스의 타입이 아니다

// 상속과 다른점
// - 상속은 조상을 찾아가는 느낌
// - 인터페이스는 종의 특징

fun main (args:Array<String>) {
    val student_ : Student_ = Student_()
    student_.eat()
    student_.sleep()
}
interface Person_ {
    fun eat()
    fun sleep()
}

class Student_ : Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}

class SoccerPlay : Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}
// 상속은 물려받은 기능들을 사용 할 수 있다
// 인터페이스를 구현하는 클래스는 인터페이스가 구현하는 함수를 무조건 채워줘야한다.


open class Person() {
    open fun eat() {

    }

    open fun sleep() {

    }
}

class Student() : Person() {

}

class Teacher() : Person() {

}