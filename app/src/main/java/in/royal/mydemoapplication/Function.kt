package `in`.royal.mydemoapplication


//----------------Function---------------------------

//SYNTAX:- fun fun_name(para1, para2,...,paraN): Return Type{
// Block Of Statement
// Return Result
//}



//    fun main(){
//       var result: String =  makeCoffee(3)   // Argument
//        println(result)
//    }

//    fun makeCoffee(sugarCount: Int) : String{   // Parameters
//        if(sugarCount == 1){
//            return "$sugarCount spoon of sugar"
//        }else{
//            return "$sugerCount spoons of sugar"
//        }
//    }


//fun main(){
//   var result =  addition(10,20);
//    println("Sum :${result}")
//}

//fun  addition(no1: Int , no2: Int) : Int{
//    var sum = no1 + no2;
//    return sum
//}

//Short Way:-

//fun addition(no1 : Int , no2 : Int ) = no1+no2



//Default Argument
// fun main(){
//
//     var sum =  addition(10,20)
//     var sum2 = addition()
//     println("Sum : $sum")
//    println("Sum2 : $sum2")
// }
//
//fun addition(no1 : Int = 20 , no2 : Int = 30) = no1 + no2




//Function Overloading

//fun main() {
//    var result1 = addition(10,20)
//    var result2 = addition(10.0,20.0)
//    var result3 = addition(no2 = 10, no3 = 20, no1 = 30)  // Named Arguments
//
//    println("Result1 : $result1")
//    println("Result2 : $result2")
//    println("Result3 : $result3")
//
//}
//fun addition(no1 : Int , no2 : Int ) = no1 + no2
//fun addition(no1 : Int , no2 : Int , no3 : Int) = no1 + no2 + no3
//
//fun addition(no1 : Double , no2 : Double) = no1 + no2



// Store Function in Variable

fun main() {
    var fun1 = :: addition // store function in variable
    var result = fun1(10,20)
    print("Sum Is $result")
}

fun addition(no1 : Int , no2 : Int ) = no1 + no2
