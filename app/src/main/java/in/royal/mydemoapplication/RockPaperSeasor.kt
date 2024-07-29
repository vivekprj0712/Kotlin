package `in`.royal.mydemoapplication

import java.sql.Date


fun  main(){
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

}















