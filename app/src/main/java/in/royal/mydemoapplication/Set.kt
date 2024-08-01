package `in`.royal.mydemoapplication

/*
-> You Can Create Set as mutable & immutable
-> Multiple element can not be same or Unique (Duplicate Element are not Allowed)
-> Unordered type of Data
-> Can Have as many different Elements of different DataType

   1) Immutable :-
        -> Can not be change the values once declared
        -> Operations are not allowed ex:- add , remove , update
        syntax :- setOf() , listOf<DataType>()
*/


fun main() {

//    var numSet = setOf(1,2,4,5,6,6,7,5)
//    println(numSet) // [1, 2, 4, 5, 6, 7]

//    println(numSet.add(10)) // Error
//    println(numSet.remove(10)) // Error

//    var diffElement = setOf(1,2,3,4,5,"vivek",true,4.0,3.14f)
//    println(diffElement)

//    var sameElement = setOf<Int>(1,2,3,4,5) //  only enter single Data Type element
//    println(sameElement)

//    How to Create Empty Set
//    1)
//        var emptySet = setOf("")
//        println(emptySet)

//    2)
//        var emptySet = setOf<Int>()
//        println(emptySet)


//    Methods
    var mySet = setOf(1,2,3,4,5,"vivek",4,5,4.4,4.4f)
//        1) contains(val) :- check element present or not and  return boolean value
//            println(mySet.contains(4)) // true
//            println(mySet.contains(14)) // false

//        2) size :- return length of set
//            println(mySet.size)

//        var char = ('a'..'z').toSet()
//            println(char)

//        3) toList() :- convert set into list
//            var myList = mySet.toList()
//            println(myList)

//        4) Union :- merge both set and return one set
//            var mySet1 = setOf("vivek",1,2,3,4.4,3,4.4f,true)
//            var mySet2 = setOf<Int>(2,3,4,1,5,6,7)
//            var singleSet = mySet1 union mySet2
//            println(singleSet)

//        5) Intersection :- return common out value in both set
//            var mySet1 = setOf("vivek",1,2,3,4.4,3,4.4f,true)
//            var mySet2 = setOf<Int>(2,3,4,1,5,6,7)
//            var singleSet = mySet1 intersect  mySet2
//            println(singleSet)

//        5) subtract :- take all elements left side  - those elements which are common or not common
    var mySet1 = setOf("vivek",1,2,3,4.4,3,4.4f,true)
    var mySet2 = setOf<Int>(2,3,4,1,5,6,7)
    var singleSet1 = mySet1 subtract   mySet2
    var singleSet2 = mySet2 subtract   mySet1
    println(singleSet1)
    println(singleSet2)

















}