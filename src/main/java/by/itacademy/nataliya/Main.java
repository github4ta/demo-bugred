package by.itacademy.nataliya;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1,"Bob1","48");
        User user2 = new User(2,"Bob2","49");
        User user3 = new User(3,"Bob3","44");
        User user4 = new User(4,"Bob4","41");
        User user5 = new User(5,"Bob5","47");
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        System.out.println(users);
    }
}
