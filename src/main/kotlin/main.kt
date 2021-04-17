/**
 * Documentation comment
 * You can reference things like [main] function
 * yoa can reference parameters like [args]
 * @param args
 * @author Sébastien REMY
 * */
fun main(args: Array<String>) {

    /*
    Multilines comment
     */

    // Comment
    var myAge: Int = 50
    val name: String = "Sébastien"
    val lastName = "REMY"
    val weight = 110

    println(name)

    println("I'am $myAge years old")

    myAge += 1

    println("Next year I will be $myAge years old")

    myAge -= 1

    println("$name $lastName is $myAge year old and weights $weight kg.")

    val fullName = "$lastName, $name"
    println("Full name: $fullName")

    val ageAsString = myAge.toString()
    println("Age as String : $ageAsString")

    val ageFromString = "22".toInt()
    println("Age from String : $ageFromString")

    val nameLength = lastName.length
    println ("Last Name length: $nameLength")
}