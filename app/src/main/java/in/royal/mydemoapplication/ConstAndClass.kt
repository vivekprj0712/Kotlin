package `in`.royal.mydemoapplication

/*
    class :-
        -> class is a blueprint or template
        -> Object are the real thing
        -> You Create Objects in Your program and they interact with each other to complete the work.
        Syntax:- class class_name(property){}
 */

//class Car( val name : String , val type : String , val kmRan : Int )  // properties
//{
//    fun driverCar(){   // method
//        println("$name is driving...")
//    }
//
//    fun applyBrakes(){
//        println("Applied Brakes...")
//    }
//}
//
//
//fun main() {
//    val mustang = Car("Mustang" , "Petrol" , 100)
//    val beetle = Car("Beetle" , "diesel" , 200 )
//
//    println("Name :   ${mustang.name} \nType : ${mustang.type}  \nKmRan : ${mustang.kmRan} ")
//    mustang.driverCar()
//    mustang.applyBrakes()
//
//    println()
//
//    println("Name :   ${beetle.name} \nType : ${beetle.type}  \nKmRan : ${beetle.kmRan} ")
//    beetle.driverCar()
//    beetle.applyBrakes()
//}


//-----------Second Example---------------

//class Person(val name : String , val age : Int){
//    fun canVote() : Boolean{
//        return age >= 18;
//    }
//}
//fun main(){
//
//    val p1 = Person("Vivek" ,  21)
//    val p2 = Person("Jay" , 17)
//
//    if(p1.canVote()){
//        println("Person 1 Is Eligible for Vote")
//    }else{
//        println("Person 1 Is not Eligible for Vote")
//    }
//
//    if(p2.canVote()){
//        println("Person 2 Is Eligible for Vote")
//    }else{
//        println("Person 2 Is Not Eligible for Vote")
//    }
//}





/*
        constructor :-
        Types :- 1) Primary     2) Secondary
        -> it is used to initialize object & provide a default values to properties
        val/var keyword -> Properties
        without this keyword -> parameters
 */

    // 1) Primary Constructor
//  i)
//class autoMobile(val name : String , val tyres : Int , val maxSeating : Int ){
//    fun drive(){
//
//    }
//    fun applyBrakes(){
//
//    }
//}
//fun main() {
//    val car = autoMobile("car" , 4 , 5)
//
//}

// ii)
//class Person(nameParam : String , ageParam : Int){
//    var name : String = nameParam + " Prajapati"
//    var age : Int = ageParam
//    var isEligible : Boolean = age > 17
//}
//
//fun main() {
//    val person = Person("Vivek" , 21)
//    println(person.name)
//    println(person.age)
//    println(person.isEligible)
//}

// iii)
//class autoMobile(val name : String , val tyres : Int , val maxSeating : Int , hashAirBags : Boolean){
//
////    You can write multiple init block
//    init {
//            println("$name is Created")
//    }
//    var isAirBags = hashAirBags
//    fun drive(){
//    }
//    fun applyBrakes(){
//
//    }
//}
//fun main() {
//    val car = autoMobile("car" , 4 , 5 , true)
//    println(car.isAirBags)
//}

//        2) Secondary Constructor

//class autoMobile(val name : String , val tyres : Int , val maxSeating : Int  , val engineType : String){
//
////    You can write multiple init block
//
//    constructor(nameParam : String , engineParam : String) : this (nameParam , 4 , 5 , engineParam)
//
//    init {
//            println(" Name : $name \n Tyres : $tyres \n MaxSeating : $maxSeating \n EngineType : $engineType")
//    }
//}
//fun main() {
//    val car = autoMobile("car" , "Petrol")
//}



// Example of Cat using Class & Init
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
//
//fun main() {
//    // use Round brackets when creating an object
//    var catObj = Cat("Daisy", "CatType", 5)
//     println(catObj) // memory address
////     catObj = error
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
//



//Example of Book using class
//class  Book(val title : String = "Unknown", val author : String = "Anonymous" ,  val publishedYear : Int = 2024 ){
//
//}

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
