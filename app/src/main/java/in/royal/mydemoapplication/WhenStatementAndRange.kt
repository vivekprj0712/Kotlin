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
//class WhenStatmentAndRange : ComponentActivity() {
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

//    var no : Int = 7
//    var result = no in 1..5
//    var result2 = no in 1..10
//    var result3 = no in 1 until  7
//    var result4 = no in 1 until  8
//    println(result)
//    println(result2)
//    println(result3)
//    println(result4)



    //===>WHEN KEYWORD

//    1) WHEN keyword as a statement - SELECT WITHOUT ANYTHING IN RETURN  SWITCH CASE (C) / MATCH CASE(PYTHON)
//    2) WHEN keyword as an expression - Store the return into a variable , for future operation  IF/ELSE , IF/ELSE IF/ELSE

//    SYNTEX:- when (choice){
//        1 -> condition
//        2 -> condition
//        n -> condition
//        else -> "default"
//    }


//    1) When as a statement  :-

//    var num = 3
//    var spelling = ""
//    when(num){
//        1 -> spelling = "One"
//        2 -> spelling = "Two"
//        3 -> spelling = "Three"
//        4 -> spelling = "Four"
//        5 -> spelling = "Five"
//        else -> spelling = "Invalid Input"
//    }

//    2) WHEN keyword as an expression

//    var result = when{
//
//        spelling.equals("One") -> 1
//        spelling == "Two" -> 2
//        spelling.equals("Three") -> 3
//        spelling.equals("Four") -> 4
//        spelling == "Five" -> 5
//        else -> spelling
//    }
//    print(result)


//    ----------Example Using When----------------

//      1) When as a Statement

//    var x = 3
//    var y = 0
//    when(x){
//        1 -> y = 1
//        2 -> y = 2
//        else -> println("None")
//    }
//    if(x <= 2) {
//        println("X :$x")
//        println("Y :$y")
//    }

//      2) When as an Expression  January, , March, and April  September, October, November, and December
//    println("Enter Number:")
//    var a = readln().toInt() //get value for user
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
        println("In")
    }else{
        println("Out")
    }
}