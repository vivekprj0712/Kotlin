package `in`.royal.mydemoapplication

import java.sql.Date


// Print Hello World and Name in kotlin
// fun main() is Entry Point
fun main(){
    println("Hello World") // print msg and cursor got to the next line
    print("Vivek ") // print msg and cursor not got to the next line
    print("Prajapati")
}










//fun  main(){
//    var userChoice = ""
//    var computerChoice = ""
//    var result = ""
//    println("Please Enter User Choice : Rock, Paper, Scissors")
//    userChoice = readln()
//    println("User Choice This $userChoice")
//
//    var randomChoice = (1..3).random()
//    if(randomChoice == 1){
//        computerChoice = "Rock"
//    }else if (randomChoice == 2){
//        computerChoice = "Paper"
//    }else{
//        computerChoice = "Scissors"
//    }

    //  ------------  using if else  --------------

//    if(userChoice == computerChoice){
//        println("Match Tie")
//    }else if((userChoice == "Rock" && computerChoice == "Scissors") || (userChoice == "Paper" && computerChoice == "Rock") || (userChoice == "Scissors" && computerChoice == "Paper") ) {
//        println("User Winner")
//    }else{
//        println("Computer Winner")
//    }



//===>WHEN KEYWORD

//    1) WHEN keyword as a statement - SELECT WITHOUT ANYTHING IN RETURN  SWITCH CASE (C) / MATCH CASE(PYTHON)
//    2) WHEN keyword as an expression - Store the return into a variable , for future operation  IF/ELSE , IF/ELSE IF/ELSE

//    SYNTEX:- when (choice){
//        1 -> condition
//        2 -> condition
//        n -> condition
//        else -> "default"
//    }



//   --------------- Using When ---------------
//    1)When Keyword as a Statement
//    when (randomChoice){
//        1 ->  computerChoice = "Rock"
//        2 ->  computerChoice = "Paper"
//        3 ->  computerChoice = "Scissors"
//    }

//    2) When Keyword as an expression

//        result = when{
//            userChoice == computerChoice -> "Match Tie"
//            ((userChoice == "Rock" && computerChoice == "Scissors") || (userChoice == "Paper" && computerChoice == "Rock") || (userChoice == "Scissors" && computerChoice == "Paper")) -> "User Winner"
//            else -> "Computer Winner"
//        }
//    println("Computer has Chosen this $computerChoice")



//    ----------Example Using When----------------

//1) When as a Statement

//    var x = 3
//    var y = 0
//    when(x){
//        1 -> y = 1
//        2 -> y = 2
//        else -> println("None")
//    }
//    if(x < 2) {
//        println("X :$x")
//        println("Y :$y")
//    }

//2) When as an Statement   January, , March, and April  September, October, November, and December
//    println("Enter Number:")
//    var a = readln().toInt()
//    var result = ""
//    result = when {
//        a == 1 -> "January"
//        a == 2 -> "February"
//        a == 3 -> "March"
//        a == 4 -> "April"
//        a == 5 -> "May"
//        a == 6 -> "June"
//        a == 7 -> "July"
//        a == 8 -> "August"
//        a == 9 -> "September"
//        a == 10 -> "October"
//        a == 11 -> "November"
//        a == 12 -> "December"
//        else -> "Wrong Number"
//    }
//
//    println(result)




//  -----------Using While Loop---------------
//    var userChoice = ""
//    var computerChoice = ""
//    var result = ""
//    var a = -1
//
//    while(true){
//        println("Please Enter User Choice : Rock, Paper, Scissors")
//        userChoice = readln()
//        when (userChoice){
//            "Rock" -> a = 1
//            "Paper" -> a =  2
//            "Scissors" -> a = 3
//        }
//        if ( a != -1 ){
//            break
//        }else{
//            println("Please Enter Valid Choice: Rock, Paper, Scissors")
//        }
//
//    }
//    println("User Choice This $userChoice")
//    var randomChoice = (1..3).random()
//    when (randomChoice){
//        1 ->  computerChoice = "Rock"
//        2 ->  computerChoice = "Paper"
//        3 ->  computerChoice = "Scissors"
//    }
//    println("Computer has Chosen this $computerChoice")
//    result = when{
//        userChoice == computerChoice -> "Match Tie"
//        ((userChoice == "Rock" && computerChoice == "Scissors") || (userChoice == "Paper" && computerChoice == "Rock") || (userChoice == "Scissors" && computerChoice == "Paper")) -> "User Winner"
//        else -> "Computer Winner"
//    }
//
//    println(result)

//}

//----------------Function---------------------------

//    fun main(){
//       var result: String =  makeCoffee(3)
//        println(result)
//    }
//    fun makeCoffee(sugarCount: Int) : String{
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


