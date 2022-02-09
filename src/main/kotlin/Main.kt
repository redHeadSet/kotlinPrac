import test.*

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")

    var a = MyFuns()
    a.getName()
    MyFuns("새거").getName()


//    noPackageFuns()
//    labelControl()
//    innerFun()
//    labelReturn()
}