package com.endava.methods;

import com.endava.mainData.User;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ChangeStatusToActive {
    public void checkStatus(ArrayList<User> alu) {
        UserStatus us = UserStatus.NEW;
        for (User u : alu) {
            if (u.getStatus() == us && u.getTimestamp().isBefore(LocalDateTime.now().minusDays(1))) {
                u.setStatus(UserStatus.ACTIVE);
//                System.out.println(u.toString());

            }
        }
    }
}
