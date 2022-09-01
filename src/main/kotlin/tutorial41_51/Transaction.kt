package tutorial41_51

class Transaction (val name: String, val date: String) {
    operator fun component1(): String= name
    operator fun component2(): String= date
}