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

//fun main() {
//    var myMap = mapOf(
//        "One" to 1,
//        "Two" to 2,
//        "Three" to 3
//        )
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

//}


//     2) mutable:-
//      -> can be change the size once defined
//      -> Operations are allowed ex:- add , remove , update
//      syntax:- mutableMapOf()
fun main() {

    val sameMap = mutableMapOf(
        1 to "Sun",
        2 to "Mon",
        3 to "Tue",
        4 to "Wen",
        5 to "Thu",
        6 to "Fri",
        7 to "Sat"
    )
    println(sameMap)

    println(sameMap.keys)
    println(sameMap.values)

    // how to access values
    println(sameMap[1]) // Sun
    println(sameMap[10]) // null

    for (index in 1 until sameMap.size + 1){
        println(sameMap[index])
    }

    // how to change value
    sameMap[1] = "Sunday"
    println(sameMap)

    // how to add values
    sameMap[8] = "Nothing"
    println(sameMap)

    // how to remove
    sameMap.remove(8)
    sameMap.remove(10) // no error
    println(sameMap)


    val diffMap = mutableMapOf(
            1 to "Sun",
            "Two" to "Mon"
        )
    println(diffMap)
}