package collections


fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 19, 5, 6, 15, 8, 9, 10, 11, 12, 13, 14, 7, 16, 17, 18, 4)
    println(list.slice(1..3))
    //list.add(20)
    val mutableList = list.toMutableList()
    mutableList.add(20)

    mutableList.sortBy { it }
    println(mutableList)

    val listOfElements = mutableListOf(Element(17), Element(5), Element(2), Element(1))
    listOfElements.sortBy { it.value }
    println(listOfElements.map { it.value * 2 })
    println(listOfElements.reduce { e1, e2 -> Element(e1.value + e2.value) }.value)

    println(listOfElements.map { it.publish { e: Element -> printMore(e) } })
}

fun printMore(e: Element) {
    println(if (e.value > 5) "big" else "small")
}

class Element(val value: Int) {

    fun publish(doSomething: (Element) -> Unit) {
        doSomething(this)
    }
}