import test.*

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")

//    var a : String? = null
//    var b = a?.length
//    println(b)
//    if(b == null){ a = "hello" }
//    var c = a?.length ?: 1
//    println(c)

    val list = listOf("1234", "abcd", "가나다라", "몰라", "TTTTT")
    val listSeq = list.asSequence();
    val result = listSeq.filter {
        it.length > 3
    }.map{
        it.length
    }.toList()

    for (each in result)
        print(each)

    // 클래스 사용 시 초기화 선택적으로 가능
//    var dataclass1 = DataClassTest()
//    var dataclass2 = DataClassTest(8, 30L, "굳")
//    var dataclass3 = dataclass2.copy(inD1 = 9)  // 복사 후 일부 변경 가능
//    var dataclass4 = DataClassTest(inD3 = "선택 초기화")
//    var dataclass5 = DataClassTest(inD3 = "50", inD1 = 50)
//    println("${dataclass2.inD5}")
//    println("${dataclass3.inD5}")
//
//    // 데이터 destructuring 가능 -> componentN 함수가 있어서 가능
//    var(inD1, inD3) = dataclass2
//    println("$dataclass2 destructuring : $inD1, $inD3")
//
//    // Data 클래스인데, Standard 라이브러리에서 제공 : Pair, Triple
//    var stdLibDataPair = Pair("abc", 123)
//    println("$stdLibDataPair inner data is... ${stdLibDataPair.first} and ${stdLibDataPair.second}")
//    var stdLibDataTriple = Triple("aaa", 123, "kkk")
//    println(stdLibDataTriple)


//    var a = LateInit()
//    println(a.data) // lateinit 초기화 에러 발생
//    a.setLateInit("초기화")
//    println(a.data)

//    var a = MyFuns()
//    a.getName()
//    MyFuns("새거").getName()
//    var b = MyFuns(1234)

//    noPackageFuns()
//    labelControl()
//    innerFun()
//    labelReturn()
}