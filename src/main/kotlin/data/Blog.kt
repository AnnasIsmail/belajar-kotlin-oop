package data

class Blog(var header: String,var body: String,) {

    constructor(header: String): this (header , "Body Tidak Diisi."){
        println("second constructor single param")
        this.header = header
    }

    constructor(): this ("Header Belum Diisi" , "Body Tidak Diisi."){
        println("secondary constructor no params")
    }

}