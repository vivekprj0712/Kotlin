package `in`.royal.mydemoapplication

//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import `in`.royal.mydemoapplication.ui.theme.MyDemoApplicationTheme
//
//class DataClass : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            MyDemoApplicationTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MyDemoApplicationTheme {
//        Greeting("Android")
//    }
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