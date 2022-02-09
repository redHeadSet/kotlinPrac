package test

public class MyFuns constructor(name:String = "default") {
    val name = name

    init {
        println("$name MyFuns init!")
    }

    fun getName() {
        println("$name")
    }

    fun stringEdit(s1: String, s2: String) {
        println("s1 is $s1")
        println("s2 is $s2")
        println("${s1.uppercase()} is s1 uppercase")
        println("${s2.replace("a", "K")} is s2 replace")
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

        var arr1: Array<Int> = arrayOf(1, 2, 3, 4, 5)
        var arr2 = listOf<String>("abc", "가나다", "ABC")
        for (each in arr1) {
            print(each)
        }
    }

    fun setCheck() {
//    val items = setOf<String>("apple", "banana", "kiwi")
        val items = setOf("apple", "banana", "kiwi")
        when {
            "apple" in items -> print("apple in")
            "orange" in items -> print("orange?")
        }
    }

    fun useIt(){
        val fruits = listOf("banana", "avocado", "apple", "kiwi")
        fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.uppercase() }
            .forEach { print(it) }
    }

    fun printNums() {
        var doubleData1 : Double = 123.4e-2
        var doubleData2 : Double = 123.4e2
        println(doubleData1)
        println(doubleData2)

        val oneMill = 1_000_000
        println(oneMill)
    }

    fun checkIdAndEq(){
        // 인텔리제이에서 tools-kotlin-show kotlin bytecode 로 확인 가능
        // 바이트 코드를 Decompile 로 java 코드를 얻을 수 있음
        // 해당 소스가 primitive type 인지, boxing 타입인지 확인 가능
        val a:Int = 10000
        val b:Int = 10000
        val c:Int? = 10000 // nullable 은 boxing 타입
        println("a === b : ${a === b}")
        println("a == b : ${a == b}")

        println("a === c : ${a === c}")
        println("a == c : ${a == c}")
    }

    fun makeArray() {
        var arr = Array(5, {i -> i.toString()})
        for (each in arr) {
            println(each) // 0,1,2,3,4
        }
    }

    fun useWhen(any: Any, numberList: List<Int> = listOf(9,10,11)):Any =
        when (any) {
            0,1 -> "is 0 or 1"
            3+1 -> println("is 4")
            in 4..8 -> println("data 4..8")
            in numberList -> "in number list"
            else -> "else"
        }

    fun useLoopIndex(){
        val arr = arrayOf(1, 2, 3, 4)

        // use indices
        for(i in arr.indices){
            println("$i data is [${arr[i]}]")
        }

        // use index-value
        for ((index, value) in arr.withIndex()) {
            println("with index ver. $index data is $value")
        }
    }
}