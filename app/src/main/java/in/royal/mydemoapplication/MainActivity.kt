//package `in`.royal.mydemoapplication
//
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
//class MainActivity : ComponentActivity() {
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
//        Greeting("Vivek")
//    }
//}

fun main(){

//    println("Enter No1 :")
//    val no1 = readln()
//    val no2 = no1.toInt()
//    val multiplier = 10
//    println("Multiplier of ${no1} * ${multiplier} : ${no2 * multiplier}")


    //range
//    1)
    val myAge = readln().toInt()

    if(myAge in 21..40){
        println("In")
    }else{
        println("Out")
    }

//    2)
    val myRange = 21..40
    if(myRange.contains(myAge)){

    }
}















