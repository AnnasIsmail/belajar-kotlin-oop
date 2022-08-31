package tutorial26_40

class Music(override val nameGenre: String, val nameMusic: String, override val nameCreator: String, val duration: String) : Genre, Creator{
    override fun getGenre(): String {
        return super.getGenre()
    }

    override fun getCreator(): String {
        return super.getCreator()
    }

    fun getMusic(): String{
        return "Name Music: ${nameMusic}\nDuration: ${duration}"
    }
}