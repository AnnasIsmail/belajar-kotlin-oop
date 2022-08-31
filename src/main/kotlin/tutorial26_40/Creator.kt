package tutorial26_40

interface Creator {
    val nameCreator: String
    fun getCreator(): String{
        return "Name Creator: $nameCreator"
    }
}