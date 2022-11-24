package by.academy.hanna;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static void printUserName(ArrayList<User> users){
        String nameStr = "";
        for (User user: users){
            nameStr += user.getName() + ", ";
        }
        nameStr = nameStr.substring(0, nameStr.length() - 2);
        System.out.println(nameStr);
    }
}
