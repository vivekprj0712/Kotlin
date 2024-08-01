package `in`.royal.mydemoapplication

import kotlinx.coroutines.processNextEventInCurrentThread

/*
-> You Can Create List as mutable & immutable
-> Ordered Collection
-> Multiple element can be same or not Unique (Duplicate Element are Allowed)
-> Can Have as many different Elements of different DataType

   1) Immutable :-
        -> Can not be change the values once declared
        -> Operations are not allowed ex:- add , remove , update
        syntax :- listOf() , listOf<DataType>()
*/
fun main() {

    var numList = listOf(1,2,3,4,5,5)
    println(numList)  // [1, 2, 3, 4, 5, 5]

//    println(numList.add(10)) //Error
//    println(numList.remove(1)) //Error

//    -> fetch value in numList
//    println(numList.get(2))  // 3
//    println(numList[2])  // 3

//    println(numList[10])  // error
//    println(numList.get(10))  // error

//    println(numList.getOrNull(10)) // null

//    println(numList.indexOf(3)) // return Index (2)
//    println(numList.indexOf(10)) // if value does not existing then return Index -1

//    var range = 0..10
//    println(range)  // 0..10

//    var range = (0..10).toList()
//    println(range)  // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    var char = ('a'..'z').toList()
    println(char)

//    var diffElement = listOf(1,2,3.0,3.14f,4,"Five",true)
//    println(diffElement)   // [1, 2, 3.0, 3.14, 4, Five, true]

//    var sameElement = listOf<Int>(1,2,3,4,5,6)   // only enter single Data Type element
//    println(sameElement)


    //How to Create Empty List
//    1)
//    var emptyList = listOf<Int>()
//    println(emptyList)  // []

//    2)
//    var emptyList = listOf("")
//    println(emptyList)  // []

}