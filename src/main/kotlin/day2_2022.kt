import java.io.File

fun main(args: Array<String>){
    println("Reading from file...")
    var points = 0
    var counter = 0

    val file = File("/home/shifu/Documents/ideaProjects/adventofcode_D2_2022/src/main/kotlin/input_day2_2022.txt")


    file.forEachLine { line ->
        counter++
        println("Reading line: $line")

        //Check first and second character
        val firstCharacter = line[0]
        val secondCharacter = line[2]


        //Handle comparison
        when
        {
            (firstCharacter == 'A' && secondCharacter == 'Z') -> {
                points += (2 + 6)
                println("You won")
            }
            (firstCharacter == 'A' && secondCharacter == 'X') -> {
                points += (3 + 0)
                println("A draw")
            }
            (firstCharacter == 'A' && secondCharacter == 'Y') -> {
                points += (1 + 3)
                println("You won")
            }
            (firstCharacter == 'B' && secondCharacter == 'Y') -> {
                points += (2 + 3)
                println("A draw")
            }
            (firstCharacter == 'B' && secondCharacter == 'X') -> {
                points += (1 + 0)
                println("You lost")
            }
            (firstCharacter == 'B' && secondCharacter == 'Z') -> {
                points += (3 + 6)
                println("A win")
            }
            (firstCharacter == 'C' && secondCharacter == 'Y') -> {
                points += (3 + 3)
                println("You lost")
            }
            (firstCharacter == 'C' && secondCharacter == 'X') -> {
                points +=( 2 + 0)
                println("You won")
            }
            (firstCharacter == 'C' && secondCharacter == 'Z') -> {
                points += (1 + 6)
                println("A draw")
            }

            (firstCharacter == ' ' || secondCharacter == ' ') -> {
                println("This is weird")
            }



        }
    }
    println("Total points scored: $points")
    println("Total lines scanned: $counter")


}


