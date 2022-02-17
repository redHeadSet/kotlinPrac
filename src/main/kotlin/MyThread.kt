class MyThread(val threadName:String = "default") : Thread() {
    override fun run() {
        println("running ${threadName}...")
        super.run()
    }
}