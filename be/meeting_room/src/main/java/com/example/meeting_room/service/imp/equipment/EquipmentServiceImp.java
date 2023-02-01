package com.example.meeting_room.service.imp.equipment;

import com.example.meeting_room.models.equipment.Equipment;
import com.example.meeting_room.repository.equipment.IEquipmentRep;
import com.example.meeting_room.service.IEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EquipmentServiceImp implements IEquipmentService {

    @Autowired
    private IEquipmentRep iEquipmentRep;

    @Override
    public List<Equipment> getAll() {
        return iEquipmentRep.findAll();
    }

    @Override
    public Optional<Equipment> getById(UUID id) {
        return iEquipmentRep.findById(id);
    }

    @Override
    public Equipment save(Equipment entity) {
        return iEquipmentRep.save(entity);
    }

    @Override
    public void deleteById(UUID key) {
        iEquipmentRep.deleteById(key);
    }
}
