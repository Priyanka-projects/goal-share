package com.shared_goal_service.shared_goal.Dto;

import com.shared_goal_service.shared_goal.Entity.UserEntity;
import lombok.Data;

import java.util.List;

@Data
public class UserList {
    private List<UserEntity> users;
}
