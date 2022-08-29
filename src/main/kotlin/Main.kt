import data.Blog
import data.User

fun main() {
    val user = User("Annas Ismail Muhammad")

    println(user.getName())
    user.setName("Joko Santoso")
    println(user.getName())

    val blog = Blog("Keindahan kota Bekasi" , "Kota Bekasi ternyata memiliki keindahan")
    println(blog.header)
    println(blog.body)
}