package com.example.kotlinsgrammar.grammar




fun main() {
    // 배열을 생성하는 방법(1)
    // 인트만 들어갈 수 있는 배열을 생성함
//    var group1 = arrayOf<Int>(1,2,3,4,5)
//
//
//    // 배열을 생성하는 방법(2)
//    var group2 = arrayOf(1,2,3,3.1,"Hello")
//
//    println(group1 is Array)
//
//
//    // 배열의 값을 꺼내는 방법(1)
//    println(group1.get(0))
//    println(group2.get(2))
//
//    // 배열의 값을 꺼내는 방법(2)
//    println(group1[1])
//    println(group2[4])
//
//    // 배열의 값을 바꾸는 방법(1)
//    group1.set(0, 100)
//    println(group1[0])
//
//    // 배열이 값을 바꾸는 방법(1)
//    group1[0] = 200
//    println(group1[0])

    val arr1 = arrayOf<Int>(1,2,3)

    val number1 = arr1.get(0)
    println(number)

//    Exception 발생 : 만든 배열의 범주 안에 들어가지 않음 (배열은 2까지인데 100을 호출함)
//    호출 오류
//    val number2 = arr1.get(100)
//    변경 오류
//    arr1.set(100,100)

    // 개발할땐 명시적일수록 좋다
    val a1 = intArrayOf(1,2,3)
    val a2 = charArrayOf('b','b')
    val a3 = doubleArrayOf(1.24,123.2)
    val a4 = booleanArrayOf(true, false, true)

//    배열을 만드는 방법(4) -> lambda 를 활용하는 방식
    var a5 = Array(10,{0})
//    lambda 식에서는 수들을 , 가 아닌 ;로 구분해 줘야 한다
    var a6 = Array(5,{1;2;3;4;5})
}