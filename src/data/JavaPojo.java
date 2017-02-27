package data;

public class JavaPojo {

    private String username;
    private int userAge;
    private String firstname;
    private String lastname;

    public JavaPojo(String username, int userAge, String firstname, String lastname) {
        this.username = username;
        this.userAge = userAge;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public int getUserAge() {
        return userAge;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        JavaPojo javaPojo = (JavaPojo) o;

        if (userAge != javaPojo.userAge) {
            return false;
        }
        if (username != null ? !username.equals(javaPojo.username) : javaPojo.username != null) {
            return false;
        }
        if (firstname != null ? !firstname.equals(javaPojo.firstname) : javaPojo.firstname != null) {
            return false;
        }
        return lastname != null ? lastname.equals(javaPojo.lastname) : javaPojo.lastname == null;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + userAge;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "JavaPojo{" + "username='" + username + '\'' + ", userAge=" + userAge + ", firstname='" + firstname + '\'' + ", lastname='"
            + lastname + '\'' + '}';
    }
}
