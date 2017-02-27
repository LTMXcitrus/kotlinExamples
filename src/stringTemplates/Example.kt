package stringTemplates

fun main(args: Array<String>) {
    val example = Example("JackTheBeast", 32, "Jack", "The beast")
    print(example)
    print("Hello ${example.username}")
}


class Example(val username: String,
              val userAge: Int,
              val firstname: String,
              val lastName: String){


    override fun toString(): String{
        return "My name is $firstname $lastName, I am $userAge"
    }
}
