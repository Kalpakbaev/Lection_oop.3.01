package Seminar_03;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.addUser(new User("Ivan", "Ivanov", 24)).addUser(new User("Petr", "Petrov", 25)).addUser(new User("Ira", "Semenova", 18)).addUser(new User("Artyom", "PV", 35)).addUser(new User("Artyom", "Pv", 46));
        // for (User user:personal) {
        //   System.out.println(user);
        //}
       /* for(int i = 0; i < personal.users.size();i++){
            System.out.println(personal.users.get(i));
        }*/
        // List<User> users = personal.toList();
        //  System.out.println("___________________");
        //  System.out.println(users);
        //  System.out.println("___________________");
        //  Collections.sort(users);
        //  System.out.println(users);
        Personal personal2 = new Personal();
        personal2.addUser(new User("Tanya", "Ivanova", 18));
        User user = new User("Lena", "Petrova", 25);
        user.setSubordinate(personal);
        personal2.addUser(user);
        User boss = new User("BOss", "Big", 32);
        boss.setSubordinate(personal2);

        Company company = new Company(boss);
        for (User subordinates : company) {
            System.out.println(subordinates);
        }
    }

}
