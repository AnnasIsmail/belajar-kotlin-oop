package data

open class User (idParam: String, nameParam: String) {

    private var name: String = nameParam
    open var id: String = idParam

    open fun getName(): String {
        return this.name;
    }

    fun setName(name: String) {
        this.name = name
    }

    fun setName() {
        this.name = ""
    }

//    init{
//        println("Nama Saya ${this.name} (Ini adalah constructor User)")
//    }
}