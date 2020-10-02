package com.endava;

import com.endava.methods.Change;
import com.endava.model.User;
import com.endava.methods.ChangeStatusToActive;
import com.endava.methods.ChangeStatusToBlocked;
import com.endava.enums.UserStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Application {
    Change changeI;
    public static void main(String[] args) {
//In this main method you should do the following:
//- create list of users. To create users - use constructor with all parameters.
//You can use array or ArrayList(prefferably).
//Some of the created users should have status as NEW.

        System.out.println("You can see user details in the list below:");
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("Valentin", "Iacub", 31, "iacub.valentin@icloud.com", UserStatus.ACTIVE, LocalDateTime.of(2020, 10, 2, 16, 15)));
        userList.add(new User("Ion", "Moscalu", 35, "moscalu.ion@gmail.com", UserStatus.NEW, LocalDateTime.of(2020, 10, 2, 16, 20)));
        userList.add(new User("Maxim", "Lesan", 31, "lesan.maxim@yandex.com", UserStatus.BLOCKED, LocalDateTime.of(2000, 1, 1, 00, 15)));
        userList.add(new User("Vitalie", "Bors", 33, "bors.vitalie@icloud.com", UserStatus.INACTIVE, LocalDateTime.of(2020, 2, 2, 15, 01)));
        userList.add(new User("Victor", "Malai", 15, "malai.victor@gmail.com", UserStatus.NEW, LocalDateTime.of(2020, 10, 1, 16, 15)));
        userList.add(new User("Eugen", "Scobioala", 23, "scobioala.eugen@mail.ru", UserStatus.NEW, LocalDateTime.of(2020, 9, 30, 16, 15)));
        userList.add(new User("Sergiu", "Popusoi", 25, "popusoi.sergiu@icloud.com", UserStatus.ACTIVE, LocalDateTime.of(2020, 10, 2, 10, 10)));
        userList.add(new User("Anatol", "Frunza", 25, "frunza.anatol@icloud.com", UserStatus.INACTIVE, LocalDateTime.of(2020, 8, 2, 10, 10)));
        for (User u : userList) {
            System.out.println(u);
        }
//- iterate through the list of users and change status to ACTIVE for NEW users
//whose timestamp when they were registered in the system is older than yesterday.
//You can extract this functionality into a separate method

        System.out.println("\n"+"You can see updated status of users (NEW->ACTIVE), in the list below:");
        Change changeI1 = new ChangeStatusToActive();
        changeI1.checkStatus(userList);
        for (User u : userList) {
            System.out.println(u);
        }
//- BONUS TASK: write a method that will pick up INACTIVE users that where registered more than 1 month ago and set their status to BLOCKED
//
//All resulting lists you should display in console!

        System.out.println("\n"+"You can see updated status of users (INACTIVE-BLOCKED), in the list below:");
        Change changeI2 = new ChangeStatusToBlocked();
        changeI2.checkStatus(userList);
        for (User u : userList) {
            System.out.println(u);
        }

    }
}
