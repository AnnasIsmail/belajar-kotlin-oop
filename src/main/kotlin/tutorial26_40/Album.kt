package tutorial26_40

class Album(override val nameGenre: String, override val nameCreator: String, val nameAlbum: String, val totalSong: String) : Genre, Creator{
    override fun getGenre(): String {
        return super.getGenre()
    }

    override fun getCreator(): String {
        return super.getCreator()
    }

    override fun toString(): String{
        return "Name Album: $nameAlbum\nTotal Song: $totalSong"
    }

    inner class Music(val nameMusic: String, val duration: String){
        override fun toString(): String{
            return "Name Music: ${nameMusic}\nDuration: ${duration}\nAlbum Name${this@Album.nameAlbum}"
        }
    }


}