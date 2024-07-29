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
//class ConditionStatment : ComponentActivity() {
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
    var no1 = 10
    var no2 = 11

//    1) if-else
//    if (no1 % 2 == 0){
//        println("Even")
//    }else{
//        println("Odd")
//    }


//    2) if-else if-else
//    if (no1 == no2){
//        println("Both Are Equal")
//    }else if(no1 > no2){
//        println("$no1 is bigger then $no2")
//    }else{
//        println("$no2 is bigger then $no1")
//    }

//    3) Other Way
//    var result = if (no1 == no2){
//        "Both Are Equal"
//    }else if(no1 > no2){
//        "$no1 is bigger then $no2"
//    }else{
//        "$no2 is bigger then $no1"
//    }
//    println(result)

//    4) Expression Way in if-else:-
//    var result = if (no2 %  2 == 0) "Even" else "Odd"
//    println(result)

//    5) Expression Way in if-else if-else:-
//    var result = if (no1 == no2)  "Both Are Equal" else if (no1 > no2)  "$no1 is bigger then $no2"  else  "$no2 is bigger then $no1"
//    println(result)


}