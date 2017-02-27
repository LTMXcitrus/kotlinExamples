package nullSafety


fun main(args: Array<String>) {
    val a = "abc"
    val b = null
    val example = Example(a, b)

    print(example.bodyclass?.body?.length)
    print(example.bodyclass?.body?.length ?: -1)
    //I want NPE !
    print(example.bodyclass?.body!!.length)
}



class Example(val a: String, val bodyclass: BodyClass?)

class BodyClass(val body: String?)
