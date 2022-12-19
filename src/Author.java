import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;



    Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
    void setFirstName() {
        this.firstName = firstName;
    }
    void setLastName() {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Имя:" + firstName + ", " +
                "Фамилие:" + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
