package `in`.royal.mydemoapplication


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
//fun main() {

//    var numList = listOf(1,2,3,4,5,5)
//    println(numList)  // [1, 2, 3, 4, 5, 5]

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

//    var char = ('a'..'z').toList()
//    println(char)

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

//}



//        2) Mutable
//            -> Can be change the values once declared
//            -> We can perform read as well as write operation on the list.
//                syntax:- mutableListOf()

fun main() {

//    var diffElement = mutableListOf(1,2,3,4,5.5,5.5f,"vivek",true)
//    println(diffElement)

//    var sameElement = mutableListOf<String>("vivek","rock","roman")
//    println(sameElement)

    //Method:-
    val myList = mutableListOf(11, 44, 22, 33, 44, "vivek", 44.44, 55.55f, true)
//        1) add(val):- add element at last
//                myList.add("roman")
//                println(myList) // [11, 44, 22, 33, 44, vivek, 44.44, 55.55, true, roman]

//        2) remove(val) :- remove element
//                myList.remove(44); // only remove first occurrence value (if same value existing multiple time)
//                myList.remove(22)
//                println(myList)

//        3) get(Index) :- fetch value
//                println(myList.get(3)) // 33
//                println(myList.get(15)) // error

//        4) [] :- fetch value
//                println(myList[3])
//                println(myList[15]) // error

//        5) update the value:-
//                myList[1] = 12
//                println(myList)


//        6) set(index , value) :- update the value
//                myList.set(2,66);
//                println(myList)

//        7) contains(value) :- check value is exists or not in the list
//    println(myList.contains(44)) // true
//    println(myList.contains(0)) // false
}
