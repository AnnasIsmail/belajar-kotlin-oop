import data.Blog
import data.Category
import data.User

fun main() {
//    val user = User("Annas Ismail Muhammad")
//
//    println(user.getName())
//    user.setName("Joko Santoso")
//    println(user.getName())
//    user.setName()
//    println(user.getName())
//
//    val blog = Blog("Keindahan kota Bekasi" , "Kota Bekasi ternyata memiliki keindahan")
//    println(blog.header)
//    println(blog.body)
//
//    val blog2 = Blog("Keindahan kota Bekasi" )
//    val blog3 = Blog()
//
//    val category = Category()
//    val category2 = Category("Personal")
//    val category3 = Category("Web Programming" , "This is description Web Programming")
    val category = Category("1231JKHAD12903","Joko Santo" , "Personal", "Category ini mengenai personal seseorang")

    println(category.id)
    println(category.getNameUser())
    println(category.getName())
    println(category.getNameCategory())
    println(category.getDesc())

    category.setContent("Programming" , "Semua Mengenai Programming")

    println()
    println(category.id)
    println(category.getNameUser())
    println(category.getName())
    println(category.getNameCategory())
    println(category.getDesc())
}