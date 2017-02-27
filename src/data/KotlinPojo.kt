package data

data class KotlinPojo(val username: String,
                      val userAge: Int,
                      val firstname: String,
                      val lastName: String) {


    fun copyExample(name: String = this.username,
                    age: Int = this.userAge,
                    firstname: String = this.firstname,
                    lastName: String = this.lastName) = KotlinPojo(name, age, firstname, lastName)

    fun getTwoJacks() {

        val jack = KotlinPojo("JackTheBeast", 1, "Jack", "The beast")
        val olderJack = jack.copy(userAge = 2)
    }

}


