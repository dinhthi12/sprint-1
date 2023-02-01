package com.example.meeting_room.repository.user;

import com.example.meeting_room.models.user.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRep extends JpaRepository<Account,String> {
}
