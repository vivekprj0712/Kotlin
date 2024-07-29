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
//class Operators : ComponentActivity() {
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

fun main(){
//Operators:-
//    1) Arithmetics Op :- +, -, *, /, %

    var no1 = 5
    var no2 = 3

//    println(no1 + no2)
//    println(no1 - no2)
//    println(no1.toFloat() / no2)
//    println(no1 * no2)
//    println(no1 % no2)

//    2) Relational Op:- >, <, >=, <=, ==, !=  , :-  Return Boolean Value

//    println(no1>no2)
//    println(no1<no2)
//    println(no1>=no2)
//    println(no1<=no2)
//    println(no1==no2)
//    println(no1!=no2)

//   3) Pre/Post Increment :- ++, --
    var i = 10

//    println(i++) // same as i = i + 1  :- Post Increment
//    println(i)
//    println()
//
//    println(++i) // :- Pre Increment
//    println(i)
//    println()
//
//    println(i--) // same as i = i - 1  :- Post Decrement
//    println(i)
//    println()
//
//    println(--i) // :- Pre Decrement
//    println(i)


//  4) Logical Op:- ||, &&, !

    var isDigit = false
    var isAlpha = false
    var isSpecial = true
    var isAlphNum = true

//  1) && AND :- if both are true then return true otherwise false

//    println(isDigit && isAlpha)
//    println(isDigit && isSpecial)
//    println(isSpecial && isAlphNum)


//  2) || OR :-  if any one is ture then return true otherwise false

//    println(isDigit || isAlpha)
//    println(isDigit || isSpecial)
//    println(isSpecial || isAlphNum)


//  3) ! NOT :- if true then return false and if false return true

    println(!isAlpha)
    println(!isSpecial)
    println(!!isSpecial)
















}