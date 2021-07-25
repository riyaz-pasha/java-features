package java8.methodReferences;

import java.util.Arrays;
import java.util.List;

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    void printUserInfo() {
        System.out.println(toString());
    }
}

public class ReferenceToConstructor {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("user1", "user2", "user3");
        list.stream()
                .map(User::new)
                .forEach(User::printUserInfo);

    }
}
