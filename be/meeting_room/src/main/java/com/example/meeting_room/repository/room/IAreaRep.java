package com.example.meeting_room.repository.room;

import com.example.meeting_room.models.room.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IAreaRep extends JpaRepository<Area, UUID> {
}
