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
//class ConstAndClass : ComponentActivity() {
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


//constructor
//val/var keyword -> Properties
//without this keyword -> parameters
//class  cat (){
//
//}



//constructor - Primary constructor

// val/var keyword - properties
// without this keywords - parameters

// Primary Constructor values
// default values in constructor
class Cat (val name: String, var breed: String, var age: Int = 3){

    init {
        meow()
        breed = "DogType"
    }

    fun meow() {
        println("$name of type $breed and age is $age")
    }
}

fun main() {
    // use Round brackets when creating an object
    var catObj = Cat("Daisy", "CatType", 3)
    // println(catObj) // memory address
    // catObj = error
    println(catObj.meow())

    println("A year has passed")
    catObj.age = 4

    println("This cats name is ${catObj.name}")
    println("This cats breed is of type ${catObj.breed}")
    println("Cats age is ${catObj.age}")

    println(catObj.meow())

}




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
