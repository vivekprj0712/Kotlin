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
//class VariablesAndDataTypes : ComponentActivity() {
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


fun main() {
//    var :- var can be reassigned
    var no = 5
    println(no)

    no = 10
    println(no)


    //val :- val cannot be reassigned
    val no2 = 5
    println(no2)

//    no2 = 10 // error


// Data Types :-

//    1) Integer(Byte, Short, Int, Long)
//    2) Floating Point(Float, Double)
//    3) Boolean(True, False)
//    4) Character(Char, String)


    var score : Int = 10
    println(score)

    var temperature : Double = 30.5
    println(temperature)

    var isDigit : Boolean = true
    println(isDigit)

    var msg : String = "Vivek"
    println(msg)

    var pie : Float = 3.14f
    println(pie)

}