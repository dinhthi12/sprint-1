package com.example.meeting_room.service.imp.equipment;

import com.example.meeting_room.models.equipment.Category;
import com.example.meeting_room.repository.equipment.ICategoryRep;
import com.example.meeting_room.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CategoryServiceImp implements ICategoryService {

    @Autowired
    private ICategoryRep iCategoryRep;

    @Override
    public List<Category> getAll() {
        return iCategoryRep.findAll();
    }

    @Override
    public Optional<Category> getById(UUID id) {
        return iCategoryRep.findById(id);
    }

    @Override
    public Category save(Category entity) {
        return iCategoryRep.save(entity);
    }

    @Override
    public void deleteById(UUID key) {
        iCategoryRep.deleteById(key);
    }
}
