package `in`.royal.mydemoapplication

import java.sql.Date


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