//constructor
//val/var keyword -> Properties
//without this keyword -> parameters
//class  cat (){
//
//}
//fun main(){
//   var result =  addition(10,20);
//    println("Sum :${result}")
//}




//constructor - Primary constructor

// val/var keyword - properties
// without this keywords - parameters

// Primary Constructor values
// default values in constructor
//class Cat (val name: String, var breed: String, var age: Int = 3){
//
//    init {
//        meow()
//        breed = "DogType"
//    }
//
//    fun meow() {
//        println("$name of type $breed and age is $age")
//    }
//}

//fun main() {
//    // use Round brackets when creating an object
//    var catObj = Cat("Daisy", "CatType", 3)
//    // println(catObj) // memory address
//    // catObj = error
//    println(catObj.meow())
//
//    println("A year has passed")
//    catObj.age = 4
//
//    println("This cats name is ${catObj.name}")
//    println("This cats breed is of type ${catObj.breed}")
//    println("Cats age is ${catObj.age}")
//
//    println(catObj.meow())
//
//}




//Example of Book using class
class  Book(val title : String = "Unknown", val author : String = "Anonymous" ,  val publishedYear : Int = 2024 ){

}
//
//fun main(){
//    var book = Book();
//    println("Title : ${book.title}");
//    println("Author : ${book.author}");
//    println("Year : ${book.publishedYear}");
//    var customBook = Book("Kotlin","Vivek",2023);
//    println("Title : ${customBook.title}");
//    println("Author : ${customBook.author}");
//    println("Year : ${customBook.publishedYear}");
//
//}




//-----------------Difference Between Class And Data Class-----------------
//1. class :- totally customisable , can hold data and their functions or methods also their behavior
//1. data class :- it is less customisable , only can hold data , can create custom function but not suggested.

//2. class :- can have zero properties and parameters inside the constructor
//2. data class :- at least 1 property or parameters is required


//3. class :- does not provide function such as equals() , copy() , toString() , etc...
//3. data class :-provide direct function such as equals() , copy() , toString() , etc...

//4. class :- if toString() fun used on class objects , obj is required.
//4. data class :- if toString() is used on data class objects , proper string formatted object will be returned.


// data class syntax:-
//data class AskCoffeeDetails(val name : String , val sugarCount : Int)
//
//fun main(){
//    var coffee = AskCoffeeDetails("Vivek",7)
//    var coffeeSecond = AskCoffeeDetails("Sahil" , 5)
//    var coffeeThird = AskCoffeeDetails("Sahil" , 5)
//    var book = Book("Java","Vivek",2024)

    //Methods:-
//    1)toString()
//        println("coffee.toString :${coffee.toString()}") //coffee.toString :AskCoffeeDetails(name=Vivek, sugarCount=7)
//        println("coffeeSecond.toString :${coffeeSecond.toString()}") //coffeeSecond.toString :AskCoffeeDetails(name=Sahil, sugarCount=5)
//        println("coffeeThird.toString :${coffeeThird.toString()}") //coffeeThird.toString :AskCoffeeDetails(name=Sahil, sugarCount=5)
//        println("book.toString :${book.toString()}")  //book.toString :in.royal.mydemoapplication.Book@59a6e353

//    2)equals
//        println("Objects are Equals : ${coffeeThird == coffeeSecond}") //true
//        println("Objects are Equals : ${coffee == coffeeSecond}")  //false
//        println("Objects are Equals : ${coffee.equals(coffeeSecond)}")  //false
//        println("Objects are Equals : ${coffeeThird.equals(coffeeSecond)}") //true

//    3)hashCode
//        println("hashCode of Coffee : ${coffee.hashCode()}") //hashCode of Coffee : -1732274882
//        println("hashCode of CoffeeSecond : ${coffeeSecond.hashCode()}") //hashCode of CoffeeSecond : -1825963704
//        println("hashCode of CoffeeThird : ${coffeeThird.hashCode()}") //hashCode of CoffeeThird : -1825963704

//    4)copy()
//        var obj = coffee.copy(name="Royal");
//        println(obj.toString()) //AskCoffeeDetails(name=Royal, sugarCount=7)
//
//        // makeCoffee(coffee)
//}
//fun makeCoffee(coffeeType : AskCoffeeDetails){
//    if(coffeeType.sugarCount == 1){
//        println("SugarCount is ${coffeeType.sugarCount} in coffee for ${coffeeType.name}")
//    }
//    else{
//        println("SugarCount is ${coffeeType.sugarCount} in coffee for ${coffeeType.name}")
//    }
//}




//Multi Line Comment
/*
    Multi Line Comment
*/



