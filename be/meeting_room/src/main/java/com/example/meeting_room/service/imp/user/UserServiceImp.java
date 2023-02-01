package com.example.meeting_room.service.imp.user;

import com.example.meeting_room.models.user.User;
import com.example.meeting_room.repository.user.IUserRep;
import com.example.meeting_room.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImp implements IUserService {

    @Autowired
    private IUserRep iUserRep;

    @Override
    public List<User> getAll() {
        return iUserRep.findAll();
    }

    @Override
    public Optional<User> getById(UUID id) {
        return iUserRep.findById(id);
    }

    @Override
    public User save(User entity) {
        return iUserRep.save(entity);
    }

    @Override
    public void deleteById(UUID key) {
        iUserRep.deleteById(key);
    }
}
