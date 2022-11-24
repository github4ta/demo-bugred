package by.academy.hanna;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        User user1 = new User(1, "Anna", "32");
        User user2 = new User(2, "Bob", "25");
        User user3 = new User(3, "Vova", "35");

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        System.out.println(users);
    }
}
