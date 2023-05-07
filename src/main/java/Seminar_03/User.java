package Seminar_03;

public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private int age;

    public Personal getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(Personal subordinate) {
        this.subordinate = subordinate;
    }

    private Personal subordinate;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("\nFirst name: %s, Last name: %s, age: %d", firstName, lastName, age);
    }

    @Override
    public int compareTo(User o) {
        int compareNames = this.firstName.compareTo(o.firstName);
        if (compareNames != 0) return compareNames;
        int compareLastNames = this.lastName.compareTo(o.lastName);
        if (compareLastNames != 0) return compareLastNames;
        return this.age - o.age;
    }
}
