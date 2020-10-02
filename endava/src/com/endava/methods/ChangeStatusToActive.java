package com.endava.methods;

import com.endava.enums.UserStatus;
import com.endava.model.User;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ChangeStatusToActive implements Change {
    public void checkStatus(ArrayList<User> alu) {
        for (User u : alu) {
            if (u.getStatus().equals(UserStatus.NEW) && u.getTimestamp().isBefore(LocalDateTime.now().minusDays(1))) {
                u.setStatus(UserStatus.ACTIVE);
            }
        }
    }
}
