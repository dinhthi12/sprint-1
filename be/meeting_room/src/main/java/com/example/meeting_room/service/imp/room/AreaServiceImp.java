package com.example.meeting_room.service.imp.room;

import com.example.meeting_room.models.room.Area;
import com.example.meeting_room.repository.room.IAreaRep;
import com.example.meeting_room.service.IAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AreaServiceImp implements IAreaService {
    @Autowired
    private IAreaRep iAreaRep;

    @Override
    public List<Area> getAll() {
        return iAreaRep.findAll();
    }

    @Override
    public Optional<Area> getById(UUID id) {
        return iAreaRep.findById(id);
    }

    @Override
    public Area save(Area entity) {
        return iAreaRep.save(entity);
    }

    @Override
    public void deleteById(UUID key) {
        iAreaRep.deleteById(key);
    }
}
