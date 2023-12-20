// basics
/* Creating var val
   datatypes
        Integer-byte,short,int,long
        unSigned Int- UByte,UShort,UInt,ULong
    print statements in Kotlin
        print()
        println()
    Basic Operators in kotlin
        Arithmetic Operators:
            + (Addition)
            - (Subtraction)
            * (Multiplication)
            / (Division)
            % (Modulus)

        Assignment Operators:
            = (Assigns a value to a variable)
            +=, -=, *=, /=, %= (Compound assignment operators, e.g., a += b is equivalent to a = a + b)
       Comparison Operators:
            == (Equality)
            != (Inequality)
            < (Less than)
            > (Greater than)
            <= (Less than or equal to)
            >= (Greater than or equal to)
        Logical Operators:
            && (Logical AND)
            || (Logical OR)
            ! (Logical NOT)
        Range Operator:
            .. (Creates a range)


        Bitwise Operators (Intermediate level):
            shl (Signed shift left)
            shr (Signed shift right)
            ushr (Unsigned shift right)
            and (Bitwise AND)
            or (Bitwise OR)
            xor (Bitwise XOR)
            inv (Bitwise inversion)
       Elvis Operator:
            ?: (Elvis operator, used for null safety
       Safe Call Operator:
            ?. (Safe call operator, used for safe navigation when dealing with nulls)


 */


//code
    /*
var a :Int= 10
var b :Byte= 127
var c :Short=37767
var d :Long=9,223,372,036,854,775,807((263^63)-1) //63 is power
*/
/*
BASIC OPERATORS

//ARITHMETIC OPERATIONS IN KOTLIN
fun main() {
    val num1 = 10
    val num2 = 5

    val addition = num1 + num2
    val subtraction = num1 - num2
    val multiplication = num1 * num2
    val division = num1 / num2
    val modulus = num1 % num2

    println("Addition: $addition")
    println("Subtraction: $subtraction")
    println("Multiplication: $multiplication")
    println("Division: $division")
    println("Modulus: $modulus")
}
//ASSIGNMENT OPERATORS
fun main() {
    var num = 10 // Initializing a variable

    // Assignment Operators
    num += 5 // Equivalent to: num = num + 5
    println("+= Operator Result: $num")

    num -= 3 // Equivalent to: num = num - 3
    println("-= Operator Result: $num")

    num *= 2 // Equivalent to: num = num * 2
    println("*= Operator Result: $num")

    num /= 4 // Equivalent to: num = num / 4
    println("/= Operator Result: $num")

    num %= 3 // Equivalent to: num = num % 3
    println("%= Operator Result: $num")
}

//Comparison Operators
fun main() {
    val num1 = 10
    val num2 = 5

    // Comparison Operators
    val isEqual = num1 == num2
    val notEqual = num1 != num2
    val lessThan = num1 < num2
    val greaterThan = num1 > num2
    val lessThanOrEqual = num1 <= num2
    val greaterThanOrEqual = num1 >= num2

    println("$num1 == $num2 : $isEqual")
    println("$num1 != $num2 : $notEqual")
    println("$num1 < $num2 : $lessThan")
    println("$num1 > $num2 : $greaterThan")
    println("$num1 <= $num2 : $lessThanOrEqual")
    println("$num1 >= $num2 : $greaterThanOrEqual")
}
//Logical Operators:
 fun main() {
    val num1 = 10
    val num2 = 5
    val num3 = 7

    // Logical Operators
    val andResult = (num1 > num2) && (num2 > num3)
    val orResult = (num1 > num2) || (num2 > num3)
    val notResult = !(num1 == num2)

    println("Logical AND Result: $andResult")
    println("Logical OR Result: $orResult")
    println("Logical NOT Result: $notResult")
}
//IF ELSE IF ELSE
fun main() {
    val num = 10

    if (num > 10) {
        println("$num is greater than 10")
    } else if (num < 10) {
        println("$num is less than 10")
    } else {
        println("$num is equal to 10")
    }
}
//WHEN FUNCTION
fun main() {
    val day = 3

    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }
}
//ASSIGN THE VARIABLE USING WHEN FUNCTION
fun main() {
    var day = 3

    day=when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
}

// LET US DEEP DIVE TO THE FUNCTION STAEMENTS IN KOTLIN
fun main(){
}
//simple sunction with out parameters
fun coffee(){
    println("Grain the Coffee")
    println("Add some water and let boil ")
    prinln("Add suger as  you need")
}
// with parameter
fun main(){
    coffee(1,"benny")
    coffee(-1,"jack")
    coffee(2,"Nathan")
    coffee(5,"Shree")
}
fun coffee(sugerLevel:Int,name:String){
    if(sugerLevel<0){
        println(" Invalid $name")
    }
    else if(sugerLevel in (0..1)){
        println("hello $name ")
        println("no of spoon: $sugerLevel ")

    }else{
        println("hello $name ")
        println("no of spoons: $sugerLevel ")
    }
}
*/
