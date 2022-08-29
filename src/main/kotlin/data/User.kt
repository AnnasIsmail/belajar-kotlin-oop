package data

class User (nameParam: String) {
    private var name = nameParam

    fun getName(): String {
        return this.name;
    }

    fun setName(name: String): Unit{
        this.name = name
    }

    init{
        println("Nama Saya ${this.name}")
    }
}