package com.example.meeting_room.repository.feedback;

import com.example.meeting_room.models.feedback.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IFeedback extends JpaRepository<Feedback, UUID> {
}
