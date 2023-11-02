import java.util.Scanner

fun rand(start: Int, end: Int): Int {
    require(start <= end) { "Illegal Argument" }
    return (start..end).random()
}

fun main() {
    var start = 1
    var end = 3
    var CPU = rand(start, end)
    val scan = Scanner(System.`in`)
    var HUM:Int = scan.nextInt()
    println("Enter 1 for rock, 2 for paper and 3 for scissors: ")
    println("You:" + HUM)
    println("CPU:" + CPU)
    if (CPU == 1) {
        if (HUM == 1)
        {
            println("The CPU chose rock!")
            println("It is a tie!")
        }
        else if (HUM == 2)
        {
            println("The CPU chose paper!")
            println("It is a tie!")

        }
        else if (HUM == 3)
        {
            println("The CPU chose scissors!")
            println("It is a tie!")
        }
        else
        {
            println("Wrong option! Type 1 for rock, 2 for paper and 3 for scissors!")
        }
    }
    else if (CPU == 2) {
        if (HUM == 1)
        {
            println("The CPU chose paper!")
            println("Game over! Paper beats rock!")

        }
        else if (HUM == 2)
        {
            println("The CPU chose scissors!")
            println("Game over! Scissors beat paper!")

        }
        else if (HUM == 3)
        {
            println("The CPU chose rock!")
            println("Game over! Rock beats scissors!")
        }
        else
        {
            println("YWrong option! Type 1 for rock, 2 for paper and 3 for scissors!")
        }
    }
    else if (CPU == 3) {
        if (HUM == 1) {
            println("The CPU chose scissors!")
            println("You win! You got luck from this game! Rock beats scissors!")

        }
        else if (HUM == 2) {
            println("The CPU chose rock!")
            println("You win! You got luck from this game! Paper beats rock!")
        }
        else if (HUM == 3) {
            println("The CPU chose paper!")
            println("You win! You got luck from this game! Scissors beat paper!")

        }
        else {
            println("Wrong option! Type 1 for rock, 2 for paper and 3 for scissors!")

        }

    }

}