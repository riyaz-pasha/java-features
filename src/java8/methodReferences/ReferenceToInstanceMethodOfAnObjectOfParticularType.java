package java8.methodReferences;

import java.util.Arrays;
import java.util.List;

class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFullName() {
        return firstName + " " + lastName;
    }
}

public class ReferenceToInstanceMethodOfAnObjectOfParticularType {
    public static void main(String[] args) {
        Person person1 = new Person("Riyaz", "Mohammed");
        Person person2 = new Person("Riyaz Pasha", "Mohammed");

        List<Person> people = Arrays.asList(person1, person2);

        people.stream()
                .map(Person::getFullName)
                .forEach(System.out::println);
    }
}
