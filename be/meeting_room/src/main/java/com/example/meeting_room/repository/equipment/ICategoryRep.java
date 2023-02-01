package com.example.meeting_room.repository.equipment;

import com.example.meeting_room.models.equipment.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ICategoryRep extends JpaRepository<Category, UUID> {
}
