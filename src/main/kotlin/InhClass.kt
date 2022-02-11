import test.*

// 상속하려면 부모 클래스가 open 되어있어야 함
class InhClass (val tstVal :Int)
    : MyFuns ("상속") {

    // super 호출은 기본 생성자가 없을 경우만 가능
//    constructor() : super(1)

    constructor(a:Int, b:Int) : this(a+b)

    init {
        println("상속했다!")
    }

    public var noModifVal:Int = 20
        get() = field
        private set

    private var secretVal:Int = 99
        get() = field
        set(value) {
            field = value
        }

    override fun overRidingMethodTest(value1: Int, value2: Int): Int {
//        return super.overRidingMethodTest(value1, value2)
        return value1-value2
    }

    // 프로퍼티 오버라이딩
    override var oneHun: Int
        get() = 500
        set(value) { oneHun = value}
}