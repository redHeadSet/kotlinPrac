data class DataClassTest(
    var inD1:Int = 10,
    var inD2:Long = 50,
    var inD3:String = "데이터 클래스"){
    var inD4:Long = inD1*inD2
    var inD5:Double = inD2.toDouble()/inD1.toDouble()
}

// 클래스 사용 시 초기화 선택적으로 가능