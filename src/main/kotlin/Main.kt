fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")

    var a: Int = 1
    val b = 2
    var c: Int = 2
    var d = 5

    val s1 = "a is $a"
    a = 5
    val s2 = "${s1.replace("is", "was")}, but now is $a"

    var any : Any = "sbbbdk"
}

fun sum1(a: Int, b: Int) : Int{
    return a+b;
}

fun sum2(a: Int, b:Int) = a+b

fun max(a:Int, b:Int):Int = if(a>b) a else b

fun nullableFunc(str:String):Int?{
    return null
}

fun desc(any: Any): String =
    when (any) {
        1 -> "Int"
        "Hello" -> "Hello"
        is Long -> "Long"
        is String -> "String"
        !is String -> "not String"
        else -> "unknown"
    }

fun range(){
    val x = 3
    if (x in 1..10) {
        println("in")
    }

    for(y in 1..5){
        print(y)
    }
}