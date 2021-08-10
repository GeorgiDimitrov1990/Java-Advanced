package EqualityLogic;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        /*int hash = 7;
        hash = 31 * hash + age;
        hash = 31 * hash + (name == null ? 0 : name.hashCode());
        return hash;*/
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age
                && (name.equals(person.name));
    }


    @Override
    public int compareTo(Person person) {
        //return 0; all objects are considered equal for ordering (in TreeSet)
        int result = name.compareTo(person.name);
        return result != 0
                ? result
                : Integer.compare(age, person.age);
    }
}
