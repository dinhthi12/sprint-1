package com.example.meeting_room.service.imp.room;

import com.example.meeting_room.models.room.Room;
import com.example.meeting_room.models.user.User;
import com.example.meeting_room.repository.room.IRoomRep;
import com.example.meeting_room.service.IRoomService;
import com.example.meeting_room.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RoomServiceImp implements IRoomService {
    @Autowired
    private IRoomRep iRoomRep;

    @Override
    public List<Room> getAll() {
        return iRoomRep.findAll();
    }

    @Override
    public Optional<Room> getById(UUID id) {
        return iRoomRep.findById(id);
    }

    @Override
    public Room save(Room entity) {
        return iRoomRep.save(entity);
    }

    @Override
    public void deleteById(UUID key) {
        iRoomRep.deleteById(key);
    }
}
