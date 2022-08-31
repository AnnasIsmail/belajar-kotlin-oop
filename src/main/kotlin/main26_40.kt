import tutorial26_40.*
import java.util.Arrays
import java.util.StringJoiner
import UserClass as UserClass1

//fun Music.getNameMusic(): String{
//    return "Music Name: ${this.nameMusic}"
//}
//
//val Music.upperName: String get() = this.nameMusic.uppercase()
//
//data class User(
//    val Name: String,
//    val Age: Int
//)
//
//interface Action{
//    fun action()
//}
//
//fun actionPrint(action: Action) {
//    action.action()
//}


object user {
    val name = "Joko Santo"
    val address = "Bekasi Timur"

    fun printUser(){
        println("Nama: $name Alamat: $address From Object")
    }
}

class User{

    companion object {
        val name = "Joko Santo"
        val address = "Bekasi Timur"

        fun printUser(){
            println("Nama: $name Alamat: $address From Class")
        }
    }

}

typealias UserClass = User

inline class Login(val isLogin: Boolean){
    override fun toString(): String{
        return when(isLogin){
            true -> "Sudah Login"
            else -> "Belum Login"
        }
    }

    fun toUp(): String{
        val hasilLogin = toString()
        return hasilLogin.uppercase()
    }

}

class Delegate(val base: Base) :Base by base

class CobaLazy{
    val nameLazy: String by lazy {
        println("Lazy property is Called")
        "Annas"
    }
}

fun main() {
//    val music = Music("Pop", "Talking to myself", "Brb.", "3:22")
//    println(music.getGenre())
//    println(music.getCreator())
//    println(music.getMusic())
//    println()
//    println(music.getNameMusic())
//    println(music.getCreator())
//    println(music.upperName)
//
//    val user = User("Joko", 34)
//    println(user)
//
//    val user2 = user.copy("Santo")
//    println(user2)

//    val album = Album("Pop", "Brb.", "Mix Brb.", "13")
//    val music = album.Music("Talking to myself", "3:22")
//    println(album)
//    println(album.getGenre())
//    println(album.getCreator())
//    println()
//    println(music)
//
//    actionPrint(object : Action {
//        override fun action() = println("Action Anon Class")
//    })

//    val male = Gender.MALE
//    val female = Gender.FEMALE
//    val all: Array<Gender> = Gender.values()
//
//    println(male)
//    println(female)
//    println(all.toList())

//    UserClass.printUser()

//    val login = Login(true)
//    println(login.toUp())
//
//    val base = MyBase()
//    base.sayHello("Eko")
//
//    val myBase = MyBase()
//    val baseDelegate = Delegate(myBase)
//    baseDelegate.sayHello("santo")
//    baseDelegate.sayGoodbye("Mimin")
    val cobaLazy = CobaLazy()
    println(cobaLazy.nameLazy)
    println(cobaLazy.nameLazy)
    println(cobaLazy.nameLazy)
}