package com.example.meeting_room.repository.user;

import com.example.meeting_room.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IUserRep extends JpaRepository<User, UUID> {
}
