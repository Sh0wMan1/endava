package com.endava.methods;

import com.endava.mainData.User;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ChangeStatusToBlocked {
        public void checkStatus(ArrayList<User> alu) {
            UserStatus us = UserStatus.INACTIVE;
            for (User u : alu) {
                if (u.getStatus() == us && u.getTimestamp().isBefore(LocalDateTime.now().minusMonths(1))) {
                    u.setStatus(UserStatus.BLOCKED);
//                System.out.println(u.toString());
                }
            }
        }
    }