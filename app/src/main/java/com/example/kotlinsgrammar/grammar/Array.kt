package com.example.kotlinsgrammar.grammar




fun main() {
    // 배열을 생성하는 방법(1)
    // 인트만 들어갈 수 있는 배열을 생성함
    var group1 = arrayOf<Int>(1,2,3,4,5)


    // 배열을 생성하는 방법(2)
    var group2 = arrayOf(1,2,3,3.1,"Hello")

    println(group1 is Array)


    // 배열의 값을 꺼내는 방법(1)
    println(group1.get(0))
    println(group2.get(2))

    // 배열의 값을 꺼내는 방법(2)
    println(group1[1])
    println(group2[4])

    // 배열의 값을 바꾸는 방법(1)
    group1.set(0, 100)
    println(group1[0])

    // 배열이 값을 바꾸는 방법(1)
    group1[0] = 200
    println(group1[0])
}