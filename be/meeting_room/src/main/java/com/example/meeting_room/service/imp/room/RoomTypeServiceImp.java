package com.example.meeting_room.service.imp.room;

import com.example.meeting_room.models.room.RoomType;
import com.example.meeting_room.repository.room.IRoomTypeRep;
import com.example.meeting_room.service.IRoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RoomTypeServiceImp implements IRoomTypeService {
@Autowired
private IRoomTypeRep iRoomTypeRep;


    @Override
    public List<RoomType> getAll() {
        return iRoomTypeRep.findAll();
    }

    @Override
    public Optional<RoomType> getById(UUID id) {
        return iRoomTypeRep.findById(id);
    }

    @Override
    public RoomType save(RoomType entity) {
        return iRoomTypeRep.save(entity);
    }

    @Override
    public void deleteById(UUID key) {
        iRoomTypeRep.deleteById(key);
    }
}
