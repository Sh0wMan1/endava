package com.endava.methods;

import com.endava.enums.UserStatus;
import com.endava.model.User;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ChangeStatusToBlocked implements Change {
    public void checkStatus(ArrayList<User> alu) {
        for (User u : alu) {
            if (u.getStatus().equals(UserStatus.INACTIVE) && u.getTimestamp().isBefore(LocalDateTime.now().minusMonths(1))) {
                u.setStatus(UserStatus.BLOCKED);
            }
        }
    }
}