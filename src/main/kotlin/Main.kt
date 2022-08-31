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
//    val category = Category("1231JKHAD12903","Joko Santo" , "Personal", "Category ini mengenai personal seseorang")
//
//    println(category.id)
//    println(category.getNameUser())
//    println(category.getName())
//    println(category.getNameCategory())
//    println(category.getDesc())
//
//    category.setContent("Programming" , "Semua Mengenai Programming")
//
//    println()
//    println(category.id)
//    println(category.getNameUser())
//    println(category.getName())
//    println(category.getNameCategory())
//    println(category.getDesc())

//    val blog = Blog("Personal")
//    println(blog.header)
//    println(blog.body)
//    println(blog.id)
//    println(blog.getName().hashCode())

    fun printObject(any: Any){

//        if (any is Category){
//            println(any.getName())
//        }else if(any is Blog){
//            println(any.header)
//        }else{
//            println(any)
//        }

        when(any){
            is Category -> println(any.getName())
            is Blog -> println(any.header)
//            else -> println(any)
            else -> println(any as? String)
        }
    }

//    printObject("Annas")
//    printObject(1)
//    printObject(Category("AHJJHUD21312", "JokSan", "Personal", "Personal seseorang"))
//    printObject(Blog("Belajar Kotlin" , "Belajar Kotlin OOP"))

//    val category1 = Category("7812367123JAHSDS" , "Joko Santoso", "Programming" , "Semua Mengenai Programming")
//    val category2 = Category("7812367123JAHSDS" , "Joko Santoso", "Programming" , "Semua Mengenai Programming")
//    println(category1)
//    println(category1 == category2)

    val user = User("JKGHJKASDG728361" , "Joko Santoso")
    println(user.search)
    user.initAddress("Bekasi")
    println(user.address)
}