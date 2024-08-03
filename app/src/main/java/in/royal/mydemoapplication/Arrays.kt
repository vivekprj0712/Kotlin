package `in`.royal.mydemoapplication

/*
        Arrays:-
           -> It used to store same multiple values of same DataType
           -> Fixed Size
           -> Simple Object to store multiple values
           Syntax :- arrayOf()
 */
fun main() {

    val arr = arrayOf("One" ,"Two" ,"Three" ,"Four" ,"Five")
    println(arr) // print object

    // how to print array element
    for (i in arr){
        println(i)
    }

    // how to print array element with index
    for ((index , element) in arr.withIndex()){
        println("$index = $element")
    }

    //How to access element
//    println(arr[1])
//    println(arr[10]) // exception

//    println(arr.get(2))
//    println(arr.get(10)) // exception

    //how to change value
//    arr[0] = "vivek"
//    println(arr[0])

     // using set()
//    arr.set(1,"vivek")
//    println(arr[1])

    // How to display array size
//        println(arr.size)



}