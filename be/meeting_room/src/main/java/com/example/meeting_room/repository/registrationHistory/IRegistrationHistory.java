package com.example.meeting_room.repository.registrationHistory;

import com.example.meeting_room.models.registrationHistory.RegistrationHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IRegistrationHistory extends JpaRepository<RegistrationHistory, UUID> {
}
