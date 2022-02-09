// default package
fun noPackageFuns() {
    println("No Package function")
}

fun labelControl() {
    label1@ for (idx1 in 1..10) {
        println("idx1 is $idx1")

        label2@ for (idx2 in 1..10) {
            print("$idx2, ")

            if(idx2 == 8)
                break@label1
        }
    }
}

fun innerFun() {
    var ints = listOf(1, 2, 3, 4, 5)

    // 익명 함수 처리 - 1,2,4,5 출력
    ints.forEach (
        fun(each: Int) {
            if(each == 3) return
            print(each)
        } )
    println()

    // 람다 처리 - 1,2 만 출력 후 innerFun 종료
//    ints.forEach{
//            if(it == 3) return
//            print(it)
//        }
//    println()

    // 람다 처리 - 위 함수 종료 개선
    ints.forEach{
            if(it == 3) return@forEach
            print(it)
        }
    println()

    // 람다 처리 - 1,2,4,5 출력
    ints.forEach label@ {
            if(it == 3) return@label
            print(it)
        }

    println("""
        
        End""".trimIndent())
}

fun labelReturn() {
    var intList = listOf(1, 2, 3, 4, 5)

    val result = intList.map {
        if(it == 3){
            return@map "zero"
        }
        "$it"
    }

    println(result)
}