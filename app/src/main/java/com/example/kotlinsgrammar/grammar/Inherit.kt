package com.example.kotlinsgrammar.grammar


// 2번까지는 봐준다
// 두번 이상이 넘어가면 리펙토링 해라
// 리펙토링 -> 기능에는 변환이 없는 정리정돈


// 상속
// 부모로부터 설명서를 물려받는다!

fun main (args : Array<String>) {
    val superCar100 : SuperCar100 = SuperCar100()
    superCar100.drive()
    superCar100.stop()

    val bus100 : Bus100 = Bus100()
    bus100.drive()
}

// 부모 : Car100
// 자식 : SuperCar100, Bus100

// 그냥 class 로 선언을하며 private 가 기본
// open 을 해줄시 private 가 풀림
open class Car100() {
    fun drive() {

    }

    fun stop() {

    }
}

class SuperCar100() : Car100(){

}


class Bus100() : Car100() {

}