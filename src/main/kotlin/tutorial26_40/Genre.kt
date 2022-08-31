package tutorial26_40

interface Genre{
    val nameGenre: String
    fun getGenre(): String{
        return "Genre Music: $nameGenre"
    }
}