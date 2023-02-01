package com.example.meeting_room.service.imp.user;

import com.example.meeting_room.models.user.Account;
import com.example.meeting_room.repository.user.IAccountRep;
import com.example.meeting_room.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AccountServiceImp implements IAccountService {

    @Autowired
    private IAccountRep iAccountRep;

    @Override
    public List<Account> getAll() {
        return iAccountRep.findAll();
    }

    @Override
    public Optional<Account> getById(String id) {
        return iAccountRep.findById(id);
    }

    @Override
    public Account save(Account entity) {
        return iAccountRep.save(entity);
    }

    @Override
    public void deleteById(String key) {
        iAccountRep.deleteById(key);
    }
}
