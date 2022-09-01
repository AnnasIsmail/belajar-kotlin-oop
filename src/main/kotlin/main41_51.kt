import tutorial41_51.Login
import tutorial41_51.Logs
import tutorial41_51.MinMax
import tutorial41_51.Transaction
import java.lang.Error
import java.lang.NullPointerException

fun minmax(value1: Int,value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2 , value1)
        else -> MinMax(value1 , value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean): Boolean{
    return callback(login)
}

fun main() {
//    val log = Logs("Login")
//    log.log = "LogOut"
//
//    val transaction = Transaction("Pembayaran Tokopedis", "10 Sept 2022")
//    val (name , date) = transaction
//    println(name)
//    println(date)
//
//    val (min , max) = minmax(1000 , 10000)
//    println(min)
//    println(max)
//
//    val login = Login("annas" , "pw")
//    println(
//        login(login){(username , password) ->
//            username == "annas" && password == "pw"
//        }
//    )
//
//    fun sayHello(name: String?){
////        if (name != null){
////            println("Hello $name")
////        }
////        val nameNull = name?:""
//        val nameNull = name!!
//        println("Hello $nameNull")
//    }
//
//    sayHello("Joko")
//    try {
//        sayHello(null)
//    }catch (error: Exception){
//        println(error.message)
//    }catch (error: NullPointerException){
//        println("Null Exception" + error.message)
//    }

    val log = Logs("Login")
    log.let {
        println(it.log)
    }

    log.also {
        println(it.log)
    }

    log.run {
        println(this.log)
    }

    log.apply {
        println(this.log)
    }
}