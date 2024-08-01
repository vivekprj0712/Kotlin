package `in`.royal.mydemoapplication
/*
// Dictionary (Map):-
    -> key Value Pair
    -> key name always be unique but value can be duplicate
    -> key -> will always be associated to a single value

        1) Immutable:-
         -> cannot be change the size once defined
         -> Operations are not allowed ex:- add , remove , update
         syntax:- mapOf()
 */

fun main() {
    var myMap = mapOf(
        "One" to 1,
        "Two" to 2,
        "Three" to 3
        )
//    println(myMap) // {one=1, Two=2, Three=3}

//    how to check all keys of the map
//    println(myMap.keys)

//    how to check all values of the map
//    println(myMap.values)

//    how to fetch value of the map
//    println(myMap.get("One"))
//    println(myMap["One"])

//    println(myMap.get("Five")) // null
//    println(myMap["Five"]) // null

//    println(myMap.getOrDefault("Two",0)) // 2
//    println(myMap.getOrDefault("Five",5)) // 5

//    println(myMap.getValue("Two")) // 2
//    println(myMap.getValue("Five"))  // Exception

}

