package pairTriple


fun main(args: Array<String>) {
    val jack = PairExample(Pair("Jack", "The beast"))
    print("My name is ${jack.nameAndLastname.first}")
    val jackWithAge = TripleExample(Triple("Jack", "The beast", 32))
    print(jackWithAge.nameAndLastnameAndAge.third)
}

class PairExample(val nameAndLastname:Pair<String, String>)

class TripleExample(val nameAndLastnameAndAge:Triple<String, String, Int>)