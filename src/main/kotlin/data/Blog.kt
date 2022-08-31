package data

class Blog : User {

    var header: String = ""
    var body: String = ""

    constructor(header: String, body: String, id: String , name:String) : super(id , name){

    }

    constructor(header: String, body: String,) : super("12761JGH8223" , "Joko Santoso"){
        this.header = header
        this.body = body
    }

    constructor(header: String): this (header , "Body Tidak Diisi."){
        this.header = header
        this.body = "Body Tidak Diisi."
    }

    constructor(): this ("Header Belum Diisi" , "Body Tidak Diisi."){
        this.header = "Header Belum Diisi"
        this.body = "Body Tidak Diisi."
    }

}