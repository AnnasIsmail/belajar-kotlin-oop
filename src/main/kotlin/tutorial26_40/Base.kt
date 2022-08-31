package tutorial26_40

interface Base {
    fun sayHello(name: String)
    fun sayGoodbye(name: String)
}

class MyBase :Base{
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun sayGoodbye(name: String) {
        println("Hello $name")
    }
}