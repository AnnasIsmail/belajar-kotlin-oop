package data

class Category(override var id: String, private var nameUser: String, private var nameCategory: String, private var desc: String ) : User(id, nameUser){

    fun setContent(nameCategory: String, desc: String){
        this.nameCategory = nameCategory
        this.nameUser = super.id
    }

    override fun getName(): String {
        return "User Name: ${this.nameUser} Category Name: ${this.nameCategory} ";
    }

    fun getNameUser():String {
        return nameUser
    }

    fun getNameCategory():String {
        return nameCategory
    }

    fun getDesc():String {
        return desc
    }
}